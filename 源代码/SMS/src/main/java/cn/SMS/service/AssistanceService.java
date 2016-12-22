package cn.SMS.service;

import java.util.List;

import cn.SMS.model.Assistance;

public interface AssistanceService extends BaseService<Assistance> {

	List<Assistance> queryById(int aid);
	
	void update1(int sid, String cate1, String cate2, String cate3, String cate4, String cate5, String cate6,
			String cate7, String cate8);
}
