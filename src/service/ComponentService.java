package service;

import java.util.List;

import cn.ch.bean.Component;
import cn.ch.bean.ComponentType;

public interface ComponentService {
	public List<ComponentType> findAll();
	
}
