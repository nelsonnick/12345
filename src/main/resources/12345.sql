CREATE TABLE `unhandle`
(
    `id`                     int(11)                          NOT NULL AUTO_INCREMENT COMMENT '序号',
    `order_guid`             varchar(100) CHARACTER SET utf8  NULL COMMENT '工单序号',
    `file_guid`              varchar(100) CHARACTER SET utf8  NULL COMMENT '文档序号',
    `order_state`            varchar(20) CHARACTER SET utf8   NULL COMMENT '工单状态：已回复、已回退、待处理',
    `order_code`             varchar(50) CHARACTER SET utf8   NULL COMMENT '工单编号',
    `link_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '联系人',
    `link_phone`             varchar(50) CHARACTER SET utf8   NULL COMMENT '联系电话',
    `link_address`           varchar(255) CHARACTER SET utf8  NULL COMMENT '联系地址',
    `business_environment`   varchar(50) CHARACTER SET utf8   NULL COMMENT '营商环境',
    `new_supervision`        varchar(50) CHARACTER SET utf8   NULL COMMENT '新版督察',
    `accept_person`          varchar(50) CHARACTER SET utf8   NULL COMMENT '受理人员',
    `accept_person_code`     varchar(50) CHARACTER SET utf8   NULL COMMENT '受理员编号',
    `accept_channel`         varchar(50) CHARACTER SET utf8   NULL COMMENT '受理渠道',
    `handle_type`            varchar(50) CHARACTER SET utf8   NULL COMMENT '办理类型',
    `phone_type`             varchar(50) CHARACTER SET utf8   NULL COMMENT '来电类别',
    `write_time`             varchar(50) CHARACTER SET utf8   NULL COMMENT '录入时间',
    `urgency_degree`         varchar(50) CHARACTER SET utf8   NULL COMMENT '紧急程度',
    `problem_classification` varchar(255) CHARACTER SET utf8  NULL COMMENT '问题分类',
    `is_secret`              varchar(10) CHARACTER SET utf8   NULL COMMENT '是否保密',
    `is_reply`               varchar(10) CHARACTER SET utf8   NULL COMMENT '是否回复',
    `reply_remark`           varchar(255) CHARACTER SET utf8  NULL COMMENT '回复备注',
    `problem_description`    varchar(4999) CHARACTER SET utf8 NULL COMMENT '问题描述',
    `enclosure`              varchar(50) CHARACTER SET utf8   NULL COMMENT '附件',
    `send_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '发送人',
    `send_time`              varchar(50) CHARACTER SET utf8   NULL COMMENT '发送时间',
    `end_date`               varchar(50) CHARACTER SET utf8   NULL COMMENT '办理时限',
    `transfer_opinion`       varchar(4999) CHARACTER SET utf8 NULL COMMENT '转办意见',
    `transfer_process`       varchar(4999) CHARACTER SET utf8 NULL COMMENT '转办流程',
    `remark`                 varchar(255) CHARACTER SET utf8  NULL COMMENT '备注',
    `down_time`              datetime(0)                      NULL DEFAULT NULL COMMENT '下载时间',
    PRIMARY KEY (`id`)
);

