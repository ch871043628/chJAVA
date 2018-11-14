package cn.ch.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.ch.bean.Component;
import service.ComponentTypeService;

public class ComponentAction extends ActionSupport {
	private Component component;
	private Integer currentPage;
	private Integer pageSize;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	private ComponentTypeService componentTypeServiceImpl;

	public void setComponentTypeServiceImpl(ComponentTypeService componentTypeServiceImpl) {
		this.componentTypeServiceImpl = componentTypeServiceImpl;
	}

	public String addComponent() {
		componentTypeServiceImpl.addComponent(component);
		return SUCCESS;
	}

	private List<Component> components;

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public String findAll() {
		components = componentTypeServiceImpl.findAll();
		return SUCCESS;
	}

	public String findAllpage() {
		List<Component> components = componentTypeServiceImpl.findAllByPage((currentPage - 1) * pageSize, pageSize);
		ServletActionContext.getContext().getValueStack().set("components", components);
		return SUCCESS;
	}

}
