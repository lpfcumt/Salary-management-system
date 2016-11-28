package cn.SMS.service.Impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.dao.AdminDao;
import cn.SMS.dao.StaffDao;
import cn.SMS.model.Staff;
import cn.SMS.service.StaffService;
@Transactional
@Lazy(true)
@Service("staffService")
public class StaffServiceImpl extends BaseServiceImpl<Staff> implements StaffService{
	@Resource(name="staffDao")
	protected StaffDao staffDao;

	@Override
	public Staff Query(String staffname, String tel) {
		// TODO Auto-generated method stub
		if (!staffDao.Query(staffname,tel).isEmpty()) {
			return staffDao.Query(staffname,tel).get(0);
		}else {
			return null;
		}
		
	}

}
