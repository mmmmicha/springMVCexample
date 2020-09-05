package com.sample.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.test.dao.CardManagementDAO;
import com.sample.test.service.CardManagementService;

@Service
public class CardManagementServiceImpl implements CardManagementService
{
	@Autowired
	private CardManagementDAO cardManagementDAO;
	
	@Override
	public List<Map<String, Object>> getCardManagementList(Map<String, Object> param) throws Exception
	{
		/**
		 * 
		 * 직접적인 transaction 처리들은
		 * 
		 * 여기에서 무조건 실시할 것!!
		 * 
		 * 여러 dao 들의 조합으로 데이터 만들고 다 담아서 보내기
		 * 
		 * */
		
		return cardManagementDAO.getCardManagementList(param);
	}
}
