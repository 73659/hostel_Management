package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FloorDTO;
import com.example.demo.service.FloorService;

@RestController
public class FloorController {

	@Autowired
	FloorService floorService;

	@PostMapping("floorWithBuildingId")
	public ResponseEntity addFloorWithBuildingId(@RequestBody FloorDTO floorDTO) {
		floorService.addFloorWithBuildingId(floorDTO);
		return new ResponseEntity("Floor Added", HttpStatus.CREATED);
	}

//	@PostMapping("floor/{fId}")
//	public ResponseEntity addFloor(@PathVariable int fId, @RequestBody FloorDTO floorDTO) {
//		floorService.addFloor(fId, floorDTO);
//		return new ResponseEntity("Floor Added", HttpStatus.CREATED);
//	}
}
