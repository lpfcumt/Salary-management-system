package cn.SMS.service.impl;



import org.springframework.stereotype.Service;
import cn.SMS.model.Admin;
import cn.SMS.service.AdminService;


@Service("adminService")
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{

	@Override
	public Admin Query(String adminname, String password) {
		// TODO Auto-generated method stub9
		if (!adminDao.Query(adminname,password).isEmpty()){
			return adminDao.Query(adminname,password).get(0);
			
		}else {
			return null;
		}
			

	}
}
