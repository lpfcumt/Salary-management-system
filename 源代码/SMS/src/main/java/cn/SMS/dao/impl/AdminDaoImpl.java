package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AdminDao;
import cn.SMS.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	@Override
	public List<Admin> Query(String adminname, String password) {
		// TODO Auto-generated method stub
		return findByHql("from admin where adminname='"+adminname+"' and password='"+password+"'");
	}

}
