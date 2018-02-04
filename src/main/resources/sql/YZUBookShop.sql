-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2018-02-04 14:34:26
-- 服务器版本： 5.7.20
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `YZUBookShop`
--

-- --------------------------------------------------------

--
-- 表的结构 `carousel`
--

CREATE TABLE IF NOT EXISTS `carousel` (
  `id` int(11) NOT NULL COMMENT '唯一标识符&&顺序',
  `title` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '这是轮播的标题' COMMENT '轮播标题',
  `path` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '这是轮播图片的地址' COMMENT '轮播标题'
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `carousel`
--

INSERT INTO `carousel` (`id`, `title`, `path`) VALUES
(1, '轮播标题1', '/resources/pics/carousel/1.jpg'),
(2, '轮播标题2', '/resources/pics/carousel/2.jpg'),
(3, '轮播标题3', '/resources/pics/carousel/3.jpg'),
(4, '轮播标题4', '/resources/pics/carousel/4.jpg'),
(5, '轮播标题5', '/resources/pics/carousel/5.jpg');

-- --------------------------------------------------------

--
-- 表的结构 `cart`
--

CREATE TABLE IF NOT EXISTS `cart` (
  `id` int(11) NOT NULL,
  `seller` varchar(30) COLLATE utf8_bin NOT NULL,
  `book_id` int(11) NOT NULL,
  `price` float NOT NULL,
  `buyer` varchar(30) COLLATE utf8_bin NOT NULL,
  `creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `cart`
--

INSERT INTO `cart` (`id`, `seller`, `book_id`, `price`, `buyer`, `creat_time`) VALUES
(7, '18751103565', 10, 43.4, 'test001', '2018-02-03 14:22:23'),
(8, '18751103565', 6, 32.9, 'test001', '2018-02-03 15:28:55'),
(9, 'a411919924@icloud.com', 13, 41.6, 'test001', '2018-02-03 15:29:17');

-- --------------------------------------------------------

--
-- 表的结构 `collects`
--

CREATE TABLE IF NOT EXISTS `collects` (
  `id` int(11) NOT NULL,
  `account` varchar(30) COLLATE utf8_bin NOT NULL,
  `book_id` int(11) NOT NULL,
  `collect_time` datetime DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `collects`
--

INSERT INTO `collects` (`id`, `account`, `book_id`, `collect_time`) VALUES
(11, 'test001', 8, '2018-01-31 22:36:36'),
(14, 'test001', 6, '2018-02-03 19:09:09'),
(16, '18751103565', 13, '2018-02-04 21:09:34');

-- --------------------------------------------------------

--
-- 表的结构 `delivery`
--

CREATE TABLE IF NOT EXISTS `delivery` (
  `id` int(11) NOT NULL,
  `account` varchar(30) COLLATE utf8_bin NOT NULL,
  `receiver` varchar(20) COLLATE utf8_bin NOT NULL,
  `phone` char(11) COLLATE utf8_bin NOT NULL,
  `province` varchar(10) COLLATE utf8_bin NOT NULL,
  `city` varchar(10) COLLATE utf8_bin NOT NULL,
  `district` varchar(10) COLLATE utf8_bin NOT NULL,
  `location` varchar(30) COLLATE utf8_bin NOT NULL,
  `defaults` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `delivery`
--

INSERT INTO `delivery` (`id`, `account`, `receiver`, `phone`, `province`, `city`, `district`, `location`, `defaults`) VALUES
(1, '18751103565', '徐宇嘉1', '18751103565', '江苏省', '苏州', '常熟', '古里镇紫霞花园三期6幢301', 0),
(2, '18751103565', '徐宇嘉2', '18751103565', '江苏省', '扬州市', '邗江区', '扬子津街道扬州大学扬子津西校区', 1),
(3, '18751103565', '徐宇嘉3', '18751103565', '江苏省', '苏州', '常熟', '古里镇珠泾苑四区151号', 0),
(8, 'test001', '测试用户1', '18751103565', '江苏省', '扬州市', '邗江区', '扬州大学扬子津西校区', 1);

-- --------------------------------------------------------

--
-- 表的结构 `news`
--

CREATE TABLE IF NOT EXISTS `news` (
  `id` int(11) NOT NULL,
  `title` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '标题1',
  `description` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '简介1',
  `iconAddress` varchar(250) COLLATE utf8_bin NOT NULL DEFAULT 'http://192.168.1.100:8080/resources/pics/carousel/1.jpg',
  `webUrl` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `news`
--

INSERT INTO `news` (`id`, `title`, `description`, `iconAddress`, `webUrl`) VALUES
(1, '疯狂到震撼心灵的爱情经典', '爱情，自古以来就是一个永恒的话题。 对于每个人来说，爱情是美好而又令人神往的。', 'http://www.book110.com/wp/wp-content/uploads/2016/02/01.jpg', 'http://192.168.1.100:8080/resources/news/news1.jsp'),
(2, '系统化的逻辑思维', '引起大家对于系统性思考和一些思维偏误的兴趣', 'http://www.book110.com/wp/wp-content/uploads/2016/02/0.jpg', 'http://192.168.1.100:8080/resources/news/news2.jsp'),
(3, '大学生必读的30本经典书籍', '旅行和读书，教会我们如何看待这个世界。', 'http://www.book110.com/wp/wp-content/uploads/2016/02/0.jpeg', 'http://192.168.1.100:8080/resources/news/news3.jsp'),
(4, '不容错过的心理学经典著作', '一场巅峰阅读的盛宴，这是一场净化心灵的旅途', 'http://www.book110.com/wp/wp-content/uploads/2016/01/021.jpg', 'http://192.168.1.100:8080/resources/news/news4.jsp'),
(5, '经久不衰的英国经典小说', '几个世纪以来，英国小说一直影响着全球各地小说的形式', 'http://www.book110.com/wp/wp-content/uploads/2016/01/019.jpg', 'http://192.168.1.100:8080/resources/news/news5.jsp'),
(6, '《额尔古纳河右岸》', '驯鹿民族的“百年孤独”', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1515591265417&di=eeff64af7d2eca28c586c879230e4ca9&imgtype=0&src=http%3A%2F%2Fpic.lvmama.com%2Fuploads%2Fpc%2Fplace2%2F2017-04-05%2F3eed2a16-e4bf-4c92-abb1-adbb0a66e0c2.jpg', 'http://192.168.1.100:8080/resources/news/news6.jsp'),
(7, '《唤醒内在的智慧》', '改变自己的人生道路与提升自我意识', 'http://www.book110.com/wp/wp-content/uploads/2015/12/470_120514110542_1.jpg', 'http://192.168.1.100:8080/resources/news/news7.jsp');

-- --------------------------------------------------------

--
-- 表的结构 `Orders`
--

CREATE TABLE IF NOT EXISTS `Orders` (
  `id` int(11) NOT NULL,
  `buyer` varchar(30) COLLATE utf8_bin NOT NULL,
  `seller` varchar(30) COLLATE utf8_bin NOT NULL,
  `book_id` int(11) NOT NULL,
  `receiver` varchar(30) COLLATE utf8_bin NOT NULL,
  `phone` int(11) NOT NULL,
  `province` varchar(10) COLLATE utf8_bin NOT NULL,
  `city` varchar(10) COLLATE utf8_bin NOT NULL,
  `district` varchar(10) COLLATE utf8_bin NOT NULL,
  `location` varchar(10) COLLATE utf8_bin NOT NULL,
  `flag` int(11) NOT NULL DEFAULT '1' COMMENT '1:待确认 2:待付款 3:待收货 4:待评价 5:已关闭',
  `note` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '暂无备注' COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- 表的结构 `selling`
--

CREATE TABLE IF NOT EXISTS `selling` (
  `id` int(11) NOT NULL COMMENT '自增主键',
  `account` varchar(30) COLLATE utf8_bin NOT NULL COMMENT '出售该商品的账户',
  `title` varchar(30) COLLATE utf8_bin NOT NULL COMMENT '商品标题',
  `author` varchar(30) COLLATE utf8_bin NOT NULL,
  `price` float NOT NULL,
  `description` varchar(300) COLLATE utf8_bin NOT NULL,
  `keywords` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '关键词',
  `photoUrl` varchar(500) COLLATE utf8_bin NOT NULL COMMENT '详情图片在服务器中的地址',
  `category1` int(11) NOT NULL COMMENT '一级书类',
  `category2` int(11) NOT NULL COMMENT '二级书类',
  `createDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `onSell` int(1) NOT NULL DEFAULT '1' COMMENT '状态位 1：出售中  0：订单中 2: 已售出',
  `promotion` varchar(10) COLLATE utf8_bin NOT NULL DEFAULT 'promotion' COMMENT '商品活动',
  `views` int(11) NOT NULL DEFAULT '0' COMMENT '浏览数',
  `collects` int(11) NOT NULL DEFAULT '0' COMMENT '收藏数'
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='商品出售表';

--
-- 转存表中的数据 `selling`
--

INSERT INTO `selling` (`id`, `account`, `title`, `author`, `price`, `description`, `keywords`, `photoUrl`, `category1`, `category2`, `createDate`, `onSell`, `promotion`, `views`, `collects`) VALUES
(1, '18751103565', '解忧杂货店', '(日)东野圭吾', 27.3, '这是一本书', '解忧 杂货铺', 'http://192.168.1.100:8080/resources/selling/18751103565/cover1.jpg http://192.168.1.100:8080/resources/selling/18751103565//cover4.jpg http://192.168.1.100:8080/resources/selling/18751103565//icon_book_sample.jpg http://192.168.1.100:8080/resources/selling/18751103565//cover2.jpg ', 1, 11, '2018-01-22 23:11:29', 1, 'promotion', 1, 0),
(4, '18751103565', '解忧杂货店2', '东野圭吾', 27.4, '这是第二本书', '杂货铺', 'http://192.168.1.100:8080/resources/selling/18751103565/cover1.jpg http://192.168.1.100:8080/resources/selling/18751103565//cover4.jpg http://192.168.1.100:8080/resources/selling/18751103565//icon_book_sample.jpg http://192.168.1.100:8080/resources/selling/18751103565//cover2.jpg ', 1, 11, '2018-01-26 20:55:57', 1, 'promotion', 0, 0),
(5, '18751103565', '东野圭吾经典 解忧杂货店', '东野圭吾', 27, 'd第三本书', '暂无', 'http://192.168.1.100:8080/resources/selling/18751103565/cover1.jpg http://192.168.1.100:8080/resources/selling/18751103565//cover4.jpg http://192.168.1.100:8080/resources/selling/18751103565//icon_book_sample.jpg http://192.168.1.100:8080/resources/selling/18751103565//cover2.jpg ', 1, 11, '2018-01-27 21:57:52', 1, 'promotion', 3, 0),
(6, '18751103565', ' 数学之美(第二版)', '吴军', 32.9, '获奖畅销书《数学之美》首版荣获国家图书馆第八届文津图书奖\r\n\r\n首版入选广电总局“2014年向全国青少年推荐百种优秀图书书目”，荣获2012-2013年度全行业优秀畅销书\r\n\r\n信息领域大学生必读好书，央视新闻推荐的学科敲门砖\r\n\r\n《浪潮之巅》、《文明之光》作者吴军博士新力作，李开复作序推荐，Google黑板报百万点击！ \r\n\r\n新版增加了大数据和机器学习等前沿内容，以满足人们对当下技术的学习需求；同时，根据专家和读者的反馈更正了错漏，并更新了部分内容。 ', '浪潮之巅 文明之光 硅谷之谜 大学之路', 'http://192.168.1.100:8080/resources/selling/18751103565/5-7-71-1.jpg http://192.168.1.100:8080/resources/selling/18751103565/5-7-71-2.jpg http://192.168.1.100:8080/resources/selling/18751103565/5-7-71-3.jpg http://192.168.1.100:8080/resources/selling/18751103565/5-7-71-4.jpg http://192.168.1.100:8080/resources/selling/18751103565/5-7-71-5.jpg ', 7, 71, '2018-01-29 19:07:53', 1, 'promotion', 25, 1),
(7, '18751103565', '算法竞赛入门经典（第2版）', '刘汝佳', 35.6, '本书是一本算法竞赛的入门与提高教材，把C/C 语言、算法和解题有机地结合在一起，淡化理论，注重学习方法和实践技巧。全书内容分为12章，包括程序设计入门、循环结构程序设计、数组和字符串、函数和递归、C 与STL入门、数据结构基础、暴力求解法、高效算法设计、动态规划初步、数学概念与方法、图论模型与算法、高级专题等内容，覆盖了算法竞赛入门和提高所需的主要知识点，并含有大量例题和习题。书中的代码规范、简洁、易懂，不仅能帮助读者理解算法原理，还能教会读者很多实用的编程技巧；书中包含的各种开发、测试和调试技巧也是传统的语言、算法类书籍中难以见到的。', '实用性强 专业性强 对工作帮助大', 'http://192.168.1.100:8080/resources/selling/18751103565/7-7-71-1.jpg http://192.168.1.100:8080/resources/selling/18751103565/7-7-71-2.jpg http://192.168.1.100:8080/resources/selling/18751103565/7-7-71-3.jpg', 7, 71, '2018-01-29 19:18:23', 1, 'promotion', 5, 0),
(8, '18751103565', '数据结构与算法分析：C语言描述（原书第2版）', 'Mark Allen Weiss', 27, '本书讨论数据结构和算法分析。数据结构主要研究组织大量数据的方法，而算法分析则是对算法运行时间的评估。随着计算机的速度越来越快，对于能够处理大量输入数据的程序的需求变得日益急切。可是，由于在输入量很大的时候，程序的低效率现象变得非常明显，因此这又要求对效率问题给予更仔细的关注。通过在实际编程之前对算法的分析，学生可以决定一个特定的解法是否可行。例如，学生在本书中将读到一些特定的问题并看到精心的实现方法是如何把对大量数据的时间限制从16年减至不到1秒的。因此，若无运行时间的阐释，就不会有算法和数据结构的提出。', '算法设计 数据结构 C语言', 'http://192.168.1.100:8080/resources/selling/18751103565/8-7-71-1.jpg http://192.168.1.100:8080/resources/selling/18751103565/8-7-71-2.jpg http://192.168.1.100:8080/resources/selling/18751103565/8-7-71-3.jpg', 7, 71, '2018-01-29 19:24:33', 1, 'promotion', 11, 1),
(10, '18751103565', '区块链 2.0', '谭磊', 43.4, '区块链是脱胎于比特币协议的分布式技术，它同时又是一个完美的信用系统。区块链的原理和特性决定其先天肩负着重构金融在内的各行业未来形态的使命，更有甚者寄希望于由其来创造更理想的世界。鉴于很多人对区块链的认识还停留在“币时代”，本书旨在通过推出区块链2.0这一全新概念，真实呈现区块链的缘由和本质，通俗讲解区块链技术的原理和奥义，完整描绘区块链的应用和趋势。书中既有真实案例，又有严谨推导，更有原创设计，对于相关决策者、从业者、学术研究者及普罗大众而言，都是极具新意与实用价值的绝佳资料。', '政府 创投 民间 区块链', 'http://192.168.1.100:8080/resources/selling/18751103565/10-7-71-1.jpg http://192.168.1.100:8080/resources/selling/18751103565/10-7-71-2.jpg http://192.168.1.100:8080/resources/selling/18751103565/10-7-71-3.jpg http://192.168.1.100:8080/resources/selling/18751103565/10-7-71-4.jpg', 7, 71, '2018-01-29 19:37:05', 1, 'promotion', 5, 0),
(11, 'test001', '深入分布式缓存：从原理到实践', '于君泽 曹洪伟 邱硕等', 78.2, '书内容在逻辑上共分为三个部分，按照从理论到实现，再到实践的思路撰写。首先介绍分布式缓存的背景知识，对本书“分布式”和“缓存”这两个关键词进行了全面的综述，作为后续章节叙述的基础；第二部分介绍业界主流的缓存，关注其原理与实现，囊括了Ehcache、Memcached、Redis、tair、EVCache、Aerospike等六个缓存或类缓存系统；后一部分讨论缓存在互联网系统中的实践，从广告、社交、新闻、电商、营销等五类典型的互联网应用入手，分析它们面临的性能稳定性问题以及如何利用分布式缓存解决这些问题。', '高并发 分布式技术 稳定性模式', 'http://192.168.1.100:8080/resources/selling/test001/11-7-71-1.jpg http://192.168.1.100:8080/resources/selling/test001/11-7-71-2.jpg http://192.168.1.100:8080/resources/selling/test001/11-7-71-3.jpg http://192.168.1.100:8080/resources/selling/test001/11-7-71-4.jpg', 7, 71, '2018-01-29 19:48:00', 1, 'promotion', 2, 0),
(12, 'test001', '具体数学：计算机科学基础', '[美]葛立恒', 78.2, '当代计算机科学方面的一部重要著作，TAOCP的前奏曲\r\n　　不仅讲述数学问题和技巧，更侧重教导解决问题的方法\r\n　　或平淡、或深刻、或严肃、或幽默的涂鸦，让你在轻松愉悦的心境下体会数学的美妙\r\n　　第二作者、图灵奖得主计算机科学泰斗Donald E. Knuth（高德纳）在接受图灵社区的访谈时如是说：\r\n　　“《具体数学》是一份‘纲领’，它的内容是我对于数学诸多方面应该如何教与学的思考。熟练掌握代数公式的基础技能，对我来说始终都是关键所在。这些内容在 TAOCP里都有讨论，但只能是蜻蜓点水；在斯坦福大学的课程中，我得以深入更多的细节，而那些课程都被囊括在这本书中了。', '数据 计算机 基础', 'http://192.168.1.100:8080/resources/selling/test001/12-7-71-1.jpg http://192.168.1.100:8080/resources/selling/test001/12-7-71-2.jpg http://192.168.1.100:8080/resources/selling/test001/12-7-71-3.jpg', 7, 71, '2018-01-29 20:02:29', 1, 'promotion', 3, 0),
(13, 'a411919924@icloud.com', '编码：隐匿在计算机软硬件背后的语言', 'Charles Petzold', 41.6, '这是一本讲述计算机工作原理的书。不过，你千万不要因为“工作原理”之类的字眼就武断地认为，它是晦涩而难懂的。作者用丰富的想象和清晰的笔墨将看似繁杂的理论阐述得通俗易懂，你丝毫不会感到枯燥和生硬。更重要的是，你会因此而获得对计算机工作原理较深刻的理解。这种理解不是抽象层面上的，而是具有一定深度的，这种深度甚至不逊于“电气工程师”和“程序员”的理解。', '编码 摩斯密码 信息 通信', 'http://192.168.1.100:8080/resources/selling/18751103565/8-7-71-1.jpg http://192.168.1.100:8080/resources/selling/18751103565/8-7-71-2.jpg http://192.168.1.100:8080/resources/selling/18751103565/8-7-71-3.jpg', 7, 71, '2018-02-02 15:29:48', 1, 'promotion', 5, 1);

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `account` varchar(30) COLLATE utf8_bin NOT NULL,
  `pwd` varchar(20) COLLATE utf8_bin NOT NULL,
  `username` varchar(20) COLLATE utf8_bin NOT NULL,
  `gender` char(2) COLLATE utf8_bin NOT NULL DEFAULT '男',
  `phone` char(11) COLLATE utf8_bin NOT NULL,
  `headshot` varchar(200) COLLATE utf8_bin NOT NULL DEFAULT 'http://192.168.1.100:8080/resources/pics/headshots/headshot2.jpg'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`account`, `pwd`, `username`, `gender`, `phone`, `headshot`) VALUES
('18751103565', '123456', 'xyj', '男', '18751103565', 'http://192.168.1.100:8080/resources/pics/headshots/headshot2.jpg'),
('a411919924@icloud.com', '123456', 'xmfy', '男', '18751103565', 'http://192.168.1.100:8080/resources/pics/headshots/headshot1.jpg'),
('test001', '123456', 'test001', '男', '18751103565', 'http://192.168.1.100:8080/resources/pics/headshots/headshot2.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carousel`
--
ALTER TABLE `carousel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `seller` (`seller`),
  ADD KEY `book_id` (`book_id`),
  ADD KEY `buyer` (`buyer`);

--
-- Indexes for table `collects`
--
ALTER TABLE `collects`
  ADD PRIMARY KEY (`id`),
  ADD KEY `account` (`account`),
  ADD KEY `book_id` (`book_id`);

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`id`),
  ADD KEY `delivery_ibfk_1` (`account`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Orders`
--
ALTER TABLE `Orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `buyer` (`buyer`),
  ADD KEY `seller` (`seller`);

--
-- Indexes for table `selling`
--
ALTER TABLE `selling`
  ADD PRIMARY KEY (`id`),
  ADD KEY `account` (`account`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`account`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carousel`
--
ALTER TABLE `carousel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识符&&顺序',AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `collects`
--
ALTER TABLE `collects`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `delivery`
--
ALTER TABLE `delivery`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `Orders`
--
ALTER TABLE `Orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `selling`
--
ALTER TABLE `selling`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',AUTO_INCREMENT=14;
--
-- 限制导出的表
--

--
-- 限制表 `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`seller`) REFERENCES `selling` (`account`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `selling` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cart_ibfk_3` FOREIGN KEY (`buyer`) REFERENCES `user` (`account`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- 限制表 `collects`
--
ALTER TABLE `collects`
  ADD CONSTRAINT `collects_ibfk_1` FOREIGN KEY (`account`) REFERENCES `user` (`account`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `collects_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `selling` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- 限制表 `delivery`
--
ALTER TABLE `delivery`
  ADD CONSTRAINT `delivery_ibfk_1` FOREIGN KEY (`account`) REFERENCES `user` (`account`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- 限制表 `Orders`
--
ALTER TABLE `Orders`
  ADD CONSTRAINT `FK_BUYER` FOREIGN KEY (`buyer`) REFERENCES `user` (`account`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_SELLER` FOREIGN KEY (`seller`) REFERENCES `user` (`account`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- 限制表 `selling`
--
ALTER TABLE `selling`
  ADD CONSTRAINT `selling_ibfk_1` FOREIGN KEY (`account`) REFERENCES `user` (`account`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
