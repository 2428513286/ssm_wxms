package com.lon.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lon.dao.TemplateDao;
import com.lon.entity.Template;
import com.lon.service.TemplateService;
import com.lon.vo.TemplateVo;
@Service("templateService")
public class TemplateServiceImpl extends BaseServiceImpl<Template> implements TemplateService{

	@Resource
	private TemplateDao templateDao;
	
	@Override
	public List<TemplateVo> tqueryByPage(int currentPage, int pageSize) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("start", currentPage*pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return templateDao.tqueryByPage(map);
	}

}
