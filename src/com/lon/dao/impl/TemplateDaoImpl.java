package com.lon.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lon.dao.TemplateDao;
import com.lon.entity.Template;
import com.lon.vo.TemplateVo;
@Repository("templateDao")
public class TemplateDaoImpl extends BaseDaoImpl<Template> implements TemplateDao{

	
	
	@Override
	public List<TemplateVo> tqueryByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(Template.class.getSimpleName()+".uqueryByPage", map);
	}

}
