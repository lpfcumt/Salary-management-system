package cn.SMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.SMS.dao.StaffDao;
import cn.SMS.model.Staff;

@Repository("staffDao")
public class StaffDaoImpl extends BaseDaoImpl<Staff> implements StaffDao{

	@Override
	public List<Staff> Query(String staffname, String tel) {
		// TODO Auto-generated method stub
		return findByHql("from staff where staffname='"+staffname+"' and tel='"+tel+"'");
	}

	@Override
	public List<Staff> queryById(int sid) {
		// TODO Auto-generated method stub
		
		return findByHql("from staff where sid='"+sid+"'");
	}

}
