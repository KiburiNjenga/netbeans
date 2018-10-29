-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 02, 2014 at 09:13 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hsas`
--

-- --------------------------------------------------------

--
-- Table structure for table `consultation`
--

CREATE TABLE IF NOT EXISTS `consultation` (
  `patientid` int(10) NOT NULL,
  `idnum` int(11) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `status` char(50) NOT NULL,
  `consultation` text NOT NULL,
  `test` text NOT NULL,
  `result` text NOT NULL,
  `disease` text NOT NULL,
  `medication` text NOT NULL,
  `time` time NOT NULL,
  `date` date NOT NULL,
  `paid` char(50) NOT NULL,
  `amount` double NOT NULL,
  KEY `FK_consultation_patient` (`idnum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consultation`
--

INSERT INTO `consultation` (`patientid`, `idnum`, `fname`, `sname`, `dob`, `status`, `consultation`, `test`, `result`, `disease`, `medication`, `time`, `date`, `paid`, `amount`) VALUES
(37, 12390, 'ALICE', 'MUCHERU', '1990-10-10', 'Paid', 'ddddddd', 'ff', 'no virus', 'qqqqq', 'ww', '06:35:08', '2014-04-02', 'Paid', 2300);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `patientid` int(250) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `idnum` int(11) NOT NULL,
  `dob` date NOT NULL,
  `gender` char(6) NOT NULL,
  `address` varchar(50) NOT NULL,
  `contact` varchar(16) NOT NULL,
  PRIMARY KEY (`idnum`),
  UNIQUE KEY `patientid` (`patientid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientid`, `fname`, `sname`, `lname`, `idnum`, `dob`, `gender`, `address`, `contact`) VALUES
(79, 'EMILY', 'KARANJA', 'EMISH', 56, '1990-12-12', 'Female', '231, Embu', '3344'),
(37, 'ALICE', 'MUCHERU', 'NYAMBURA', 12390, '1990-10-10', 'Female', '123, Eld', '123341');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `fname` varchar(50) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `idnum` int(11) NOT NULL,
  `delegation` char(18) NOT NULL,
  `dob` date NOT NULL,
  `gender` char(8) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`idnum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`fname`, `sname`, `lname`, `idnum`, `delegation`, `dob`, `gender`, `contact`, `address`, `username`, `password`) VALUES
('cashier', 'cashier', NULL, 7755, 'cashier', '2014-04-02', 'male', '646474', 'yyyt', 'cashier', 'cashier'),
('allan', 'allan', NULL, 7777, 'lab attendant', '2014-04-02', 'male', '464646', '2223 nrb', 'lab', 'lab'),
('Alice', 'Mucheru', NULL, 9900, 'receptionist', '2014-04-02', 'female', '89987', '77888', 'receptionist', 'receptionist'),
('Alice', 'Mucheru', 'Nyambura', 12355, 'administrator', '0000-00-00', 'Female', '01122', '123', 'admin', 'admin'),
('Alice', 'Mucheru', NULL, 234489, 'Doctor', '2014-04-02', 'Female', '07112233', '123, Eld', 'alice', 'alice');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `consultation`
--
ALTER TABLE `consultation`
  ADD CONSTRAINT `FK_consultation_patient` FOREIGN KEY (`idnum`) REFERENCES `patient` (`idnum`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
