package cn.SMS.service;

import cn.SMS.model.Admin;

public interface AdminService extends BaseService<Admin> {

	Admin Query(String adminname, String password);

}
