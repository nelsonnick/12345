package com.wts.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRe<M extends BaseRe<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setOrderCode(java.lang.String orderCode) {
		set("order_code", orderCode);
	}
	
	public java.lang.String getOrderCode() {
		return getStr("order_code");
	}

	public void setProblemDescription(java.lang.String problemDescription) {
		set("problem_description", problemDescription);
	}
	
	public java.lang.String getProblemDescription() {
		return getStr("problem_description");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}