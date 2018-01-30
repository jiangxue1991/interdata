package com.zym.wx.interdata.common.httpdeal;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

public class RequestDeal {

	private Logger logger= Logger.getLogger(getClass());

	private static RequestDeal instance;

	public static synchronized RequestDeal getInstance() {
		if (instance == null) {
			instance = new RequestDeal();
		}
		return instance;
	}

	public String readJSONString(HttpServletRequest request) {
		StringBuffer json = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				json.append(line);
			}
			logger.info("后台传递字符串为："+json);
		} catch (Exception e) {
			Logger.getLogger(getClass()).error("readJSONString", e);
		}
		return json.toString();
	}
}
