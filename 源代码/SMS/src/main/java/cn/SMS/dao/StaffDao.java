package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Staff;

public interface StaffDao extends BaseDao<Staff>{

	List<Staff> Query(String staffname, String tel);

	List<Staff> queryById(int sid);

}
