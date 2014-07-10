package com.test.wem.a2zlisting.service;

import java.util.List;

import javax.jcr.Session;




public interface IA2ZListing {
	/**
	 * This method returns sorted series concepts for active life cycle.
	 * 
	 * @param actionVo 
	 * @param session CRX session
	 * @param conceptTag concept tag
	 * @return series data list
	 * @throws Exception
	 */
	public List<SeriesData> getSeriesData(ActionVo actionVo, Session session, Tag conceptTag) throws Exception;
}
