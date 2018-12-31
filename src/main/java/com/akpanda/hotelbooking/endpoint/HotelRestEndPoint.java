package com.akpanda.hotelbooking.endpoint;

import com.akpanda.hotelbooking.model.Hotel;
import com.akpanda.hotelbooking.service.dao.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
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
