package com.bootdo_jpa.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_log")
public class LogDO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "user_id")
	private Long userId;

	private String username;

	private String operation;

	private Integer time;

	private String method;

	private String params;

	private String ip;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "gmt_create")
	private Date gmtCreate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation == null ? null : operation.trim();
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method == null ? null : method.trim();
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params == null ? null : params.trim();
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	@Override
	public String toString() {
		return "LogDO{" +
				"id=" + id +
				", userId=" + userId +
				", username='" + username + '\'' +
				", operation='" + operation + '\'' +
				", time=" + time +
				", method='" + method + '\'' +
				", params='" + params + '\'' +
				", ip='" + ip + '\'' +
				", gmtCreate=" + gmtCreate +
				'}';
	}
}