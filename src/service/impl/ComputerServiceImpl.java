package service.impl;

import java.util.List;

import cn.ch.bean.Computer;
import cn.ch.dao.ComputerDao;
import service.ComputerService;

public class ComputerServiceImpl implements ComputerService{
	private ComputerDao dao;
	

	public void setDao(ComputerDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Computer> findAll() {
		List<Computer> list = dao.findAll();
		return list;
	}

	@Override
	public void addComputer(Computer computer) {
		dao.addComputer(computer);
		
	}

}
