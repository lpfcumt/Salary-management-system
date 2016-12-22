package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Staff;
import cn.SMS.service.StaffService;

@Service("staffService")
public class StaffServiceImpl extends BaseServiceImpl<Staff> implements StaffService{


	@Override
	public Staff Query(String staffname, String tel) {
		
		if (!staffDao.Query(staffname,tel).isEmpty()) {
			return staffDao.Query(staffname,tel).get(0);
		}else {
			return null;
			
		}
		
	}

	@Override
	public List<Staff> queryById(int sid) {
		// TODO Auto-generated method stub
		return staffDao.queryById(sid);
	}

	@Override
	public void deleteById(int sid) {
		// TODO Auto-generated method stub
		staffDao.deleteById(sid);
	}

	@Override
	public void updateById(int sid, String address, String basesalarycate, String birthday, String dept, String email,
			String job, String sex, String staffname, String tel) {
		// TODO Auto-generated method stub
		staffDao.updateById(sid,address,basesalarycate,birthday,dept,email,job,sex,staffname,tel);
	}
	
	public List<Staff> query1()  {
		return staffDao.query1();
	}

}
