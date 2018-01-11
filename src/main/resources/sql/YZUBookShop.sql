-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2018-01-11 10:36:21
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

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carousel`
--
ALTER TABLE `carousel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carousel`
--
ALTER TABLE `carousel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识符&&顺序',AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
