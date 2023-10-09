package com.irctcbooking.trainbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctcbooking.trainbooking.model.TrainModel;
import com.irctcbooking.trainbooking.service.TrainService;

@RestController
public class TrainController {
	@Autowired
	TrainService trainService;
	
	@GetMapping("/getTrainDetail")
	List<TrainModel> getTrainDetail(@RequestParam(value = "bookingdate")String bookingdate){
		List<TrainModel> trainList = trainService.getTrainDetail(bookingdate);
		return trainList;
		
	}
	
	
	@PostMapping("/addTrainDetail")
	List<TrainModel> addDetail(@RequestBody TrainModel tm){
		List<TrainModel> trainList = trainService.saveTrainDetail(tm);
		return trainList;
	}

}
