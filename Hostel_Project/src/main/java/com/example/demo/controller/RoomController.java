package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RoomDTO;
import com.example.demo.service.RoomService;

@RestController
public class RoomController {

	@Autowired
	RoomService roomService;

	@PostMapping("roomWithFloorId")
	public ResponseEntity addRoomWithFloorId(@RequestBody RoomDTO roomDTO) {
		roomService.addRoomWithFloorId(roomDTO);
		return new ResponseEntity("Room added", HttpStatus.CREATED);
	}

	// @PostMapping("room/{roomId}")
//	public ResponseEntity addRoom(@PathVariable int roomId, @RequestBody RoomDTO roomDTO) {
//		roomService.addRoom(roomId, roomDTO);
//		return new ResponseEntity("Room added", HttpStatus.CREATED);
//	}
}
