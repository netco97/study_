package com.sm.main;

public class RestaurantDTO {
	private int no;
	private String name;
	private String menu;
	private String place;
	public RestaurantDTO(int no, String name, String menu, String place) {
		super();
		this.no = no;
		this.name = name;
		this.menu = menu;
		this.place = place;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
}
