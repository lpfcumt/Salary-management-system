package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Assistance;

public interface AssistanceService extends BaseService<Assistance> {

	List<Assistance> queryById(int aid);

}
