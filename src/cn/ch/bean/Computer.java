package cn.ch.bean;

public class Computer {
	private Integer  computer_id;
	private String computer_name;
	private String memory;
	private String cup;
	private String videocard;
	private String display;
	private String hdd;
	private String price;
	public Integer getComputer_id() {
		return computer_id;
	}
	public void setComputer_id(Integer computer_id) {
		this.computer_id = computer_id;
	}
	public String getComputer_name() {
		return computer_name;
	}
	public void setComputer_name(String computer_name) {
		this.computer_name = computer_name;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getCup() {
		return cup;
	}
	public void setCup(String cup) {
		this.cup = cup;
	}
	public String getVideocard() {
		return videocard;
	}
	public void setVideocard(String videocard) {
		this.videocard = videocard;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [computer_id=" + computer_id + ", computer_name=" + computer_name + ", memory=" + memory
				+ ", cup=" + cup + ", videocard=" + videocard + ", display=" + display + ", hdd=" + hdd + ", price="
				+ price + "]";
	}
	
	
	
}
