package com.sample.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.test.dao.CardReceiveDAO;

@Service
public class CardReceiveServiceImpl
{
	@Autowired
	private CardReceiveDAO cardReceiveDAO;
}
