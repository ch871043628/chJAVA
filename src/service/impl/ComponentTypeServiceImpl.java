package service.impl;

import java.util.List;

import cn.ch.bean.Component;
import cn.ch.dao.ComponentDao;
import cn.ch.dao.ComponentTypeDao;
import service.ComponentTypeService;

public class ComponentTypeServiceImpl implements ComponentTypeService{
	private ComponentTypeDao componentTypeDaoImpl;
	
	public void setComponentTypeDaoImpl(ComponentTypeDao componentTypeDaoImpl) {
		this.componentTypeDaoImpl = componentTypeDaoImpl;
	}
	@Override
	public void addComponent(Component component) {
		componentTypeDaoImpl.addComponent(component);
	}
	@Override
	public List<Component> findAll() {
		List<Component> list = componentTypeDaoImpl.findAll();
		return list;
	}
	
	@Override
	public List findAllByPage(Integer start, Integer pageSize) {
		return componentTypeDaoImpl.findAllByPage(start, pageSize);
	}

}
