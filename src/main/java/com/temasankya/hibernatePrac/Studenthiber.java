package com.temasankya.hibernatePrac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.hibernate.dto.GuradianInfoBean;
import com.hibernate.dto.StudentIndoBean;
import com.hibernate.dto.StudentOtherInfoBean;

public class Studenthiber {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		StudentIndoBean bean = new StudentIndoBean();
		bean.setId(105);
		bean.setFirstname("shanu");
		bean.setMiddlename("kr");
		bean.setLastname("singh");
		 //StudentIndoBean std=session.load(StudentIndoBean.class, 104);
		 //System.out.println(std.getId());
		//System.out.println( std.getFirstname());
		//System.out.println( std.getMiddlename());
		//System.out.println(std.getLastname());
		//session.update(bean);
		session.save(bean);
		//session.delete(bean);
		
		StudentOtherInfoBean other= new StudentOtherInfoBean();
		other.setStinfo(bean);
		other.setIsadmin("Y");
		other.setPassword("shanu");
		session.save(other);
		GuradianInfoBean gbean=new GuradianInfoBean();
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}
