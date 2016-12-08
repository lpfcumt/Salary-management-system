package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Staff;
import cn.SMS.service.StaffService;

@Service("staffService")
public class StaffServiceImpl extends BaseServiceImpl<Staff> implements StaffService{


	@Override
	public Staff Query(String staffname, String tel) {
				
		if (staffDao.Query(staffname,tel)!=null) {
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

}
