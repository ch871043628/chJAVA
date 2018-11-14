package service.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.ch.bean.Component;
import cn.ch.bean.ComponentType;
import cn.ch.dao.ComponentDao;
import service.ComponentService;

public class ComponentServiceImpl implements ComponentService{
	
	private ComponentDao dao;

	public void setDao(ComponentDao dao) {
		this.dao = dao;
	}
	@Override
	public List<ComponentType> findAll() {
		return dao.findAll();
	}

}
