package com.kushagar0206.trainbookingsystem.service.impl;

import com.kushagar0206.trainbookingsystem.dto.BookingDto;
import com.kushagar0206.trainbookingsystem.model.Booking;
import com.kushagar0206.trainbookingsystem.repository.BookingRepository;
import com.kushagar0206.trainbookingsystem.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {

    BookingRepository bookingRepository;

    public BookingDto entityToDto(Booking booking) {
        return new BookingDto(booking.getTrainName(), booking.getTrainNumber(), booking.getUserEmail(), booking.getPassengerName(), booking.getSeatsBooked(), booking.getAmountPaid(), booking.getStatus(), booking.getBookedDate());
    }

    public Booking dtoToEntity(BookingDto bookingDto) {
       return new Booking(bookingDto.getTrainName(), bookingDto.getTrainNumber(), bookingDto.getUserEmail(), bookingDto.getPassengerName(), bookingDto.getSeatsBooked(), bookingDto.getAmountPaid(), bookingDto.getStatus());
    }

    @Override
    public String addBooking(BookingDto bookingDto) {
        Booking booking1 = dtoToEntity(bookingDto);
        bookingRepository.save(booking1);
        return "Saved...";
    }

    @Override
    public BookingDto getBookingById(Long id) {
        return bookingRepository.findById(id)
                .map(this::entityToDto)
                .orElse(null);
    }

    @Override
    public List<BookingDto> getAllBooking() {
        return bookingRepository.findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public String deleteBookingById(Long id) {
        bookingRepository.deleteById(id);
        return "Deleted";
    }

}
