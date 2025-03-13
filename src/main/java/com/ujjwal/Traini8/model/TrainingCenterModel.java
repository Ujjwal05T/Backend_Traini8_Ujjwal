package com.ujjwal.Traini8.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenterModel {
    @Size(max=40,message = "Center name cannot exceed 40 characters")
    private String centerName;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "center_seq")
    @SequenceGenerator(name = "center_seq", sequenceName = "center_sequence", allocationSize = 1)
    private int id;
    @Size(min=12 , max=12)
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be 12 alphanumeric characters")
    private String centerCode;
    @Embedded
    private Address address;
    private List<String> courses;
    @Column(nullable = false, updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd' Time: 'HH:mm")
    private Date createdOn;
    private int capacity;
    @Size(min = 10, max = 10, message = "Contact number must be exactly 10 digits")
    private String contactNumber;
    @Email(message = "Please provide a valid email address")
    private String email;

    @PrePersist
    protected void onCreate() {
        createdOn = new Date();
    }
}
