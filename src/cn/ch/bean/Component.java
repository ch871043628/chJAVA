package cn.ch.bean;

public class Component {
	private Integer component_id;
	private ComponentType componentType;
	private String componentName;
	private String capacity;
	private Integer price;
	public Integer getComponent_id() {
		return component_id;
	}
	public void setComponent_id(Integer component_id) {
		this.component_id = component_id;
	}
	public ComponentType getComponentType() {
		return componentType;
	}
	public void setComponentType(ComponentType componentType) {
		this.componentType = componentType;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	

}
