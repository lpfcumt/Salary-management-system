package cn.SMS.service;

import cn.SMS.model.Staff;

public interface StaffService extends BaseService<Staff>{
	Staff  Query(String staffname,String tel);
}
