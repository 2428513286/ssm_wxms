package com.lon.service;

import java.util.List;

import com.lon.entity.Template;
import com.lon.vo.TemplateVo;

public interface TemplateService extends BaseService<Template>{

	public List<TemplateVo> tqueryByPage(int currentPage,int pageSize);
}
