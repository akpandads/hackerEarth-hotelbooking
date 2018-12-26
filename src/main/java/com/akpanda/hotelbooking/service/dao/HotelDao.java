package com.akpanda.hotelbooking.service.dao;

import com.akpanda.hotelbooking.model.Hotel;
import com.akpanda.hotelbooking.service.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.sql.DataSource;

@Service
public class HotelDao {

    private static Logger logger = LoggerFactory.getLogger(HotelDao .class);
    @Autowired
    DataSource dataSource;

    @Autowired
    HotelRepository hotelRepository;

    public void findAllHotels(){
        Iterable<Hotel> hotels = hotelRepository.findAll();
        for(Hotel hotel:hotels){
            logger.info(hotel.getHotelName());
        }
    }

}
