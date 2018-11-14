package cn.ch.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.ch.bean.Component;
import cn.ch.bean.ComponentType;
import service.ComponentService;

public class ComponentTypeAction extends ActionSupport{
	
	private List<ComponentType> types;
	
	public void setTypes(List<ComponentType> types) {
		this.types = types;
	}
	public List<ComponentType> getTypes() {
		return types;
	}

	private ComponentService service;
	
	public void setService(ComponentService service) {
		this.service = service;
	}
	public String findAll() {
		types = service.findAll();
		return SUCCESS;
	}
	
}
