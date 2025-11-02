package com.kushagar0206.trainbookingsystem.service;

import com.kushagar0206.trainbookingsystem.dto.TrainDto;
import java.util.List;

public interface TrainService {

    public String addTrain(TrainDto trainDto);

    public TrainDto getTrainById(Long id);

    public List<TrainDto> getAllTrain();

    public String deleteTrainById(Long id);


}
