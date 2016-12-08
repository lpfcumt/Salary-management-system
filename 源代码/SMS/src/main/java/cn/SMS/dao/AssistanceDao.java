package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Assistance;

public interface AssistanceDao extends BaseDao<Assistance>{

	List<Assistance> queryById(int aid);

}
