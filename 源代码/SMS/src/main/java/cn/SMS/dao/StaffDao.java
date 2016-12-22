package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Staff;

public interface StaffDao extends BaseDao<Staff>{

	List<Staff> Query(String staffname, String tel);

	List<Staff> queryById(int sid);

	void deleteById(int sid);

	void updateById(int sid, String address, String basesalarycate, String birthday, String dept, String email,
			String job, String sex, String staffname, String tel);

	List<Staff> query1();

}
