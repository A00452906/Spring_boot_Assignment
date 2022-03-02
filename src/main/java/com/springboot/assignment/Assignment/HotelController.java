package com.springboot.assignment.Assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("/")
public class HotelController {
	 @Autowired
     HotelService hotelService;	
  
@GetMapping("/HotelList")
public ResponseEntity<List<Hotel>> getAllHotels() {
	System.out.println("inside");
    List<Hotel> hotelList = hotelService.getAllHotels();
   return new ResponseEntity<>(hotelList, HttpStatus.OK);
}

@PostMapping("/HotelAdd")
public ResponseEntity addEmployee( @RequestBody Hotel hotel) {
    String message = hotelService.createHotel(hotel);
    return new ResponseEntity<>(message, HttpStatus.CREATED);
}
}
