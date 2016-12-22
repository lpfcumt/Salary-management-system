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
	public List query1(int aid) {
		// TODO Auto-generated method stub
		return null;
	}

}