CREATE TABLE `fallback`
(
    `id`                     int(11)                          NOT NULL AUTO_INCREMENT COMMENT '序号',
    `order_guid`             varchar(100) CHARACTER SET utf8  NULL COMMENT '工单序号',
    `file_guid`              varchar(100) CHARACTER SET utf8  NULL COMMENT '文档序号',
    `order_state`            varchar(20) CHARACTER SET utf8   NULL COMMENT '工单状态：已回复、已回退、待处理',
    `order_code`             varchar(50) CHARACTER SET utf8   NULL COMMENT '工单编号',
    `link_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '联系人',
    `link_phone`             varchar(50) CHARACTER SET utf8   NULL COMMENT '联系电话',
    `link_address`           varchar(255) CHARACTER SET utf8  NULL COMMENT '联系地址',
    `business_environment`   varchar(50) CHARACTER SET utf8   NULL COMMENT '营商环境',
    `new_supervision`        varchar(50) CHARACTER SET utf8   NULL COMMENT '新版督察',
    `accept_person`          varchar(50) CHARACTER SET utf8   NULL COMMENT '受理人员',
    `accept_person_code`     varchar(50) CHARACTER SET utf8   NULL COMMENT '受理员编号',
    `accept_channel`         varchar(50) CHARACTER SET utf8   NULL COMMENT '受理渠道',
    `handle_type`            varchar(50) CHARACTER SET utf8   NULL COMMENT '办理类型',
    `phone_type`             varchar(50) CHARACTER SET utf8   NULL COMMENT '来电类别',
    `write_time`             varchar(50) CHARACTER SET utf8   NULL COMMENT '录入时间',
    `urgency_degree`         varchar(50) CHARACTER SET utf8   NULL COMMENT '紧急程度',
    `problem_classification` varchar(255) CHARACTER SET utf8  NULL COMMENT '问题分类',
    `is_secret`              varchar(10) CHARACTER SET utf8   NULL COMMENT '是否保密',
    `is_reply`               varchar(10) CHARACTER SET utf8   NULL COMMENT '是否回复',
    `reply_remark`           varchar(255) CHARACTER SET utf8  NULL COMMENT '回复备注',
    `problem_description`    varchar(2999) CHARACTER SET utf8 NULL COMMENT '问题描述',
    `enclosure`              varchar(50) CHARACTER SET utf8   NULL COMMENT '附件',
    `send_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '发送人',
    `send_time`              varchar(50) CHARACTER SET utf8   NULL COMMENT '发送时间',
    `end_date`               varchar(50) CHARACTER SET utf8   NULL COMMENT '办理时限',
    `transfer_opinion`       varchar(2999) CHARACTER SET utf8 NULL COMMENT '转办意见',
    `transfer_process`       varchar(2999) CHARACTER SET utf8 NULL COMMENT '转办流程',
    `remark`                 varchar(255) CHARACTER SET utf8  NULL COMMENT '备注',
    `down_time`              datetime(0)                      NULL DEFAULT NULL COMMENT '下载时间',
    `fallback_reason`        varchar(2999) CHARACTER SET utf8 NULL COMMENT '回退原因',
    `leader_opinions`        varchar(255) CHARACTER SET utf8  NULL COMMENT '领导意见',
    `suggestion`             varchar(2999) CHARACTER SET utf8 NULL COMMENT '建议',
    `fallback_department`    varchar(255) CHARACTER SET utf8  NULL COMMENT '回退部门',
    `fallback_time`          varchar(50) CHARACTER SET utf8   NULL COMMENT '回退时间',
    `fallback_person`        varchar(50) CHARACTER SET utf8   NULL COMMENT '回退人',
    `fallback_phone`         varchar(50) CHARACTER SET utf8   NULL COMMENT '回退联系电话',
    PRIMARY KEY (`id`)
);

