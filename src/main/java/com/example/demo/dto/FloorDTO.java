package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Floor;
import com.example.demo.entity.Room;

public class FloorDTO {

	private int buildingId;

	private int floorNo;
	private int noOfRooms;

	public int getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

//	List<Room> rooms;
//
//	public List<Room> getRooms() {
//		return rooms;
//	}
//
//	public void setRooms(List<Room> rooms) {
//		this.rooms = rooms;
//	}

}
