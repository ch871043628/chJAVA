package service;

import java.util.List;

import cn.ch.bean.Computer;

public interface ComputerService {
	public List<Computer> findAll();
	
	public void addComputer(Computer computer);
}