CREATE TABLE `reply`
(
    `id`                     int(11)                          NOT NULL AUTO_INCREMENT COMMENT '序号',
    `order_guid`             varchar(100) CHARACTER SET utf8  NULL COMMENT '工单序号',
    `file_guid`              varchar(100) CHARACTER SET utf8  NULL COMMENT '文档序号',
    `order_state`            varchar(20) CHARACTER SET utf8   NULL COMMENT '工单状态：已回复、已回退、待处理',
    `order_code`             varchar(50) CHARACTER SET utf8   NULL COMMENT '工单编号',
    `link_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '联系人',
    `link_phone`             varchar(50) CHARACTER SET utf8   NULL COMMENT '联系电话',
    `link_address`           varchar(255) CHARACTER SET utf8  NULL COMMENT '联系地址',
    `business_environment`   varchar(50) CHARACTER SET utf8   NULL COMMENT '营商环境',
    `new_supervision`        varchar(50) CHARACTER SET utf8   NULL COMMENT '新版督察',
    `accept_person`          varchar(50) CHARACTER SET utf8   NULL COMMENT '受理人员',
    `accept_person_code`     varchar(50) CHARACTER SET utf8   NULL COMMENT '受理员编号',
    `accept_channel`         varchar(50) CHARACTER SET utf8   NULL COMMENT '受理渠道',
    `handle_type`            varchar(50) CHARACTER SET utf8   NULL COMMENT '办理类型',
    `phone_type`             varchar(50) CHARACTER SET utf8   NULL COMMENT '来电类别',
    `write_time`             varchar(50) CHARACTER SET utf8   NULL COMMENT '录入时间',
    `urgency_degree`         varchar(50) CHARACTER SET utf8   NULL COMMENT '紧急程度',
    `problem_classification` varchar(255) CHARACTER SET utf8  NULL COMMENT '问题分类',
    `is_secret`              varchar(10) CHARACTER SET utf8   NULL COMMENT '是否保密',
    `is_reply`               varchar(10) CHARACTER SET utf8   NULL COMMENT '是否回复',
    `reply_remark`           varchar(255) CHARACTER SET utf8  NULL COMMENT '回复备注',
    `problem_description`    varchar(2999) CHARACTER SET utf8 NULL COMMENT '问题描述',
    `enclosure`              varchar(50) CHARACTER SET utf8   NULL COMMENT '附件',
    `send_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '发送人',
    `send_time`              varchar(50) CHARACTER SET utf8   NULL COMMENT '发送时间',
    `end_date`               varchar(50) CHARACTER SET utf8   NULL COMMENT '办理时限',
    `transfer_opinion`       varchar(2999) CHARACTER SET utf8 NULL COMMENT '转办意见',
    `transfer_process`       varchar(2999) CHARACTER SET utf8 NULL COMMENT '转办流程',
    `remark`                 varchar(255) CHARACTER SET utf8  NULL COMMENT '备注',
    `down_time`              datetime(0)                      NULL DEFAULT NULL COMMENT '下载时间',
    `reply_type`             varchar(50) CHARACTER SET utf8   NULL COMMENT '答复类型',
    `finish_time`            varchar(50) CHARACTER SET utf8   NULL COMMENT '预计完成时间',
    `reply_satisfy`          varchar(50) CHARACTER SET utf8   NULL COMMENT '答复来电人情况',
    `reply_day`              varchar(50) CHARACTER SET utf8   NULL COMMENT '答复时间',
    `reply_person`           varchar(50) CHARACTER SET utf8   NULL COMMENT '答复人',
    `reply_phone`            varchar(50) CHARACTER SET utf8   NULL COMMENT '答复电话',
    `reply_content`          varchar(2999) CHARACTER SET utf8 NULL COMMENT '办理情况',
    `reply_department`       varchar(255) CHARACTER SET utf8  NULL COMMENT '回复单位',
    `reply_time`             varchar(50) CHARACTER SET utf8   NULL COMMENT '回复时间',
    `subordinate_department` varchar(255) CHARACTER SET utf8  NULL COMMENT '下级办理单位',
    `if_nodo`                varchar(50) CHARACTER SET utf8   NULL COMMENT '不再办理',
    `nodo_reason`            varchar(999) CHARACTER SET utf8  NULL COMMENT '不再办理原因',
    `reply_enclosure`        varchar(50) CHARACTER SET utf8   NULL COMMENT '附件',
    `reply_person2`          varchar(50) CHARACTER SET utf8   NULL COMMENT '回复联系人',
    `reply_phone2`           varchar(50) CHARACTER SET utf8   NULL COMMENT '回复电话',
    PRIMARY KEY (`id`)
);

