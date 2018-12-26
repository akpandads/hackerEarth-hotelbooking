package com.akpanda.hotelbooking.service;

import com.akpanda.hotelbooking.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<Hotel,Long> {
}
