package com.kushagar0206.trainbookingsystem.controller;

import com.kushagar0206.trainbookingsystem.dto.BookingDto;
import com.kushagar0206.trainbookingsystem.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/booking")
@AllArgsConstructor
@NoArgsConstructor
public class BookingController {

    private BookingService bookingService;

    @PostMapping("/add")
    public String addBooking(@RequestBody BookingDto bookingDto) {
     return bookingService.addBooking(bookingDto);
    }

    @GetMapping("/get/{id}")
    public BookingDto getBookingById(@RequestParam Long id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping("/get/all")
    public List<BookingDto> getAllBooking() {
        return bookingService.getAllBooking();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBookingById(@PathVariable Long id) {
       return bookingService.deleteBookingById(id);
    }

}
