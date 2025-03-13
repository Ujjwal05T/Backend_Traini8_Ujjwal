package com.ujjwal.Traini8.service;

import com.ujjwal.Traini8.model.TrainingCenterModel;
import com.ujjwal.Traini8.repository.TrainingCenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {
    @Autowired
    private TrainingCenterRepo trainingCenterRepo;

    public List<TrainingCenterModel> getAllTrainingCenters() {
        return trainingCenterRepo.findAll();
    }

    public TrainingCenterModel createTrainingCenter(TrainingCenterModel trainingCenterModel) {
        return trainingCenterRepo.save(trainingCenterModel);
    }
}
