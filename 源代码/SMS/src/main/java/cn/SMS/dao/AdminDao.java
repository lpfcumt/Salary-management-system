package cn.SMS.dao;


import java.util.List;

import cn.SMS.model.Admin;

public interface AdminDao extends BaseDao<Admin> {

	List<Admin> Query(String adminname, String password);

}
