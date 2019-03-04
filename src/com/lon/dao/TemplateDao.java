package com.lon.dao;

import java.util.List;
import java.util.Map;

import com.lon.entity.Template;
import com.lon.vo.TemplateVo;

public interface TemplateDao extends BaseDao<Template>{

	public List<TemplateVo> tqueryByPage(Map<String,Integer> map);
}
