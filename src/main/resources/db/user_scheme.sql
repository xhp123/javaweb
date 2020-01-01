--
-- 表的结构 `admin`
--

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
    `id` int AUTO_INCREMENT,
    `username` varchar(20) NOT NULL default '' COMMENT '用户名',
    `passwd` varchar(20) NOT NULL default '' COMMENT '密码',
    PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 导出表中的数据 `admin`
--
INSERT INTO `tb_user` values(0,'admin','password');
INSERT INTO `tb_user` values(0,'admin1','password1');
INSERT INTO `tb_user` values(0,'admin2','password2');
