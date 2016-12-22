package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Assistance;
import cn.SMS.service.AssistanceService;


@Service("assistanceService")
public class AssistanceServiceImpl extends BaseServiceImpl<Assistance> implements AssistanceService{

	@Override
	public List<Assistance> queryById(int aid) {
		// TODO Auto-generated method stub
		return assistanceDao.queryById(aid);
	}

	

	@Override
	public void update1(int sid, String cate1, String cate2, String cate3, String cate4, String cate5, String cate6,
			String cate7, String cate8) {
		// TODO Auto-generated method stub
		assistanceDao.update1(sid,cate1,cate2,cate3,cate4,cate5,cate6,cate7,cate8);
	}

}