package cn.SMS.service.Impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.SMS.dao.AdminDao;
import cn.SMS.model.Admin;
import cn.SMS.service.AdminService;

@Transactional
@Lazy(true)
@Service("adminService")
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{
	@Resource(name="adminDao")
	protected AdminDao adminDao;
}
