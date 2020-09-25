-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Сен 25 2020 г., 19:03
-- Версия сервера: 10.4.8-MariaDB
-- Версия PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `kpo`
--

-- --------------------------------------------------------

--
-- Структура таблицы `schedule`
--

CREATE TABLE `schedule` (
  `ID` int(5) NOT NULL,
  `Teacher` int(5) NOT NULL,
  `Subject` int(5) NOT NULL,
  `Day` varchar(10) NOT NULL,
  `classroom` varchar(10) NOT NULL,
  `Quantity` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `schedule`
--

INSERT INTO `schedule` (`ID`, `Teacher`, `Subject`, `Day`, `classroom`, `Quantity`) VALUES
(4, 27, 6, 'Wednesday', '135', 44),
(6, 15, 5, 'Saturday', '105', 37),
(8, 30, 4, 'Saturday', '184', 15),
(10, 1, 3, 'Thursday', '137', 34),
(11, 20, 8, 'Tuesday', '160', 35),
(13, 11, 3, 'Sunday', '115', 41),
(15, 6, 8, 'Wednesday', '119', 21),
(16, 29, 3, 'Saturday', '110', 32),
(17, 16, 4, 'Tuesday', '188', 44),
(19, 26, 10, 'Saturday', '158', 32),
(23, 13, 13, 'Sunday', '141', 19),
(24, 14, 2, 'Sunday', '112', 30),
(25, 13, 12, 'Sunday', '176', 40),
(26, 6, 7, 'Tuesday', '124', 33),
(27, 20, 12, 'Saturday', '126', 24),
(29, 1, 12, 'Saturday', '121', 38),
(30, 8, 12, 'Saturday', '170', 47),
(33, 14, 7, 'Tuesday', '129', 48),
(34, 20, 5, 'Sunday', '144', 34),
(35, 10, 4, 'Tuesday', '131', 26),
(37, 27, 2, 'Tuesday', '142', 25),
(38, 11, 4, 'Tuesday', '140', 43),
(39, 25, 12, 'Sunday', '189', 18),
(40, 6, 3, 'Tuesday', '126', 43),
(50, 3, 6, 'Monday', '107', 18),
(51, 15, 2, 'Monday', '126', 47),
(52, 8, 6, 'Monday', '107', 43),
(53, 6, 1, 'Monday', '124', 42),
(54, 25, 3, 'Monday', '195', 27),
(55, 11, 10, 'Sunday', '129', 24);

-- --------------------------------------------------------

--
-- Структура таблицы `subjects`
--

CREATE TABLE `subjects` (
  `ID` int(5) NOT NULL,
  `Name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `subjects`
--

INSERT INTO `subjects` (`ID`, `Name`) VALUES
(1, 'Math'),
(2, 'Music'),
(3, 'Russian Language'),
(4, 'Physical Education'),
(5, 'English Language'),
(6, 'History'),
(7, 'Literature'),
(8, 'Geography'),
(9, 'Biology'),
(10, 'Informatics'),
(11, 'Physics'),
(12, 'Chemistry'),
(13, 'Economics'),
(14, 'Philosophy');

-- --------------------------------------------------------

--
-- Структура таблицы `teachers`
--

CREATE TABLE `teachers` (
  `ID` int(11) NOT NULL,
  `Surname` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Patronymic` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `teachers`
--

INSERT INTO `teachers` (`ID`, `Surname`, `Name`, `Patronymic`) VALUES
(1, 'Stafford', 'Carolyn', 'Ryder'),
(2, 'Grant', 'Ava', 'Kirk'),
(3, 'Joseph', 'Sonya', 'Andrew'),
(4, 'Briggs', 'Salvador', 'Byron'),
(5, 'Mckinney', 'Dara', 'Ferdinand'),
(6, 'Mcpherson', 'Tasha', 'Honorato'),
(7, 'Kennedy', 'Cain', 'Yoshio'),
(8, 'Ramos', 'Lamar', 'Blake'),
(9, 'Herrera', 'Ruth', 'Carl'),
(10, 'Carson', 'Sigourney', 'Carter'),
(11, 'Kidd', 'Moana', 'Herman'),
(12, 'Bond', 'Travis', 'Igor'),
(13, 'Floyd', 'Finn', 'Aquila'),
(14, 'Klein', 'Gay', 'Merritt'),
(15, 'Lindsey', 'Kato', 'Caleb'),
(16, 'Rodriquez', 'Mara', 'Zachary'),
(17, 'Pierce', 'Dennis', 'Merrill'),
(18, 'Hopper', 'Inez', 'Odysseus'),
(19, 'Edwards', 'Yardley', 'Stuart'),
(20, 'Skinner', 'Karleigh', 'Flynn'),
(21, 'Miranda', 'Indira', 'Axel'),
(22, 'Melton', 'Nayda', 'Rahim'),
(23, 'Padilla', 'Quinn', 'Declan'),
(24, 'Burris', 'Jerome', 'Lamar'),
(25, 'Madden', 'Shea', 'Colin'),
(26, 'Cantu', 'Conan', 'Ivor'),
(27, 'Wise', 'Gregory', 'Malik'),
(28, 'Jimenez', 'Fredericka', 'Timothy'),
(29, 'Juarez', 'George', 'Gage'),
(30, 'Gomez', 'Cally', 'Vernon');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Teacher` (`Teacher`),
  ADD KEY `Subject` (`Subject`);

--
-- Индексы таблицы `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`ID`);

--
-- Индексы таблицы `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `schedule`
--
ALTER TABLE `schedule`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT для таблицы `subjects`
--
ALTER TABLE `subjects`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT для таблицы `teachers`
--
ALTER TABLE `teachers`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `schedule`
--
ALTER TABLE `schedule`
  ADD CONSTRAINT `schedule_ibfk_1` FOREIGN KEY (`Teacher`) REFERENCES `teachers` (`ID`),
  ADD CONSTRAINT `schedule_ibfk_2` FOREIGN KEY (`Subject`) REFERENCES `subjects` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
