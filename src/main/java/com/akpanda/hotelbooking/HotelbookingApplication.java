package com.akpanda.hotelbooking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelbookingApplication {

    private static Logger log = LoggerFactory.getLogger(HotelbookingApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(HotelbookingApplication.class, args);
        log.info("Hotel Booking start");
    }

}

