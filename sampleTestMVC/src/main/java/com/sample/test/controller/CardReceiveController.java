package com.sample.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.service.CardReceiveService;


@RestController
public class CardReceiveController
{	
	@Autowired
	private CardReceiveService cardReceiveService;
	
	@RequestMapping("/cardReceive/getCardReceiveList")
	public Map<String, Object> getCardReceiveList(@RequestBody Map<String, Object> param)
	{
		Map<String, Object> result = new HashMap<String, Object>();
		
		try
		{
			result.put("result", cardReceiveService.getCardReceiveList((Map) param.get("anyObject")));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		return null;
	}
}
