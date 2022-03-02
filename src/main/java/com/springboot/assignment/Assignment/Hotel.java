package com.springboot.assignment.Assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Hotel")
public class Hotel {
	 	@Id
	    private Integer Hotel_id;
	 	
	    private String Hotel_name;
	    private Integer Hotel_price;
	    private Integer Hotel_rating;
	    private String Hotel_location;
		public Hotel() {
			
		}
		public Integer getHotel_id() {
			return Hotel_id;
		}
		public void setHotel_id(Integer hotel_id) {
			Hotel_id = hotel_id;
		}
		public String getHotel_name() {
			return Hotel_name;
		}
		public void setHotel_name(String hotel_name) {
			Hotel_name = hotel_name;
		}
		public Integer getHotel_price() {
			return Hotel_price;
		}
		public void setHotel_price(Integer hotel_price) {
			Hotel_price = hotel_price;
		}
		public Integer getHotel_rating() {
			return Hotel_rating;
		}
		public void setHotel_rating(Integer hotel_rating) {
			Hotel_rating = hotel_rating;
		}
		public String getHotel_location() {
			return Hotel_location;
		}
		public void setHotel_location(String hotel_location) {
			Hotel_location = hotel_location;
		}
		@Override
		public String toString() {
			return "Hotel [Hotel_id=" + Hotel_id + ", Hotel_name=" + Hotel_name + ", Hotel_price=" + Hotel_price
					+ ", Hotel_rating=" + Hotel_rating + ", Hotel_location=" + Hotel_location + "]";
		}

	    
		
	

}

