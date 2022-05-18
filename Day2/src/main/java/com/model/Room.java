package com.model;

public class Room {

	private int roomNo;
	private String roomType;
	private float roomArea;
	private boolean acMachine;
	
	
	public Room(int roomNo, String roomType, float roomArea, boolean acMachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public float getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}
	public boolean isAcMachine() {
		return acMachine;
	}
	public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}
	
	
}
