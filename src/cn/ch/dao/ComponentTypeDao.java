package cn.ch.dao;

import java.util.List;

import cn.ch.bean.Component;

public interface ComponentTypeDao {
	public void addComponent(Component component);
	
	public List<Component> findAll();
	
	public List findAllByPage(Integer start,Integer pageSize);
}
