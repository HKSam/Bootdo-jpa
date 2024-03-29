package com.bootdo_jpa.common.utils;

import java.io.Serializable;
import java.util.List;

/**
 * @author bootdo-jpa huyidao---123@163.com
 */
public class  PageUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	private long total;
	private List<?> rows;

	public PageUtils(List<?> list, long total) {
		this.rows = list;
		this.total = total;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
