package com.wts.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReply<M extends BaseReply<M>> extends Model<M> implements IBean {

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
	 * 工单状态：已回复、已回退、待处理
	 */
	public void setOrderState(java.lang.String orderState) {
		set("order_state", orderState);
	}
	
	/**
	 * 工单状态：已回复、已回退、待处理
	 */
	public java.lang.String getOrderState() {
		return getStr("order_state");
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
	 * 营商环境
	 */
	public void setBusinessEnvironment(java.lang.String businessEnvironment) {
		set("business_environment", businessEnvironment);
	}
	
	/**
	 * 营商环境
	 */
	public java.lang.String getBusinessEnvironment() {
		return getStr("business_environment");
	}

	/**
	 * 新版督察
	 */
	public void setNewSupervision(java.lang.String newSupervision) {
		set("new_supervision", newSupervision);
	}
	
	/**
	 * 新版督察
	 */
	public java.lang.String getNewSupervision() {
		return getStr("new_supervision");
	}

	/**
	 * 受理人员
	 */
	public void setAcceptPerson(java.lang.String acceptPerson) {
		set("accept_person", acceptPerson);
	}
	
	/**
	 * 受理人员
	 */
	public java.lang.String getAcceptPerson() {
		return getStr("accept_person");
	}

	/**
	 * 受理员编号
	 */
	public void setAcceptPersonCode(java.lang.String acceptPersonCode) {
		set("accept_person_code", acceptPersonCode);
	}
	
	/**
	 * 受理员编号
	 */
	public java.lang.String getAcceptPersonCode() {
		return getStr("accept_person_code");
	}

	/**
	 * 受理渠道
	 */
	public void setAcceptChannel(java.lang.String acceptChannel) {
		set("accept_channel", acceptChannel);
	}
	
	/**
	 * 受理渠道
	 */
	public java.lang.String getAcceptChannel() {
		return getStr("accept_channel");
	}

	/**
	 * 办理类型
	 */
	public void setHandleType(java.lang.String handleType) {
		set("handle_type", handleType);
	}
	
	/**
	 * 办理类型
	 */
	public java.lang.String getHandleType() {
		return getStr("handle_type");
	}

	/**
	 * 来电类别
	 */
	public void setPhoneType(java.lang.String phoneType) {
		set("phone_type", phoneType);
	}
	
	/**
	 * 来电类别
	 */
	public java.lang.String getPhoneType() {
		return getStr("phone_type");
	}

	/**
	 * 录入时间
	 */
	public void setWriteTime(java.lang.String writeTime) {
		set("write_time", writeTime);
	}
	
	/**
	 * 录入时间
	 */
	public java.lang.String getWriteTime() {
		return getStr("write_time");
	}

	/**
	 * 紧急程度
	 */
	public void setUrgencyDegree(java.lang.String urgencyDegree) {
		set("urgency_degree", urgencyDegree);
	}
	
	/**
	 * 紧急程度
	 */
	public java.lang.String getUrgencyDegree() {
		return getStr("urgency_degree");
	}

	/**
	 * 问题分类
	 */
	public void setProblemClassification(java.lang.String problemClassification) {
		set("problem_classification", problemClassification);
	}
	
	/**
	 * 问题分类
	 */
	public java.lang.String getProblemClassification() {
		return getStr("problem_classification");
	}

	/**
	 * 是否保密
	 */
	public void setIsSecret(java.lang.String isSecret) {
		set("is_secret", isSecret);
	}
	
	/**
	 * 是否保密
	 */
	public java.lang.String getIsSecret() {
		return getStr("is_secret");
	}

	/**
	 * 是否回复
	 */
	public void setIsReply(java.lang.String isReply) {
		set("is_reply", isReply);
	}
	
	/**
	 * 是否回复
	 */
	public java.lang.String getIsReply() {
		return getStr("is_reply");
	}

	/**
	 * 回复备注
	 */
	public void setReplyRemark(java.lang.String replyRemark) {
		set("reply_remark", replyRemark);
	}
	
	/**
	 * 回复备注
	 */
	public java.lang.String getReplyRemark() {
		return getStr("reply_remark");
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

	/**
	 * 附件
	 */
	public void setEnclosure(java.lang.String enclosure) {
		set("enclosure", enclosure);
	}
	
	/**
	 * 附件
	 */
	public java.lang.String getEnclosure() {
		return getStr("enclosure");
	}

	/**
	 * 发送人
	 */
	public void setSendPerson(java.lang.String sendPerson) {
		set("send_person", sendPerson);
	}
	
	/**
	 * 发送人
	 */
	public java.lang.String getSendPerson() {
		return getStr("send_person");
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
	 * 办理时限
	 */
	public void setEndDate(java.lang.String endDate) {
		set("end_date", endDate);
	}
	
	/**
	 * 办理时限
	 */
	public java.lang.String getEndDate() {
		return getStr("end_date");
	}

	/**
	 * 转办意见
	 */
	public void setTransferOpinion(java.lang.String transferOpinion) {
		set("transfer_opinion", transferOpinion);
	}
	
	/**
	 * 转办意见
	 */
	public java.lang.String getTransferOpinion() {
		return getStr("transfer_opinion");
	}

	/**
	 * 转办流程
	 */
	public void setTransferProcess(java.lang.String transferProcess) {
		set("transfer_process", transferProcess);
	}
	
	/**
	 * 转办流程
	 */
	public java.lang.String getTransferProcess() {
		return getStr("transfer_process");
	}

	/**
	 * 备注
	 */
	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	/**
	 * 备注
	 */
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	 * 下载时间
	 */
	public void setDownTime(java.util.Date downTime) {
		set("down_time", downTime);
	}
	
	/**
	 * 下载时间
	 */
	public java.util.Date getDownTime() {
		return get("down_time");
	}

	/**
	 * 答复类型
	 */
	public void setReplyType(java.lang.String replyType) {
		set("reply_type", replyType);
	}
	
	/**
	 * 答复类型
	 */
	public java.lang.String getReplyType() {
		return getStr("reply_type");
	}

	/**
	 * 预计完成时间
	 */
	public void setFinishTime(java.lang.String finishTime) {
		set("finish_time", finishTime);
	}
	
	/**
	 * 预计完成时间
	 */
	public java.lang.String getFinishTime() {
		return getStr("finish_time");
	}

	/**
	 * 答复来电人情况
	 */
	public void setReplySatisfy(java.lang.String replySatisfy) {
		set("reply_satisfy", replySatisfy);
	}
	
	/**
	 * 答复来电人情况
	 */
	public java.lang.String getReplySatisfy() {
		return getStr("reply_satisfy");
	}

	/**
	 * 答复时间
	 */
	public void setReplyDay(java.lang.String replyDay) {
		set("reply_day", replyDay);
	}
	
	/**
	 * 答复时间
	 */
	public java.lang.String getReplyDay() {
		return getStr("reply_day");
	}

	/**
	 * 答复人
	 */
	public void setReplyPerson(java.lang.String replyPerson) {
		set("reply_person", replyPerson);
	}
	
	/**
	 * 答复人
	 */
	public java.lang.String getReplyPerson() {
		return getStr("reply_person");
	}

	/**
	 * 答复电话
	 */
	public void setReplyPhone(java.lang.String replyPhone) {
		set("reply_phone", replyPhone);
	}
	
	/**
	 * 答复电话
	 */
	public java.lang.String getReplyPhone() {
		return getStr("reply_phone");
	}

	/**
	 * 办理情况
	 */
	public void setReplyContent(java.lang.String replyContent) {
		set("reply_content", replyContent);
	}
	
	/**
	 * 办理情况
	 */
	public java.lang.String getReplyContent() {
		return getStr("reply_content");
	}

	/**
	 * 回复单位
	 */
	public void setReplyDepartment(java.lang.String replyDepartment) {
		set("reply_department", replyDepartment);
	}
	
	/**
	 * 回复单位
	 */
	public java.lang.String getReplyDepartment() {
		return getStr("reply_department");
	}

	/**
	 * 回复时间
	 */
	public void setReplyTime(java.lang.String replyTime) {
		set("reply_time", replyTime);
	}
	
	/**
	 * 回复时间
	 */
	public java.lang.String getReplyTime() {
		return getStr("reply_time");
	}

	/**
	 * 下级办理单位
	 */
	public void setSubordinateDepartment(java.lang.String subordinateDepartment) {
		set("subordinate_department", subordinateDepartment);
	}
	
	/**
	 * 下级办理单位
	 */
	public java.lang.String getSubordinateDepartment() {
		return getStr("subordinate_department");
	}

	/**
	 * 不再办理
	 */
	public void setIfNodo(java.lang.String ifNodo) {
		set("if_nodo", ifNodo);
	}
	
	/**
	 * 不再办理
	 */
	public java.lang.String getIfNodo() {
		return getStr("if_nodo");
	}

	/**
	 * 不再办理原因
	 */
	public void setNodoReason(java.lang.String nodoReason) {
		set("nodo_reason", nodoReason);
	}
	
	/**
	 * 不再办理原因
	 */
	public java.lang.String getNodoReason() {
		return getStr("nodo_reason");
	}

	/**
	 * 附件
	 */
	public void setReplyEnclosure(java.lang.String replyEnclosure) {
		set("reply_enclosure", replyEnclosure);
	}
	
	/**
	 * 附件
	 */
	public java.lang.String getReplyEnclosure() {
		return getStr("reply_enclosure");
	}

	/**
	 * 回复联系人
	 */
	public void setReplyPerson2(java.lang.String replyPerson2) {
		set("reply_person2", replyPerson2);
	}
	
	/**
	 * 回复联系人
	 */
	public java.lang.String getReplyPerson2() {
		return getStr("reply_person2");
	}

	/**
	 * 回复电话
	 */
	public void setReplyPhone2(java.lang.String replyPhone2) {
		set("reply_phone2", replyPhone2);
	}
	
	/**
	 * 回复电话
	 */
	public java.lang.String getReplyPhone2() {
		return getStr("reply_phone2");
	}

}
