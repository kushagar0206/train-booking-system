package com.kushagar0206.trainbookingsystem.service;

import com.kushagar0206.trainbookingsystem.dto.BookingDto;
import java.util.List;

public interface BookingService {

    public String addBooking(BookingDto bookingDto);

    public BookingDto getBookingById(Long email);

    public List<BookingDto> getAllBooking();

    public String deleteBookingById(Long id);

}
