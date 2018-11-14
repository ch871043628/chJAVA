package cn.ch.dao;

import java.util.List;

import cn.ch.bean.Computer;

public interface ComputerDao {
	public List<Computer> findAll();
	
	public void addComputer(Computer computer);
}
