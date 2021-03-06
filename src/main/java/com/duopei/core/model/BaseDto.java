package com.duopei.core.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.duopei.core.utill.constant.BeanStateConstant;

public class BaseDto implements Serializable {

	private static final long serialVersionUID = -4645665971489259257L;
	private String insertId;
	private Timestamp insertDate;
	private String modifyId;
	private Timestamp modifyDate;
	private String type = BeanStateConstant._NORMAL ;//<input type="hidden" name="_method" value="PUT" />
	private String _method = BeanStateConstant._NORMAL ;
	

	public String get_method() {
		return _method;
	}

	public void set_method(String _method) {
		this._method = _method;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInsertId() {
		return insertId;
	}

	public void setInsertId(String insertId) {
		this.insertId = insertId;
	}

	public Timestamp getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public String getModifyId() {
		return modifyId;
	}

	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

}
