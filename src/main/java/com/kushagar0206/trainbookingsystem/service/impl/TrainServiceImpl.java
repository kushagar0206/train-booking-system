package com.kushagar0206.trainbookingsystem.service.impl;

import com.kushagar0206.trainbookingsystem.dto.TrainDto;
import com.kushagar0206.trainbookingsystem.model.Train;
import com.kushagar0206.trainbookingsystem.repository.TrainRepository;
import com.kushagar0206.trainbookingsystem.service.TrainService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
@NoArgsConstructor
@AllArgsConstructor
public class TrainServiceImpl implements TrainService {

    TrainRepository trainRepository;

    public TrainDto entityToDto(Train train) {
        return new TrainDto(train.getId(), train.getTrainName(), train.getTrainNumber(), train.getSource(), train.getDestination(), train.getTotalSeats(), train.getAvailableSeats());
    }

    public Train dtoToEntity(TrainDto trainDto) {
        return new Train(trainDto.getTrainName(), trainDto.getTrainNumber(), trainDto.getSource(), trainDto.getDestination(), trainDto.getTotalSeats(), trainDto.getAvailableSeats());
    }

    @Override
    public String addTrain(TrainDto trainDto){
        Train train1 = dtoToEntity(trainDto);
        trainRepository.save(train1);
        return "Train Added";
    }

    @Override
    public TrainDto getTrainById(Long id) {
        return trainRepository.findById(id)
                .map(this::entityToDto)
                .orElse(null);
    }

    @Override
    public List<TrainDto> getAllTrain() {
        return trainRepository.findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public String deleteTrainById(Long id) {
       trainRepository.deleteById(id);
       return "Train Deleted";
    }

}