CREATE TABLE `expire`
(
    `id`         int(11)                         NOT NULL AUTO_INCREMENT COMMENT '序号',
    `order_guid` varchar(255) CHARACTER SET utf8 NULL COMMENT '工单序号',
    `file_guid`  varchar(100) CHARACTER SET utf8 NULL COMMENT '文档序号',
    `order_code` varchar(255) CHARACTER SET utf8 NULL COMMENT '工单编号',
    `end_date`   varchar(255) CHARACTER SET utf8 NULL COMMENT '办理时限',
    PRIMARY KEY (`id`)
);

CREATE TABLE `allwork`
(
    `id`                  int(11)                          NOT NULL AUTO_INCREMENT COMMENT '序号',
    `order_guid`          varchar(255) CHARACTER SET utf8  NULL COMMENT '工单序号',
    `file_guid`           varchar(100) CHARACTER SET utf8  NULL COMMENT '文档序号',
    `order_code`          varchar(255) CHARACTER SET utf8  NULL COMMENT '工单编号',
    `link_person`         varchar(50) CHARACTER SET utf8   NULL COMMENT '联系人',
    `link_phone`          varchar(50) CHARACTER SET utf8   NULL COMMENT '联系电话',
    `link_address`        varchar(255) CHARACTER SET utf8  NULL COMMENT '联系地址',
    `send_time`           varchar(50) CHARACTER SET utf8   NULL COMMENT '发送时间',
    `problem_description` varchar(2999) CHARACTER SET utf8 NULL COMMENT '问题描述',
    PRIMARY KEY (`id`)
);


CREATE TABLE `statistic`
(
    `id`                     int(11)                          NOT NULL AUTO_INCREMENT COMMENT '序号',
    `order_guid`             varchar(255) CHARACTER SET utf8  NULL COMMENT '工单序号',
    `file_guid`              varchar(100) CHARACTER SET utf8  NULL COMMENT '文档序号',
    `order_code`             varchar(255) CHARACTER SET utf8  NULL COMMENT '工单编号',
    `accept_person_code`     varchar(50) CHARACTER SET utf8   NULL COMMENT '受理员编号',
    `accept_channel`         varchar(50) CHARACTER SET utf8   NULL COMMENT '受理渠道',
    `end_date`               varchar(255) CHARACTER SET utf8  NULL COMMENT '办理时限',
    `is_secret`              varchar(10) CHARACTER SET utf8   NULL COMMENT '是否保密',
    `is_reply`               varchar(10) CHARACTER SET utf8   NULL COMMENT '是否回复',
    `urgency_degree`         varchar(50) CHARACTER SET utf8   NULL COMMENT '紧急程度',
    `phone_type`             varchar(50) CHARACTER SET utf8   NULL COMMENT '来电类别',
    `link_person`            varchar(50) CHARACTER SET utf8   NULL COMMENT '联系人',
    `link_phone`             varchar(50) CHARACTER SET utf8   NULL COMMENT '联系电话',
    `link_address`           varchar(255) CHARACTER SET utf8  NULL COMMENT '联系地址',
    `problem_classification` varchar(255) CHARACTER SET utf8  NULL COMMENT '问题分类',
    `problem_description`    varchar(2999) CHARACTER SET utf8 NULL COMMENT '问题描述',
    `transfer_opinion`       varchar(2999) CHARACTER SET utf8 NULL COMMENT '转办意见',
    `transfer_process`       varchar(2999) CHARACTER SET utf8 NULL COMMENT '转办流程',
    `enclosure`              varchar(50) CHARACTER SET utf8   NULL COMMENT '附件',
    `reply_remark`           varchar(255) CHARACTER SET utf8  NULL COMMENT '回复备注',
    `type`                   varchar(255) CHARACTER SET utf8  NULL COMMENT '办理类型：直办件、转办件、退办件',
    `department`             varchar(255) CHARACTER SET utf8  NULL COMMENT '办理部门',
    `keywords`               varchar(255) CHARACTER SET utf8  NULL COMMENT '关键词',
    `save_time`              datetime(0)                      NULL DEFAULT NULL COMMENT '保存时间',
    PRIMARY KEY (`id`)
)

