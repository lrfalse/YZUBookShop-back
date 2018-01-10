-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2018-01-10 07:55:15
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
  `iconAddress` varchar(150) COLLATE utf8_bin NOT NULL DEFAULT 'http://192.168.1.100:8080/resources/pics/carousel/1.jpg',
  `webUrl` varchar(150) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 转存表中的数据 `news`
--

INSERT INTO `news` (`id`, `title`, `description`, `iconAddress`, `webUrl`) VALUES
(1, '标题1', '简介1', 'http://192.168.1.100:8080/resources/pics/carousel/1.jpg', ''),
(2, '标题2', '简介2', 'http://192.168.1.100:8080/resources/pics/carousel/2.jpg', ''),
(3, '标题3', '简介3', 'http://192.168.1.100:8080/resources/pics/carousel/3.jpg', ''),
(4, '标题4', '简介4', 'http://192.168.1.100:8080/resources/pics/carousel/4.jpg', '');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
