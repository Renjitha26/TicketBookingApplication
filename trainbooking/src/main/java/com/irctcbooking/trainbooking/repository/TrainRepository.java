package com.irctcbooking.trainbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.irctcbooking.trainbooking.model.TrainEntity;

@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Integer> {
	
	@Query("from TrainEntity where bookingdate='27-09-2023'")
	List<TrainEntity> findByDate(String bookingdate);

}
