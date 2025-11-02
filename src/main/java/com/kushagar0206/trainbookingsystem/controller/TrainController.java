package com.kushagar0206.trainbookingsystem.controller;

import com.kushagar0206.trainbookingsystem.dto.TrainDto;
import com.kushagar0206.trainbookingsystem.service.TrainService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/train")
@AllArgsConstructor
@NoArgsConstructor
public class TrainController {

    private TrainService trainService;

    @PostMapping("/add")
    public String addTrain(@RequestBody TrainDto trainDto){
       return trainService.addTrain(trainDto);
    }

    @GetMapping("/get/{id}")
    public TrainDto getTrainById(@PathVariable Long id){
        return trainService.getTrainById(id);
    }

    @GetMapping("/get/all")
    public List<TrainDto> getAllTrain() {
        return trainService.getAllTrain();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTrainById(@PathVariable Long id){
        return trainService.deleteTrainById(id);
    }

}