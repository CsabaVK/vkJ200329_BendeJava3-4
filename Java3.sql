-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Hoszt: localhost
-- Létrehozás ideje: 2015. ápr. 19. 15:50
-- Szerver verzió: 5.5.16
-- PHP verzió: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Adatbázis: `konyvtar`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet: `konyvek`
--

CREATE TABLE IF NOT EXISTS `javakonyvek` (
  `azon` varchar(8) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `szerzo` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `cim` varchar(70) CHARACTER SET utf8 DEFAULT NULL,
  `kiadasev` int(11) DEFAULT NULL,
  `mennyiseg` int(11) DEFAULT NULL,
  `ar` int(11) DEFAULT NULL,
  `kolcsonozheto` varchar(4) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`azon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- A tábla adatainak kiíratása `konyvek`
--

INSERT INTO `javakonyvek` (`azon`, `szerzo`, `cim`, `kiadasev`, `mennyiseg`, `ar`, `kolcsonozheto`) VALUES
('1983/001', 'Arany János', 'Toldi trilógia', 1982, 5, 120, 'Nem'),
('1984/040', 'Jókai Mór', 'Aranyember', 1895, 1, 45000, 'Igen'),
('1984/045', 'Mikes Kelemen', 'Levelek', 1895, 1, 45000, 'Igen'),
('1984/046', 'Petőfi Sándor', 'Összes művei', 1880, 1, 50000, 'Igen'),
('1984/047', 'Arany János', 'Összes művei', 1880, 1, 50000, 'Igen'),
('1994/012', 'Bakos Ferenc és társai', 'Magyar Larousse lexikon I.', 1991, 1, 2500, 'Igen'),
('1994/013', 'Ruzsinszky Éva és társai', 'Magyar Larousse lexikon II.', 1992, 1, 2500, 'Igen'),
('1994/014', 'Ruzsinszky Éva és társai', 'Magyar Larousse lexikon III.', 1994, 1, 3300, 'Igen'),
('1994/044', 'Markó László', 'Officina egyetemes lexikon', 1994, 1, 4500, 'Igen'),
('1996/034', 'Glatz Ferenc', 'A magyarok krónikája', 1996, 1, 6500, 'Igen'),
('1999/001', 'Ady Endre', 'Válogatott versek', 1998, 3, 199, 'Nem'),
('1999/002', 'Arany János', 'Balladák', 1998, 8, 149, 'Nem'),
('1999/003', 'Arany János', 'Bolond Istók', 1998, 5, 590, 'Nem'),
('1999/004', 'Benedek Elek', 'Nagy mesekönyv', 1999, 2, 3990, 'Nem'),
('1999/005', 'Benedek Elek', 'Világszép nádszál kisasszony', 1999, 2, 400, 'Nem'),
('1999/006', 'Budai László', 'Kevés szóval angolul', 1999, 5, 840, 'Nem'),
('1999/007', 'Csorba Csaba', 'Árpád népe', 1999, 2, 1490, 'Nem'),
('1999/008', 'Daniel Defoe', 'Robinson Crusoe', 1999, 5, 299, 'Nem'),
('1999/009', 'Esterházy Péter', 'Harmonia Caelestis', 1999, 3, 2490, 'Nem'),
('1999/010', 'Gárdonyi Géza', 'A láthatatlan ember', 1999, 8, 299, 'Nem'),
('1999/011', 'Gárdonyi Géza', 'Szunyoghy miatyánkja', 1999, 5, 2900, 'Nem'),
('1999/012', 'Hársing Lajos', 'Irodalmi játékok', 1999, 3, 725, 'Nem'),
('1999/013', 'Hóman Bálint', 'Szent István', 1999, 1, 2200, 'Igen'),
('1999/014', 'Janikovszky Éva', 'Felnőtteknek írtam', 1999, 5, 998, 'Nem'),
('1999/015', 'Karinthy Frigyes', 'Tanár úr kérem', 1999, 10, 149, 'Nem'),
('1999/016', 'Katona József', 'Bánk bán', 1999, 5, 199, 'Nem'),
('1999/017', 'Kazinczy Ferenc', 'Fogságom naplója', 1999, 3, 590, 'Nem'),
('1999/018', 'Kóczy A. Judit', 'Excel for Windows''95', 1999, 3, 1990, 'Nem'),
('1999/019', 'Kosztolányi Dezső', 'Pacsirta', 1999, 5, 379, 'Nem'),
('1999/020', 'Tamási Áron', 'Magyari Rózsafa', 1999, 6, 1800, 'Nem'),
('1999/021', 'Tóth Imre', 'Isten és geometria', 1999, 6, 1280, 'Nem'),
('1999/022', 'Bakos Ferenc', 'Idegen szavak szótára', 1999, 10, 2100, 'Nem'),
('1999/023', 'Voltaire', 'Candide', 1999, 6, 199, 'Nem'),
('1999/024', 'Pósa Lajos', 'Analízis', 1999, 5, 620, 'Nem'),
('1999/025', 'Móricz Zsigmond', 'Úri muri', 1999, 10, 249, 'Nem'),
('2000/001', 'Móra Ferenc', 'Kincskereső kisködmön', 1999, 10, 199, 'Nem'),
('2000/002', 'Moldova György', 'Arrivederci', 1999, 6, 1050, 'Nem'),
('2000/003', 'Mikszáth Kálmán', 'Szent Péter esernyője', 1999, 10, 249, 'Nem'),
('2000/004', 'Mikszáth Kálmán', 'A tót atyafiak', 1999, 10, 249, 'Nem'),
('2000/005', 'Mikszáth Kálmán', 'Beszterce ostroma', 1999, 10, 249, 'Nem'),
('2000/006', 'Petőfi Sándor', 'Válogatott versek', 2000, 6, 199, 'Nem'),
('2000/007', 'Petőfi Sándor', 'János vitéz', 2000, 5, 1498, 'Nem'),
('2000/008', 'Nemere István', 'A szerelem illata', 2000, 4, 575, 'Nem'),
('2000/009', 'Nemere István', 'Afrikai szerető', 2000, 4, 575, 'Nem'),
('2000/010', 'Jókai Mór', 'A kőszívű ember fiai', 2000, 10, 399, 'Nem'),
('2000/011', 'Jókai Mór', 'Árpád és a magyarok őskora', 2000, 5, 700, 'Nem'),
('2000/012', 'Jósika Miklós', 'Emlékkönyv', 2000, 3, 1800, 'Nem'),
('2000/013', 'Nagy Gábor', 'Lélekvesztő', 2000, 5, 650, 'Nem'),
('2000/014', 'József Attila', 'Válogatott versek', 2000, 10, 199, 'Nem');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
