package com.sample.test.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface CardManagementDAO
{
	List<Map<String, Object>> getCardManagementList(Map<String, Object> param) throws Exception;
}
