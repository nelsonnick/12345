CREATE TABLE `workorder` (
`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
`order_guid` varchar(255) CHARACTER SET utf8 NULL COMMENT '工单序号',
`order_state` varchar(255) CHARACTER SET utf8 NULL COMMENT '工单状态',
`order_code` varchar(255) CHARACTER SET utf8 NULL COMMENT '工单编号',
`link_person` varchar(255) CHARACTER SET utf8 NULL COMMENT '联系人',
`link_phone` varchar(255) CHARACTER SET utf8 NULL COMMENT '联系电话',
`link_address` varchar(255) CHARACTER SET utf8 NULL COMMENT '联系地址',
`business_environment` varchar(255) CHARACTER SET utf8 NULL COMMENT '营商环境',
`new_supervision` varchar(255) CHARACTER SET utf8 NULL COMMENT '新版督察',
`accept_person` varchar(255) CHARACTER SET utf8 NULL COMMENT '受理人员',
`accept_person_code` varchar(255) CHARACTER SET utf8 NULL COMMENT '受理员编号',
`accept_channel` varchar(255) CHARACTER SET utf8 NULL COMMENT '受理渠道',
`handle_type` varchar(255) CHARACTER SET utf8 NULL COMMENT '办理类型',
`phone_type` varchar(255) CHARACTER SET utf8 NULL COMMENT '来电类别',
`entry_time` varchar(255) CHARACTER SET utf8 NULL COMMENT '录入时间',
`urgency_degree` varchar(255) CHARACTER SET utf8 NULL COMMENT '紧急程度',
`problem_classification` varchar(255) CHARACTER SET utf8 NULL COMMENT '问题分类',
`is_secret` varchar(255) CHARACTER SET utf8 NULL COMMENT '是否保密',
`is_reply` varchar(255) CHARACTER SET utf8 NULL COMMENT '是否回复',
`reply_remark` varchar(255) CHARACTER SET utf8 NULL COMMENT '回复备注',
`problem_description` varchar(4999) CHARACTER SET utf8 NULL COMMENT '问题描述',
`enclosure` varchar(255) CHARACTER SET utf8 NULL COMMENT '附件',
`send_person` varchar(255) CHARACTER SET utf8 NULL COMMENT '发送人',
`send_time` varchar(255) CHARACTER SET utf8 NULL COMMENT '发送时间',
`end_date` varchar(255) CHARACTER SET utf8 NULL COMMENT '办理时限',
`transfer_opinion` varchar(4999) CHARACTER SET utf8 NULL COMMENT '转办意见',
`transfer_process` varchar(4999) CHARACTER SET utf8 NULL COMMENT '转办流程',
`remark` varchar(255) CHARACTER SET utf8 NULL COMMENT '备注',
PRIMARY KEY (`id`) 
);