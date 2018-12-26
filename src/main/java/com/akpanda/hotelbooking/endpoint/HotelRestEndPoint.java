package com.akpanda.hotelbooking.endpoint;

import com.akpanda.hotelbooking.model.Hotel;
import com.akpanda.hotelbooking.service.dao.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class HotelRestEndPoint {

    @Autowired
    HotelDao hotelDao;

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels() {
       return hotelDao.findAllHotels();
    }

    @GetMapping("/hotel/{hotelName}")
    public List<Hotel> getHotelByName(@PathVariable("hotelName") String hotelName) {
        return hotelDao.findHotelByName(hotelName);
    }
}
