package cn.ch.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.ch.bean.Component;
import cn.ch.bean.ComponentType;
import cn.ch.dao.ComponentDao;
import cn.ch.dao.ComponentTypeDao;

public class ComponentTypeDaoImpl  implements ComponentTypeDao{
	private HibernateTemplate hibernateTemplate ;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void addComponent(Component component) {
		hibernateTemplate.save(component);
		
	}

	@Override
	public List<Component> findAll() {
		return 	(List<Component>) hibernateTemplate.find("from Component");
		
	}

	@Override
	public List findAllByPage(Integer start, Integer pageSize) {
		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
		Query<Component> query = session.createQuery("from Component").setFirstResult(start).setMaxResults(pageSize);
		return query.list();
	}
	
}
