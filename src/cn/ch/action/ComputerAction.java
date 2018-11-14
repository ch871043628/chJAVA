package cn.ch.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.ch.bean.Computer;
import service.ComputerService;

public class ComputerAction extends ActionSupport{
	private Computer computer;

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	private ComputerService service;

	public void setService(ComputerService service) {
		this.service = service;
	}
	private List<Computer> computers;

	public List<Computer> getComputers() {
		return computers;
	}

	public void setComputers(List<Computer> computers) {
		this.computers = computers;
	}

	public String findAll() {
		computers = service.findAll();
		return SUCCESS;
	}
	public String addComputer() {
		service.addComputer(computer);
		return SUCCESS;
	}
}
