-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2025 at 03:29 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `srm_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `customer_payment` double NOT NULL,
  `total_sale` double NOT NULL,
  `customer_change` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `customer_payment`, `total_sale`, `customer_change`) VALUES
(1, 200, 150, 50),
(2, 1200, 1150, 50),
(3, 1500, 1400, 100),
(4, 450, 400, 50),
(5, 850, 800, 50),
(6, 1300, 1200, 100),
(7, 1750, 1700, 50),
(8, 2000, 1950, 50),
(9, 600, 550, 50),
(10, 1100, 1050, 50),
(11, 1000, 950, 50),
(12, 950, 900, 50),
(13, 700, 650, 50),
(14, 850, 800, 50),
(15, 1250, 1200, 50),
(16, 300, 250, 50),
(17, 400, 350, 50),
(18, 900, 850, 50),
(19, 1000, 950, 50),
(20, 600, 550, 50),
(21, 1600, 1500, 100),
(22, 1800, 1700, 100),
(23, 950, 900, 50),
(24, 1100, 1050, 50),
(25, 1400, 1300, 100),
(26, 2000, 1950, 50),
(27, 650, 600, 50),
(28, 1200, 1150, 50),
(29, 700, 650, 50),
(30, 950, 900, 50),
(31, 1500, 1450, 50),
(32, 1300, 1250, 50),
(33, 850, 800, 50),
(34, 900, 850, 50),
(35, 1600, 1500, 100),
(36, 1700, 1600, 100),
(37, 1000, 950, 50),
(38, 800, 750, 50),
(39, 1400, 1350, 50),
(40, 1900, 1850, 50),
(41, 600, 550, 50),
(42, 1000, 950, 50),
(43, 800, 750, 50),
(44, 850, 800, 50),
(45, 1100, 1050, 50),
(46, 1200, 1150, 50),
(47, 1300, 1250, 50),
(48, 900, 850, 50),
(49, 1500, 1450, 50),
(50, 2000, 1950, 50),
(51, 550, 500, 50),
(52, 800, 750, 50),
(53, 1100, 1050, 50),
(54, 1200, 1150, 50),
(55, 1350, 1300, 50),
(56, 1500, 1450, 50),
(57, 1300, 1250, 50),
(58, 750, 700, 50),
(59, 950, 900, 50),
(60, 1100, 1050, 50),
(61, 600, 550, 50),
(62, 1000, 950, 50),
(63, 1200, 1150, 50),
(64, 650, 600, 50),
(65, 1100, 1050, 50),
(66, 1500, 1450, 50),
(67, 800, 750, 50),
(68, 900, 850, 50),
(69, 1000, 950, 50),
(70, 1300, 1250, 50),
(71, 900, 850, 50),
(72, 1100, 1050, 50),
(73, 1200, 1150, 50),
(74, 850, 800, 50),
(75, 700, 650, 50),
(76, 1000, 950, 50),
(77, 1500, 1450, 50),
(78, 1300, 1250, 50),
(79, 1100, 1050, 50),
(80, 800, 750, 50),
(81, 1200, 1150, 50),
(82, 950, 900, 50),
(83, 1400, 1350, 50),
(84, 700, 650, 50),
(85, 1000, 950, 50),
(86, 1200, 1150, 50),
(87, 900, 850, 50),
(88, 1500, 1450, 50),
(89, 1300, 1250, 50),
(90, 2000, 1950, 50),
(91, 950, 900, 50),
(92, 1100, 1050, 50),
(93, 1500, 1450, 50),
(94, 1000, 950, 50),
(95, 850, 800, 50),
(96, 1200, 1150, 50),
(97, 950, 900, 50),
(98, 800, 750, 50),
(99, 1300, 1250, 50),
(100, 2000, 1950, 50);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `Product_id` int(11) NOT NULL,
  `Product_Name` varchar(255) NOT NULL,
  `Category` varchar(255) NOT NULL,
  `Price` double NOT NULL,
  `Stock_Quantity` int(11) NOT NULL,
  `Brand` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`Product_id`, `Product_Name`, `Category`, `Price`, `Stock_Quantity`, `Brand`) VALUES
(1, 'Water', 'Drinks', 10, 100, 'Evian'),
(2, 'Coke', 'Drinks', 21, 100, 'Coca-Cola'),
(3, 'Sprite', 'Drinks', 21, 100, 'Coca-Cola'),
(4, 'Burger', 'Foods', 35, 100, 'Burger King'),
(5, 'Fries', 'Foods', 20, 100, 'Potato Corner'),
(6, 'Spaghetti', 'Foods', 40, 100, 'Olive Garden');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `Sales_id` int(11) NOT NULL,
  `Product_id` int(11) NOT NULL,
  `Quantity_Sold` int(11) NOT NULL,
  `Sales_Date` date NOT NULL,
  `Total_Sales` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`Sales_id`, `Product_id`, `Quantity_Sold`, `Sales_Date`, `Total_Sales`, `user_id`, `order_id`) VALUES
(1, 5, 22, '2025-02-01', 440, 5, 1),
(2, 4, 59, '2025-01-29', 2065, 7, 1),
(3, 2, 40, '2025-01-30', 840, 7, 1),
(4, 3, 22, '2025-02-06', 462, 7, 1),
(5, 2, 40, '2025-02-01', 840, 5, 2),
(6, 6, 17, '2025-02-08', 595, 8, 1),
(7, 3, 1, '2025-02-06', 21, 5, 2),
(8, 2, 69, '2025-01-29', 1449, 7, 2),
(9, 5, 93, '2025-01-28', 1860, 5, 1),
(10, 1, 93, '2025-01-29', 930, 5, 3),
(11, 2, 37, '2025-02-08', 777, 8, 2),
(12, 1, 53, '2025-01-28', 530, 8, 2),
(13, 3, 94, '2025-02-04', 1974, 2, 1),
(14, 4, 8, '2025-02-06', 280, 2, 3),
(15, 2, 85, '2025-02-04', 1785, 8, 2),
(16, 6, 22, '2025-02-05', 770, 7, 1),
(17, 2, 75, '2025-01-27', 1575, 6, 1),
(18, 3, 16, '2025-01-30', 336, 8, 2),
(19, 3, 40, '2025-01-26', 840, 2, 1),
(20, 5, 21, '2025-02-06', 420, 5, 4),
(21, 2, 1, '2025-01-27', 21, 6, 2),
(22, 4, 47, '2025-01-30', 1645, 5, 3),
(23, 4, 81, '2025-01-26', 2835, 6, 2),
(24, 2, 76, '2025-02-06', 1596, 5, 5),
(25, 4, 4, '2025-01-26', 140, 5, 3),
(26, 4, 43, '2025-02-03', 1505, 2, 1),
(27, 3, 68, '2025-01-30', 1428, 8, 4),
(28, 2, 10, '2025-01-27', 210, 2, 3),
(29, 6, 23, '2025-01-30', 805, 8, 5),
(30, 3, 56, '2025-01-29', 1176, 5, 4),
(31, 5, 26, '2025-01-31', 520, 2, 1),
(32, 1, 88, '2025-02-02', 880, 8, 1),
(33, 4, 1, '2025-01-26', 35, 8, 4),
(34, 3, 50, '2025-01-28', 1050, 2, 3),
(35, 1, 40, '2025-02-08', 400, 5, 3),
(36, 3, 16, '2025-02-01', 336, 8, 3),
(37, 4, 20, '2025-01-27', 700, 2, 4),
(38, 2, 100, '2025-01-26', 2100, 8, 5),
(39, 4, 4, '2025-01-26', 140, 2, 6),
(40, 3, 78, '2025-02-03', 1638, 8, 2),
(41, 4, 48, '2025-02-06', 1680, 5, 6),
(42, 5, 57, '2025-02-01', 1140, 7, 4),
(43, 1, 3, '2025-01-27', 30, 5, 5),
(44, 3, 49, '2025-01-27', 1029, 2, 6),
(45, 2, 3, '2025-01-31', 63, 5, 2),
(46, 4, 9, '2025-01-28', 315, 8, 4),
(47, 6, 58, '2025-02-08', 2030, 8, 4),
(48, 2, 27, '2025-01-30', 567, 6, 6),
(49, 6, 34, '2025-01-26', 1190, 2, 7),
(50, 1, 16, '2025-02-06', 160, 5, 7),
(51, 6, 58, '2025-01-29', 2030, 8, 5),
(52, 2, 8, '2025-01-30', 168, 6, 7),
(53, 2, 55, '2025-02-03', 1155, 5, 3),
(54, 5, 61, '2025-01-27', 1220, 6, 7),
(55, 1, 52, '2025-01-30', 520, 2, 8),
(56, 4, 35, '2025-01-29', 1225, 7, 6),
(57, 2, 14, '2025-01-29', 294, 2, 7),
(58, 2, 31, '2025-02-02', 651, 8, 2),
(59, 4, 13, '2025-01-30', 455, 7, 9),
(60, 5, 44, '2025-02-04', 880, 7, 3),
(61, 2, 18, '2025-02-06', 378, 6, 8),
(62, 6, 2, '2025-01-27', 70, 5, 8),
(63, 5, 72, '2025-02-07', 1440, 7, 1),
(64, 6, 9, '2025-01-30', 315, 7, 10),
(65, 1, 1, '2025-02-08', 10, 6, 5),
(66, 2, 15, '2025-02-02', 315, 6, 3),
(67, 6, 95, '2025-01-31', 3325, 5, 3),
(68, 4, 63, '2025-01-28', 2205, 8, 5),
(69, 3, 46, '2025-01-31', 966, 6, 4),
(70, 3, 29, '2025-02-08', 609, 5, 6),
(71, 6, 42, '2025-01-29', 1470, 2, 8),
(72, 2, 28, '2025-02-02', 588, 2, 4),
(73, 4, 29, '2025-01-30', 1015, 6, 11),
(74, 5, 34, '2025-02-04', 680, 8, 4),
(75, 1, 55, '2025-02-07', 550, 7, 2),
(76, 4, 88, '2025-02-04', 3080, 5, 5),
(77, 4, 6, '2025-02-06', 210, 2, 9),
(78, 4, 4, '2025-01-30', 140, 6, 12),
(79, 2, 6, '2025-01-31', 126, 2, 5),
(80, 2, 8, '2025-01-27', 168, 8, 9),
(81, 1, 68, '2025-02-05', 680, 2, 2),
(82, 1, 19, '2025-02-07', 190, 5, 3),
(83, 5, 69, '2025-01-29', 1380, 8, 9),
(84, 4, 2, '2025-01-29', 70, 8, 10),
(85, 6, 13, '2025-02-08', 455, 8, 7),
(86, 5, 76, '2025-02-03', 1520, 5, 4),
(87, 4, 8, '2025-02-04', 280, 5, 6),
(88, 3, 36, '2025-01-26', 756, 5, 8),
(89, 1, 43, '2025-01-30', 430, 5, 13),
(90, 1, 40, '2025-01-31', 400, 8, 6),
(91, 5, 8, '2025-02-03', 160, 8, 5),
(92, 3, 42, '2025-02-06', 882, 6, 10),
(93, 2, 6, '2025-01-27', 126, 6, 10),
(94, 6, 41, '2025-02-03', 1435, 7, 6),
(95, 1, 1, '2025-01-30', 10, 7, 14),
(96, 6, 54, '2025-01-27', 1890, 8, 11),
(97, 4, 20, '2025-01-28', 700, 8, 6),
(98, 3, 75, '2025-02-07', 1575, 7, 4),
(99, 4, 4, '2025-02-08', 140, 5, 8),
(100, 6, 4, '2025-01-31', 140, 7, 7),
(101, 4, 17, '2025-01-31', 595, 7, 8),
(102, 3, 22, '2025-02-06', 462, 2, 11),
(103, 2, 4, '2025-02-06', 84, 8, 12),
(104, 4, 31, '2025-02-07', 1085, 7, 5),
(105, 1, 36, '2025-01-28', 360, 5, 7),
(106, 5, 8, '2025-01-30', 160, 2, 15),
(107, 1, 18, '2025-02-05', 180, 2, 3),
(108, 3, 2, '2025-01-31', 42, 5, 9),
(109, 6, 10, '2025-02-07', 350, 6, 6),
(110, 5, 5, '2025-02-06', 100, 2, 13),
(111, 3, 6, '2025-02-08', 126, 5, 9),
(112, 6, 75, '2025-01-28', 2625, 6, 8),
(113, 1, 33, '2025-01-27', 330, 8, 12),
(114, 1, 16, '2025-02-07', 160, 2, 7),
(115, 5, 60, '2025-02-05', 1200, 5, 4),
(116, 6, 68, '2025-02-05', 2380, 2, 5),
(117, 6, 76, '2025-02-02', 2660, 7, 5),
(118, 3, 30, '2025-02-08', 630, 2, 10),
(119, 3, 23, '2025-01-29', 483, 7, 11),
(120, 1, 67, '2025-01-26', 670, 2, 9),
(121, 4, 1, '2025-01-26', 35, 8, 10),
(122, 3, 13, '2025-01-27', 273, 8, 13),
(123, 3, 2, '2025-01-31', 42, 2, 10),
(124, 1, 8, '2025-02-07', 80, 2, 8),
(125, 1, 1, '2025-01-28', 10, 2, 9),
(126, 3, 87, '2025-02-05', 1827, 2, 6),
(127, 4, 90, '2025-02-02', 3150, 7, 6),
(128, 6, 7, '2025-02-05', 245, 7, 7),
(129, 6, 21, '2025-02-07', 735, 5, 9),
(130, 6, 1, '2025-01-31', 35, 7, 11),
(131, 1, 98, '2025-02-01', 980, 6, 5),
(132, 3, 23, '2025-02-02', 483, 8, 7),
(133, 6, 50, '2025-02-04', 1750, 8, 7),
(134, 1, 2, '2025-02-01', 20, 7, 6),
(135, 4, 86, '2025-02-05', 3010, 2, 8),
(136, 1, 3, '2025-01-30', 30, 5, 16),
(137, 1, 25, '2025-01-26', 250, 2, 11),
(138, 6, 38, '2025-01-27', 1330, 6, 14),
(139, 3, 16, '2025-01-30', 336, 5, 17),
(140, 5, 28, '2025-01-29', 560, 5, 12),
(141, 1, 10, '2025-01-31', 100, 6, 12),
(142, 5, 94, '2025-01-26', 1880, 2, 12),
(143, 3, 24, '2025-02-08', 504, 8, 11),
(144, 2, 5, '2025-01-30', 105, 6, 18),
(145, 1, 5, '2025-01-26', 50, 8, 13),
(146, 1, 7, '2025-01-29', 70, 7, 13),
(147, 6, 89, '2025-02-01', 3115, 5, 7),
(148, 1, 33, '2025-02-06', 330, 6, 14),
(149, 1, 39, '2025-02-06', 390, 7, 15),
(150, 1, 2, '2025-01-26', 20, 5, 14),
(151, 4, 57, '2025-01-27', 1995, 6, 15),
(152, 2, 1, '2025-02-06', 21, 7, 16),
(153, 6, 6, '2025-01-27', 210, 6, 16),
(154, 4, 23, '2025-02-07', 805, 8, 10),
(155, 3, 7, '2025-01-31', 147, 7, 13),
(156, 5, 4, '2025-02-03', 80, 2, 7),
(157, 4, 5, '2025-02-02', 175, 6, 8),
(158, 3, 5, '2025-02-04', 105, 8, 8),
(159, 3, 32, '2025-01-27', 672, 8, 17),
(160, 4, 13, '2025-02-05', 455, 5, 9),
(161, 5, 1, '2025-02-01', 20, 5, 8),
(162, 1, 2, '2025-02-07', 20, 6, 11),
(163, 3, 76, '2025-02-02', 1596, 6, 9),
(164, 4, 2, '2025-01-26', 70, 2, 15),
(165, 5, 15, '2025-02-05', 300, 6, 10),
(166, 3, 17, '2025-01-28', 357, 2, 10),
(167, 2, 30, '2025-02-08', 630, 7, 12),
(168, 2, 8, '2025-02-04', 168, 6, 9),
(169, 1, 56, '2025-01-27', 560, 5, 18),
(170, 5, 3, '2025-01-28', 60, 5, 11),
(171, 6, 10, '2025-02-07', 350, 5, 12),
(172, 3, 1, '2025-02-02', 21, 6, 10),
(173, 5, 2, '2025-01-29', 40, 5, 14),
(174, 4, 21, '2025-02-06', 735, 8, 17),
(175, 2, 4, '2025-01-29', 84, 2, 15),
(176, 4, 7, '2025-01-30', 245, 5, 19),
(177, 2, 1, '2025-02-06', 21, 2, 18),
(178, 2, 25, '2025-02-08', 525, 2, 13),
(179, 4, 78, '2025-02-08', 2730, 7, 14),
(180, 5, 1, '2025-01-29', 20, 5, 16),
(181, 5, 70, '2025-01-31', 1400, 6, 14),
(182, 4, 18, '2025-01-27', 630, 8, 19),
(183, 6, 3, '2025-01-28', 105, 2, 12),
(184, 4, 14, '2025-02-08', 490, 5, 15),
(185, 5, 2, '2025-01-27', 40, 7, 20),
(186, 3, 1, '2025-02-04', 21, 2, 10),
(187, 5, 4, '2025-01-28', 80, 8, 13),
(188, 4, 15, '2025-02-06', 525, 7, 19),
(189, 1, 10, '2025-01-28', 100, 7, 14),
(190, 4, 71, '2025-01-31', 2485, 2, 15),
(191, 3, 32, '2025-01-31', 672, 8, 16),
(192, 5, 24, '2025-02-05', 480, 8, 11),
(193, 5, 7, '2025-02-04', 140, 8, 11),
(194, 4, 2, '2025-02-06', 70, 5, 20),
(195, 4, 4, '2025-01-29', 140, 6, 17),
(196, 6, 1, '2025-02-05', 35, 5, 12),
(197, 2, 13, '2025-02-01', 273, 6, 9),
(198, 3, 11, '2025-02-08', 231, 5, 16),
(199, 6, 3, '2025-02-04', 105, 5, 12),
(200, 6, 5, '2025-01-28', 175, 8, 15);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `middle_Initial` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `first_name`, `middle_Initial`, `last_name`, `age`, `username`, `password`, `role`) VALUES
(1, 'AJ', 'E', 'Catli', 22, 'catliaj', 'admin', 'admin'),
(2, 'Nemo', 'fish', 'Find', 30, 'nemo123', 'staff', 'staff'),
(3, 'Jared Jeffrey', 'A', 'Abellera', 20, 'red', 'blue', 'admin'),
(4, 'Aravheiyl', 'B', 'Felicisimo', 20, 'ara', 'araara', 'admin'),
(5, 'Christian Paul', 'E', 'Mendoza', 21, 'paul', 'chatgpt', 'staff'),
(6, 'Yeoj Cedrick', 'D', 'Valdez', 20, 'joey', 'hirono', 'staff'),
(7, 'Jessen', 'M', 'Salaysay', 21, 'jessen', 'flying', 'staff'),
(8, 'Clarence', 'R', 'Adrias', 21, 'clarence', 'clutch', 'staff');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`Product_id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`Sales_id`),
  ADD KEY `fk_productid` (`Product_id`),
  ADD KEY `fk_sales_users` (`user_id`),
  ADD KEY `fk_sales_orders` (`order_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `Product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `Sales_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
