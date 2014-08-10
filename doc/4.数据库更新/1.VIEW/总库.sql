CREATE TABLE `tb_guessevery_person` (
  `GUESS_PERSON_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `PERSON_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `PERSON_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GUESSEVERY_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `INTO_GOLD_NUM` int(11) NOT NULL COMMENT '投入金币数量',
  `CHOOSE_OPTION` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户选择的选项,存ABCDE以逗号隔开',
  `CREATE_TIME` datetime NOT NULL,
  PRIMARY KEY (`GUESS_PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `tb_guesseveryday` (
  `GUESSEVERYDAY_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `ISSUE` int(11) NOT NULL COMMENT '期数:如 第20140708期',
  `QUESTION` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `ANSWER_ID` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `CREATE_TIME` datetime NOT NULL,
  PRIMARY KEY (`GUESSEVERYDAY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `tb_person` (
  `PERSON_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `PERSON_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '登录名',
  `PERSON_NICKNAME` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '昵称',
  `PERSON_REALNAME` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '真实姓名',
  `PERSON_PASSWORD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GOLD` int(11) NOT NULL DEFAULT '0' COMMENT '持有金币',
  `IMG_HEAD_PATH` varchar(280) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `LAST_LOGIN_TIME` datetime DEFAULT NULL,
  `SEX` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `HOME_ADDRESS` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_TIME` datetime NOT NULL,
  PRIMARY KEY (`PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `ts_manager` (
  `MANAGER_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `MANAGER_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `MANAGER_PASSWORD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ROLE` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT '管理员权限',
  PRIMARY KEY (`MANAGER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `ts_menu` (
  `MENU_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `MENU_NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `MENU_URL` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PARENT_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `ts_role` (
  `ROLE_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `MANAGER_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `ROLE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ROLE_MENU_ID` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '存菜单ID，以逗号隔开',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
