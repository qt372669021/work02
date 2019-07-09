package com.jmkx.common.base;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 4155703884429102857L;

	public String toString() {
		return JSON.toJSONString(this);
	}
}
