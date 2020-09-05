package com.sample.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.service.CardManagementService;


@RestController
public class CardManagementController
{
	@Autowired
	private CardManagementService cardManagementService;
	
	@RequestMapping("/cardManagement/getCardManagementList")
	public Map<String, Object> getCardManagementList(@RequestBody Map<String, Object> param)
	{
		Map<String, Object> result = new HashMap<String, Object>();
		
		try
		{
			result.put("cardManagementList", cardManagementService.getCardManagementList((Map) param.get("anyObject")));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		return result;
		
	}
	
}
