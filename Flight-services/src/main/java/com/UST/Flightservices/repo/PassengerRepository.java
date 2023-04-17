package com.UST.Flightservices.repo;

import com.UST.Flightservices.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<PassengerInfo,Long> {
}
