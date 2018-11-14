package cn.ch.bean;

public class ComponentType {
	private Integer type_id;
	private String typename;
	
	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	@Override
	public String toString() {
		return "ComponentType [type_id=" + type_id + ", typename=" + typename + "]";
	}
	
}
