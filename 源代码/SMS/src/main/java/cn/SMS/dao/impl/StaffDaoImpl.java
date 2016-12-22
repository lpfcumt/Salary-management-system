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
		
		return findByHql(" from staff where sid='"+sid+"'");
	}

	@Override
	public void deleteById(int sid) {
		// TODO Auto-generated method stub
		String hql="delete from staff where sid='"+sid+"'";
		getSession().createQuery(hql).executeUpdate();
	}

	@Override
	public void updateById(int sid, String address, String basesalarycate, String birthday, String dept, String email,
			String job, String sex, String staffname, String tel) {
		// TODO Auto-generated method stub
		String hql="update staff s set s.address='"+address+"',s.basesalarycate='"+basesalarycate+"',s.birthday='"+birthday+
				"',s.dept='"+dept+"',s.email='"+email+"',s.job='"+job+"',s.sex='"+sex+"',s.staffname='"+staffname+"',s.tel='"+tel+"'"+" where s.sid="+sid+"";
		getSession().createQuery(hql).executeUpdate();
	}

	@Override
	public List<Staff> query1() {
		// TODO Auto-generated method stub
		String hql="select * from staff";
		
		return  getSession().createQuery(hql).getResultList();
	}

}
