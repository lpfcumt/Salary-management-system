package cn.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.SMS.model.Assistancesum;
import cn.SMS.service.AssistancesumService;


@Service("assistancesumService")
public class AssistancesumServiceImpl extends BaseServiceImpl<Assistancesum> implements AssistancesumService{

	@Override
	public List<Assistancesum> query1(int asid) {
		// TODO Auto-generated method stub
		return assistancesumDao.query1(asid);
	}

	@Override
	public void update1(int asid, String name, Double assistancesum) {
		// TODO Auto-generated method stub
		assistancesumDao.update1(asid,name,assistancesum);
	}

	@Override
	public List<Assistancesum> query2() {
		// TODO Auto-generated method stub
		return assistancesumDao.query2();
	}

}
