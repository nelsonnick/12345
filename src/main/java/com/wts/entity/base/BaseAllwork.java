package com.wts.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAllwork<M extends BaseAllwork<M>> extends Model<M> implements IBean {

	/**
	 * 序号
	 */
	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	/**
	 * 序号
	 */
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 工单序号
	 */
	public void setOrderGuid(java.lang.String orderGuid) {
		set("order_guid", orderGuid);
	}
	
	/**
	 * 工单序号
	 */
	public java.lang.String getOrderGuid() {
		return getStr("order_guid");
	}

	/**
	 * 文档序号
	 */
	public void setFileGuid(java.lang.String fileGuid) {
		set("file_guid", fileGuid);
	}
	
	/**
	 * 文档序号
	 */
	public java.lang.String getFileGuid() {
		return getStr("file_guid");
	}

	/**
	 * 工单编号
	 */
	public void setOrderCode(java.lang.String orderCode) {
		set("order_code", orderCode);
	}
	
	/**
	 * 工单编号
	 */
	public java.lang.String getOrderCode() {
		return getStr("order_code");
	}

	/**
	 * 联系人
	 */
	public void setLinkPerson(java.lang.String linkPerson) {
		set("link_person", linkPerson);
	}
	
	/**
	 * 联系人
	 */
	public java.lang.String getLinkPerson() {
		return getStr("link_person");
	}

	/**
	 * 联系电话
	 */
	public void setLinkPhone(java.lang.String linkPhone) {
		set("link_phone", linkPhone);
	}
	
	/**
	 * 联系电话
	 */
	public java.lang.String getLinkPhone() {
		return getStr("link_phone");
	}

	/**
	 * 联系地址
	 */
	public void setLinkAddress(java.lang.String linkAddress) {
		set("link_address", linkAddress);
	}
	
	/**
	 * 联系地址
	 */
	public java.lang.String getLinkAddress() {
		return getStr("link_address");
	}

	/**
	 * 发送时间
	 */
	public void setSendTime(java.lang.String sendTime) {
		set("send_time", sendTime);
	}
	
	/**
	 * 发送时间
	 */
	public java.lang.String getSendTime() {
		return getStr("send_time");
	}

	/**
	 * 问题描述
	 */
	public void setProblemDescription(java.lang.String problemDescription) {
		set("problem_description", problemDescription);
	}
	
	/**
	 * 问题描述
	 */
	public java.lang.String getProblemDescription() {
		return getStr("problem_description");
	}

}
