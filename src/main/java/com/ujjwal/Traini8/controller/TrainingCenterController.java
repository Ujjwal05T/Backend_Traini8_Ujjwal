package com.ujjwal.Traini8.controller;

import com.ujjwal.Traini8.model.TrainingCenterModel;
import com.ujjwal.Traini8.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService service;

    @GetMapping("/api/get-centers")
    public ResponseEntity<List<TrainingCenterModel>> getAllTrainingCenters() {
        List<TrainingCenterModel> centers = service.getAllTrainingCenters();
        return new ResponseEntity<>(centers, HttpStatus.OK);
    }

    @PostMapping("/api/add-center")
    public ResponseEntity<TrainingCenterModel> createTrainingCenter(@Valid @RequestBody TrainingCenterModel trainingCenterModel) {
        TrainingCenterModel createdCenter = service.createTrainingCenter(trainingCenterModel);
        return new ResponseEntity<>(createdCenter, HttpStatus.CREATED);
    }
}
