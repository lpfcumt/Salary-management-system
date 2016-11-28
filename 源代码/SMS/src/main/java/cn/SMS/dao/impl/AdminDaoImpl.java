package cn.SMS.dao.Impl;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.AdminDao;
import cn.SMS.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

}
