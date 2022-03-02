package com.springboot.assignment.Assignment;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HotelService {
	@Autowired
    HotelRepository hotelRepository;
	@Transactional(readOnly = false)
	 public List<Hotel> getAllHotels() {
		 System.out.println("inside"+hotelRepository);
	        return hotelRepository.findAll();
	    }
    
    public String createHotel(Hotel hotelreq) {
        Hotel hotel = new Hotel();
        
        hotel.setHotel_id(hotelreq.getHotel_id());
        hotel.setHotel_name(hotelreq.getHotel_name());
        hotel.setHotel_price(hotelreq.getHotel_price());
        hotel.setHotel_rating(hotelreq.getHotel_rating());
        hotel.setHotel_location(hotelreq.getHotel_location());     
        hotelRepository.save(hotel);
        return ("New Hotel created successfully");

    }
}
