package com.example.demo.service.ifs;

import java.sql.SQLException;

import com.example.demo.entity.Widget;

public interface WidgetApiService { // �����B��k

	public Widget getWidget(String widgetId) throws SQLException;
	public Widget getWidgets ();
	public Widget getWidgetByOrgId(String orgId) throws SQLException;
//	public SaveWidget saveWidget (SaveWidgetReq req) throws SerialException, SQLException;
	public Widget deleteWidget(String widgetId);
//	public OrgResp getOrgList (String ticket) throws Exception;
	
}
