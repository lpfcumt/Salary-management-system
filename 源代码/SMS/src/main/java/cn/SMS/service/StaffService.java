package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Staff;

public interface StaffService extends BaseService<Staff>{
	Staff  Query(String staffname,String tel);

	List<Staff> queryById(int sid);
}
