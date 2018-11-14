package cn.ch.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.ch.bean.Computer;
import cn.ch.dao.ComputerDao;

public class ComputerDaoImpl implements ComputerDao{
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Computer> findAll() {
		return 	(List<Computer>) hibernateTemplate.find("from Computer");
		
	}

	@Override
	public void addComputer(Computer computer) {
		hibernateTemplate.save(computer);
		
	}

}
