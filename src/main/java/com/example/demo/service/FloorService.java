package com.example.demo.service;

import com.example.demo.dto.FloorDTO;

public interface FloorService {

//	public void addFloor(int fId,FloorDTO floorDTO);

	public void addFloorWithBuildingId(FloorDTO floorDTO);
}
