package cn.ch.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.ch.bean.ComponentType;
import cn.ch.dao.ComponentDao;

public class ComponentDaoImpl implements ComponentDao{

	private HibernateTemplate ht ;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public List<ComponentType> findAll() {
		return (List<ComponentType>) ht.find("from ComponentType");
	}
	

}
