package cn.ch.dao;

import java.util.List;

import cn.ch.bean.Component;
import cn.ch.bean.ComponentType;

public interface ComponentDao {
	public List<ComponentType> findAll();
	
}
