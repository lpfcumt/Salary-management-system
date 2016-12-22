package cn.SMS.dao;

import java.util.List;

import cn.SMS.model.Assistancesum;

public interface AssistancesumDao extends BaseDao<Assistancesum>{

	List<Assistancesum> query1(int asid);

	void update1(int asid, String name, Double assistancesum);

	List<Assistancesum> query2();

}
