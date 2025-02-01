-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2025 at 06:39 AM
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
(6, 'Spaghetti', 'Foods', 35, 100, 'Olive Garden');

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
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`Sales_id`, `Product_id`, `Quantity_Sold`, `Sales_Date`, `Total_Sales`, `user_id`) VALUES
(1, 4, 100, '2025-01-19', 3500, 7),
(2, 2, 67, '2025-01-29', 1407, 8),
(3, 4, 46, '2025-01-26', 1610, 8),
(4, 1, 91, '2025-02-01', 910, 6),
(5, 3, 10, '2025-01-23', 210, 2),
(6, 4, 81, '2025-01-31', 2835, 2),
(7, 3, 25, '2025-01-22', 525, 7),
(8, 4, 68, '2025-01-20', 2380, 2),
(9, 3, 74, '2025-01-20', 1554, 2),
(10, 1, 73, '2025-01-30', 730, 8),
(11, 3, 58, '2025-02-01', 1218, 8),
(12, 4, 2, '2025-01-20', 70, 6),
(13, 4, 20, '2025-01-26', 700, 7),
(14, 2, 13, '2025-01-29', 273, 8),
(15, 1, 12, '2025-01-22', 120, 6),
(16, 2, 30, '2025-01-24', 630, 7),
(17, 6, 33, '2025-01-20', 1155, 6),
(18, 1, 17, '2025-01-30', 170, 8),
(19, 1, 42, '2025-01-29', 420, 7),
(20, 6, 2, '2025-01-21', 70, 8),
(21, 4, 2, '2025-01-31', 70, 2),
(22, 6, 15, '2025-01-25', 525, 8),
(23, 6, 14, '2025-02-01', 490, 5),
(24, 6, 64, '2025-01-24', 2240, 5),
(25, 5, 85, '2025-01-25', 1700, 7),
(26, 6, 76, '2025-01-26', 2660, 6),
(27, 4, 34, '2025-01-26', 1190, 7),
(28, 4, 96, '2025-01-28', 3360, 7),
(29, 4, 86, '2025-01-24', 3010, 7),
(30, 5, 68, '2025-01-27', 1360, 6),
(31, 2, 12, '2025-01-27', 252, 8),
(32, 5, 33, '2025-01-26', 660, 5),
(33, 1, 84, '2025-01-27', 840, 2),
(34, 6, 70, '2025-01-25', 2450, 5),
(35, 5, 20, '2025-01-28', 400, 5),
(36, 2, 4, '2025-01-28', 84, 5),
(37, 6, 15, '2025-01-20', 525, 2),
(38, 6, 2, '2025-01-26', 70, 7),
(39, 2, 67, '2025-01-19', 1407, 2),
(40, 5, 27, '2025-01-29', 540, 7),
(41, 5, 1, '2025-01-27', 20, 8),
(42, 1, 7, '2025-02-01', 70, 7),
(43, 2, 77, '2025-01-23', 1617, 2),
(44, 3, 9, '2025-02-01', 189, 5),
(45, 3, 72, '2025-01-27', 1512, 5),
(46, 5, 15, '2025-01-25', 300, 7),
(47, 5, 29, '2025-01-23', 580, 8),
(48, 2, 4, '2025-01-23', 84, 2),
(49, 1, 4, '2025-01-30', 40, 7),
(50, 4, 21, '2025-01-29', 735, 7),
(51, 6, 24, '2025-01-22', 840, 6),
(52, 6, 21, '2025-01-21', 735, 7),
(53, 5, 56, '2025-02-01', 1120, 5),
(54, 6, 39, '2025-01-19', 1365, 5),
(55, 4, 22, '2025-01-27', 770, 2),
(56, 6, 22, '2025-01-26', 770, 7),
(57, 6, 46, '2025-01-29', 1610, 6),
(58, 5, 22, '2025-02-01', 440, 2),
(59, 1, 58, '2025-01-31', 580, 5),
(60, 6, 7, '2025-01-31', 245, 7),
(61, 1, 54, '2025-01-20', 540, 2),
(62, 1, 15, '2025-01-25', 150, 7),
(63, 3, 22, '2025-01-30', 462, 5),
(64, 5, 66, '2025-01-22', 1320, 7),
(65, 1, 73, '2025-01-19', 730, 5),
(66, 6, 34, '2025-01-27', 1190, 6),
(67, 5, 11, '2025-01-22', 220, 2),
(68, 5, 36, '2025-01-23', 720, 8),
(69, 1, 66, '2025-01-22', 660, 5),
(70, 2, 98, '2025-01-25', 2058, 6),
(71, 2, 1, '2025-01-25', 21, 7),
(72, 4, 29, '2025-01-29', 1015, 8),
(73, 2, 1, '2025-01-25', 21, 5),
(74, 2, 6, '2025-01-24', 126, 2),
(75, 1, 32, '2025-01-31', 320, 8),
(76, 1, 16, '2025-01-22', 160, 6),
(77, 2, 69, '2025-01-27', 1449, 2),
(78, 4, 3, '2025-01-28', 105, 7),
(79, 1, 20, '2025-01-26', 200, 7),
(80, 2, 73, '2025-01-21', 1533, 8),
(81, 2, 17, '2025-01-31', 357, 6),
(82, 5, 63, '2025-01-26', 1260, 5),
(83, 6, 54, '2025-01-21', 1890, 6),
(84, 1, 1, '2025-01-27', 10, 6),
(85, 4, 38, '2025-01-22', 1330, 2),
(86, 6, 42, '2025-01-19', 1470, 5),
(87, 4, 6, '2025-01-25', 210, 7),
(88, 4, 29, '2025-01-25', 1015, 2),
(89, 6, 26, '2025-01-31', 910, 6),
(90, 1, 21, '2025-01-19', 210, 7),
(91, 1, 4, '2025-01-30', 40, 8),
(92, 5, 11, '2025-01-27', 220, 8),
(93, 6, 4, '2025-01-20', 140, 7),
(94, 1, 19, '2025-01-25', 190, 8),
(95, 3, 76, '2025-01-21', 1596, 2),
(96, 3, 20, '2025-01-27', 420, 2),
(97, 5, 1, '2025-01-26', 20, 2),
(98, 3, 44, '2025-01-26', 924, 7),
(99, 1, 3, '2025-01-31', 30, 2),
(100, 1, 1, '2025-02-01', 10, 2),
(101, 1, 5, '2025-01-31', 50, 5),
(102, 3, 87, '2025-01-31', 1827, 2),
(103, 5, 9, '2025-01-27', 180, 7),
(104, 5, 4, '2025-01-27', 80, 7),
(105, 3, 14, '2025-01-28', 294, 8),
(106, 4, 45, '2025-01-23', 1575, 7),
(107, 3, 6, '2025-01-27', 126, 7),
(108, 3, 46, '2025-01-30', 966, 5),
(109, 5, 25, '2025-01-29', 500, 7),
(110, 2, 27, '2025-01-19', 567, 5),
(111, 4, 7, '2025-01-27', 245, 8),
(112, 4, 50, '2025-01-23', 1750, 5),
(113, 3, 50, '2025-01-24', 1050, 7),
(114, 1, 2, '2025-01-31', 20, 5),
(115, 5, 30, '2025-01-23', 600, 8),
(116, 3, 56, '2025-01-26', 1176, 2),
(117, 3, 70, '2025-01-29', 1470, 7),
(118, 3, 1, '2025-01-27', 21, 8),
(119, 6, 10, '2025-01-25', 350, 7),
(120, 6, 51, '2025-01-22', 1785, 2),
(121, 6, 14, '2025-01-22', 490, 6),
(122, 4, 9, '2025-01-27', 315, 6),
(123, 6, 2, '2025-01-25', 70, 6),
(124, 6, 3, '2025-01-25', 105, 6),
(125, 3, 38, '2025-01-28', 798, 5),
(126, 5, 6, '2025-02-01', 120, 8),
(127, 3, 48, '2025-01-25', 1008, 6),
(128, 4, 37, '2025-01-25', 1295, 6),
(129, 4, 34, '2025-01-29', 1190, 7),
(130, 6, 10, '2025-01-27', 350, 7),
(131, 1, 4, '2025-01-27', 40, 6),
(132, 4, 1, '2025-01-25', 35, 5),
(133, 3, 30, '2025-01-30', 630, 7),
(134, 5, 21, '2025-01-22', 420, 6),
(135, 5, 1, '2025-01-26', 20, 5),
(136, 5, 72, '2025-01-19', 1440, 5),
(137, 2, 2, '2025-01-21', 42, 6),
(138, 6, 30, '2025-01-20', 1050, 7),
(139, 6, 15, '2025-01-31', 525, 2),
(140, 3, 2, '2025-01-28', 42, 2),
(141, 2, 70, '2025-02-01', 1470, 7),
(142, 5, 1, '2025-01-26', 20, 8),
(143, 5, 5, '2025-01-23', 100, 6),
(144, 3, 29, '2025-01-25', 609, 6),
(145, 1, 5, '2025-01-19', 50, 2),
(146, 2, 70, '2025-01-22', 1470, 8),
(147, 4, 60, '2025-02-01', 2100, 7),
(148, 3, 1, '2025-01-27', 21, 5),
(149, 3, 63, '2025-01-19', 1323, 7),
(150, 5, 55, '2025-01-30', 1100, 5),
(151, 3, 20, '2025-01-29', 420, 8),
(152, 6, 18, '2025-01-24', 630, 6),
(153, 3, 58, '2025-01-22', 1218, 2),
(154, 2, 20, '2025-01-21', 420, 5),
(155, 2, 50, '2025-01-24', 1050, 2),
(156, 1, 50, '2025-01-29', 500, 6),
(157, 6, 2, '2025-01-24', 70, 8),
(158, 2, 48, '2025-01-31', 1008, 5),
(159, 1, 18, '2025-01-25', 180, 7),
(160, 6, 12, '2025-01-31', 420, 8),
(161, 6, 12, '2025-01-24', 420, 7),
(162, 5, 85, '2025-01-24', 1700, 2),
(163, 6, 65, '2025-02-01', 2275, 7),
(164, 6, 44, '2025-01-27', 1540, 2),
(165, 3, 19, '2025-01-25', 399, 8),
(166, 3, 9, '2025-01-29', 189, 2),
(167, 6, 1, '2025-01-24', 35, 8),
(168, 1, 83, '2025-01-28', 830, 7),
(169, 4, 41, '2025-01-30', 1435, 6),
(170, 2, 78, '2025-01-30', 1638, 5),
(171, 3, 23, '2025-02-01', 483, 2),
(172, 2, 20, '2025-01-31', 420, 2),
(173, 3, 1, '2025-01-29', 21, 7),
(174, 6, 6, '2025-01-27', 210, 2),
(175, 4, 10, '2025-01-20', 350, 8),
(176, 2, 17, '2025-01-27', 357, 8),
(177, 5, 7, '2025-01-21', 140, 7),
(178, 2, 33, '2025-01-28', 693, 2),
(179, 1, 46, '2025-01-25', 460, 7),
(180, 6, 50, '2025-01-30', 1750, 2),
(181, 5, 90, '2025-01-21', 1800, 7),
(182, 2, 2, '2025-01-27', 42, 8),
(183, 5, 21, '2025-01-19', 420, 2),
(184, 3, 5, '2025-02-01', 105, 8),
(185, 5, 1, '2025-01-26', 20, 7),
(186, 3, 2, '2025-01-31', 42, 5),
(187, 1, 10, '2025-01-26', 100, 8),
(188, 5, 49, '2025-01-28', 980, 5),
(189, 4, 13, '2025-01-24', 455, 6),
(190, 4, 3, '2025-01-20', 105, 2),
(191, 1, 15, '2025-01-26', 150, 2),
(192, 6, 6, '2025-01-22', 210, 2),
(193, 2, 12, '2025-01-31', 252, 7),
(194, 3, 3, '2025-01-25', 63, 2),
(195, 1, 18, '2025-01-26', 180, 2),
(196, 1, 1, '2025-01-25', 10, 7),
(197, 2, 6, '2025-01-19', 126, 6),
(198, 6, 4, '2025-02-01', 140, 2),
(199, 6, 17, '2025-01-20', 595, 2),
(200, 6, 30, '2025-01-29', 1050, 2);

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
  ADD KEY `fk_sales_users` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

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

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `fk_sales_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
