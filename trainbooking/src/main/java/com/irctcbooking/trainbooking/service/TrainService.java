package com.irctcbooking.trainbooking.service;

import java.util.List;

import com.irctcbooking.trainbooking.model.TrainModel;

public interface TrainService {
	List<TrainModel> saveTrainDetail(TrainModel tm);
	
	List<TrainModel> getTrainDetail(String bookingdate);

}
