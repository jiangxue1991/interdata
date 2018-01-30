package com.zym.wx.interdata.common.httpdeal;

import java.io.Serializable;

public class AbstarctOutInfo implements Serializable {

	private static final long serialVersionUID = 7227050175708431886L;

	private String rc;
	
	private String des;
	
	private Object data;

	public String getRc() {
		return rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
