package com.zym.wx.interdata.common.httpdeal;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ResponeDeal {

	private static ResponeDeal instance;

	public static synchronized ResponeDeal getInstance() {
		if (instance == null) {
			instance = new ResponeDeal();
		}
		return instance;
	}

	public void sendResponseStr(HttpServletResponse response, String code,
			String des) {
		HashMap conentMap = new HashMap();
		conentMap.put("rc", code);
		conentMap.put("des", des);
		JSONObject jsonObj = JSONObject.fromObject(conentMap);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.append(jsonObj.toString());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	public void sendUserDefinedResponseStr(HttpServletResponse response, Map<String,Object> map) {
		JSONObject jsonObj = JSONObject.fromObject(map);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.append(jsonObj.toString());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
	public void sendResponseData(HttpServletResponse response, String code,
			String des, Object dataObj) {
		if (des == null) {
			des = "";
		}
		AbstarctOutInfo outInfo = new AbstarctOutInfo();
		outInfo.setRc(code);
		outInfo.setDes(des);
		outInfo.setData(dataObj);
		String jsonStr = JSON.toJSONString(outInfo);
		response.setCharacterEncoding("UTF-8");
//		response.setHeader("Access-Control-Allow-Origin", rm.getValue("allow_url"));
//		response.setHeader("Access-Control-Allow-Headers", "tokenID,X-Custom-Header");
//		response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,PUT,DELETE");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.append(jsonStr);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
