-- MySqlBackup.NET 2.0.9.2
-- Dump Time: 2020-11-03 18:18:01
-- --------------------------------------
-- Server version 5.7.26-log MySQL Community Server (GPL)

-- 
-- Create schema tubespbo
-- 

CREATE DATABASE IF NOT EXISTS `tubespbo` /*!40100 DEFAULT CHARACTER SET utf8 */;
Use `tubespbo`;



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 
-- Definition of daak
-- 

DROP TABLE IF EXISTS `daak`;
CREATE TABLE IF NOT EXISTS `daak` (
  `NIK` char(10) NOT NULL,
  `ID_User` char(32) NOT NULL,
  `Jabatan` varchar(256) NOT NULL,
  `Hak_Akses_Keuangan` tinyint(1) NOT NULL,
  `Hak_Akses_Kemahasiswaan` tinyint(1) NOT NULL,
  `Hak_Akses_Perkuliahan` tinyint(1) NOT NULL,
  `Hak_Akses_Dosen` tinyint(1) NOT NULL,
  `Hak_Akses_Admin` tinyint(1) NOT NULL,
  PRIMARY KEY (`NIK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table daak
-- 

/*!40000 ALTER TABLE `daak` DISABLE KEYS */;

/*!40000 ALTER TABLE `daak` ENABLE KEYS */;

-- 
-- Definition of daftar_hadir_mahasiswa
-- 

DROP TABLE IF EXISTS `daftar_hadir_mahasiswa`;
CREATE TABLE IF NOT EXISTS `daftar_hadir_mahasiswa` (
  `ID_Kehadiran` int(11) NOT NULL AUTO_INCREMENT,
  `NIM` char(8) NOT NULL,
  `ID_MK` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `Status` varchar(256) NOT NULL,
  PRIMARY KEY (`ID_Kehadiran`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table daftar_hadir_mahasiswa
-- 

/*!40000 ALTER TABLE `daftar_hadir_mahasiswa` DISABLE KEYS */;

/*!40000 ALTER TABLE `daftar_hadir_mahasiswa` ENABLE KEYS */;

-- 
-- Definition of daftar_roster_matakuliah
-- 

DROP TABLE IF EXISTS `daftar_roster_matakuliah`;
CREATE TABLE IF NOT EXISTS `daftar_roster_matakuliah` (
  `ID_Roster` int(11) NOT NULL,
  `ID_MK` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `Ruangan` varchar(256) NOT NULL,
  `Jam_Dimulai` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Jam_Berakhir` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID_Roster`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table daftar_roster_matakuliah
-- 

/*!40000 ALTER TABLE `daftar_roster_matakuliah` DISABLE KEYS */;

/*!40000 ALTER TABLE `daftar_roster_matakuliah` ENABLE KEYS */;

-- 
-- Definition of detail_matakuliah
-- 

DROP TABLE IF EXISTS `detail_matakuliah`;
CREATE TABLE IF NOT EXISTS `detail_matakuliah` (
  `ID_MK` int(11) NOT NULL AUTO_INCREMENT,
  `NID` char(8) NOT NULL,
  `Kode_MK` char(6) NOT NULL,
  `Tahun` year(4) NOT NULL,
  `Semester` char(1) NOT NULL,
  PRIMARY KEY (`ID_MK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table detail_matakuliah
-- 

/*!40000 ALTER TABLE `detail_matakuliah` DISABLE KEYS */;

/*!40000 ALTER TABLE `detail_matakuliah` ENABLE KEYS */;

-- 
-- Definition of detail_rencana_studi_mahasiswa
-- 

DROP TABLE IF EXISTS `detail_rencana_studi_mahasiswa`;
CREATE TABLE IF NOT EXISTS `detail_rencana_studi_mahasiswa` (
  `ID_MK` int(11) NOT NULL,
  `ID_RSM` char(20) NOT NULL,
  PRIMARY KEY (`ID_MK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table detail_rencana_studi_mahasiswa
-- 

/*!40000 ALTER TABLE `detail_rencana_studi_mahasiswa` DISABLE KEYS */;

/*!40000 ALTER TABLE `detail_rencana_studi_mahasiswa` ENABLE KEYS */;

-- 
-- Definition of detail_transaksi
-- 

DROP TABLE IF EXISTS `detail_transaksi`;
CREATE TABLE IF NOT EXISTS `detail_transaksi` (
  `ID_Detail` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Transaksi` int(11) NOT NULL,
  `ID_Kategori` int(11) NOT NULL,
  PRIMARY KEY (`ID_Detail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table detail_transaksi
-- 

/*!40000 ALTER TABLE `detail_transaksi` DISABLE KEYS */;

/*!40000 ALTER TABLE `detail_transaksi` ENABLE KEYS */;

-- 
-- Definition of dosen
-- 

DROP TABLE IF EXISTS `dosen`;
CREATE TABLE IF NOT EXISTS `dosen` (
  `NID` char(8) NOT NULL,
  `ID_User` char(32) NOT NULL,
  `Program_Studi` char(20) NOT NULL,
  `Bidang_Ilmu` char(20) NOT NULL,
  `Gelar_Akademik` char(20) NOT NULL,
  `Status_Pegawai` char(20) NOT NULL,
  `Status_Ikatan_Kerja` char(20) NOT NULL,
  PRIMARY KEY (`NID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table dosen
-- 

/*!40000 ALTER TABLE `dosen` DISABLE KEYS */;

/*!40000 ALTER TABLE `dosen` ENABLE KEYS */;

-- 
-- Definition of hasil_studi_mahasiswa
-- 

DROP TABLE IF EXISTS `hasil_studi_mahasiswa`;
CREATE TABLE IF NOT EXISTS `hasil_studi_mahasiswa` (
  `ID_HSM` int(11) NOT NULL AUTO_INCREMENT,
  `NIM` char(8) NOT NULL,
  `ID_MK` int(11) NOT NULL,
  `N1` int(11) NOT NULL,
  `N2` int(11) NOT NULL,
  `N3` int(11) NOT NULL,
  `N4` int(11) NOT NULL,
  `N5` int(11) NOT NULL,
  `N_UAS` int(11) NOT NULL,
  `NA` double NOT NULL,
  `Huruf` char(2) NOT NULL,
  PRIMARY KEY (`ID_HSM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table hasil_studi_mahasiswa
-- 

/*!40000 ALTER TABLE `hasil_studi_mahasiswa` DISABLE KEYS */;

/*!40000 ALTER TABLE `hasil_studi_mahasiswa` ENABLE KEYS */;

-- 
-- Definition of kategori_transaksi
-- 

DROP TABLE IF EXISTS `kategori_transaksi`;
CREATE TABLE IF NOT EXISTS `kategori_transaksi` (
  `ID_Kategori` int(11) NOT NULL AUTO_INCREMENT,
  `Nama_Kategori` varchar(256) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Kategori_Semester` char(1) NOT NULL,
  `Kategori_Angkatan` int(11) NOT NULL,
  `Tahun_Ajaran` year(4) NOT NULL,
  PRIMARY KEY (`ID_Kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table kategori_transaksi
-- 

/*!40000 ALTER TABLE `kategori_transaksi` DISABLE KEYS */;

/*!40000 ALTER TABLE `kategori_transaksi` ENABLE KEYS */;

-- 
-- Definition of mahasiswa
-- 

DROP TABLE IF EXISTS `mahasiswa`;
CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `NIM` char(8) NOT NULL,
  `ID_User` char(32) NOT NULL,
  `Jurusan` varchar(256) NOT NULL,
  `Tahun_Masuk` year(4) NOT NULL,
  `Tahun_Lulus` year(4) NOT NULL,
  `IPK` double NOT NULL,
  `Predikat` varchar(256) NOT NULL,
  PRIMARY KEY (`NIM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table mahasiswa
-- 

/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;

/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;

-- 
-- Definition of matakuliah
-- 

DROP TABLE IF EXISTS `matakuliah`;
CREATE TABLE IF NOT EXISTS `matakuliah` (
  `Kode` char(6) NOT NULL,
  `Nama_MK` varchar(256) NOT NULL,
  `Jenis_MK` int(11) NOT NULL,
  `Sifat_MK` int(11) NOT NULL,
  `SKS` int(11) NOT NULL,
  PRIMARY KEY (`Kode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table matakuliah
-- 

/*!40000 ALTER TABLE `matakuliah` DISABLE KEYS */;

/*!40000 ALTER TABLE `matakuliah` ENABLE KEYS */;

-- 
-- Definition of rencana_studi_mahasiswa
-- 

DROP TABLE IF EXISTS `rencana_studi_mahasiswa`;
CREATE TABLE IF NOT EXISTS `rencana_studi_mahasiswa` (
  `ID_RSM` int(11) NOT NULL,
  `NIM` char(8) NOT NULL,
  `Semester` char(1) NOT NULL,
  `Tahun` year(4) NOT NULL,
  PRIMARY KEY (`ID_RSM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table rencana_studi_mahasiswa
-- 

/*!40000 ALTER TABLE `rencana_studi_mahasiswa` DISABLE KEYS */;

/*!40000 ALTER TABLE `rencana_studi_mahasiswa` ENABLE KEYS */;

-- 
-- Definition of transaksi
-- 

DROP TABLE IF EXISTS `transaksi`;
CREATE TABLE IF NOT EXISTS `transaksi` (
  `ID_Transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `NIM` char(8) NOT NULL,
  `ID_RSM` int(11) NOT NULL,
  `Tanggal_Transaksi` date NOT NULL,
  `Jumlah_Bayar` int(11) NOT NULL,
  `Tahun_Ajaran` year(4) NOT NULL,
  `Semester` char(1) NOT NULL,
  PRIMARY KEY (`ID_Transaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table transaksi
-- 

/*!40000 ALTER TABLE `transaksi` DISABLE KEYS */;

/*!40000 ALTER TABLE `transaksi` ENABLE KEYS */;

-- 
-- Definition of user
-- 

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `ID_User` char(32) NOT NULL,
  `Nama_Lengkap` varchar(256) NOT NULL,
  `Email` varchar(256) NOT NULL,
  `Password` char(64) NOT NULL,
  `Tanggal_Lahir` date NOT NULL,
  `Jenis_Kelamin` char(2) NOT NULL,
  `No_Telp` varchar(256) NOT NULL,
  PRIMARY KEY (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table user
-- 

/*!40000 ALTER TABLE `user` DISABLE KEYS */;

/*!40000 ALTER TABLE `user` ENABLE KEYS */;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


-- Dump completed on 2020-11-03 18:18:01
-- Total time: 0:0:0:0:328 (d:h:m:s:ms)
