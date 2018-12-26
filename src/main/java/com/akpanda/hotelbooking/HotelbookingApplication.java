package com.akpanda.hotelbooking;

import com.akpanda.hotelbooking.service.HotelRepository;
import com.akpanda.hotelbooking.service.dao.HotelDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.akpanda.hotelbooking.service")
@EntityScan("com.akpanda.hotelbooking.model")
public class HotelbookingApplication implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(HotelbookingApplication.class);

    @Autowired
    HotelDao hotelDao;

    public static void main(String[] args) {
        SpringApplication.run(HotelbookingApplication.class, args);
        log.info("Hotel Booking start");
    }

    @Override
    public void run(String... args) throws Exception {
        hotelDao.findAllHotels();
    }
}

