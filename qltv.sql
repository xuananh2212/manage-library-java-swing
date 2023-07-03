USE [master]
GO
/****** Object:  Database [QLTV]    Script Date: 2/2/2023 9:13:02 PM ******/
CREATE DATABASE [QLTV]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLTV', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\QLTV.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLTV_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\QLTV_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [QLTV] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLTV].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLTV] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLTV] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLTV] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLTV] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLTV] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLTV] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLTV] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLTV] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLTV] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLTV] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLTV] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLTV] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLTV] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLTV] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLTV] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLTV] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLTV] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLTV] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLTV] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLTV] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLTV] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLTV] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLTV] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLTV] SET  MULTI_USER 
GO
ALTER DATABASE [QLTV] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLTV] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLTV] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLTV] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLTV] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLTV] SET QUERY_STORE = OFF
GO
USE [QLTV]
GO
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [QLTV]
GO
/****** Object:  Table [dbo].[book]    Script Date: 2/2/2023 9:13:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[book](
	[bookId] [varchar](10) NOT NULL,
	[nameB] [nvarchar](50) NOT NULL,
	[category] [nvarchar](50) NULL,
	[author] [nvarchar](50) NULL,
	[producer] [nvarchar](50) NULL,
	[price] [float] NULL,
	[count] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[bookId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee]    Script Date: 2/2/2023 9:13:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[tk] [varchar](50) NULL,
	[passwd] [varchar](50) NULL,
	[name] [nvarchar](20) NULL,
	[gender] [nvarchar](5) NULL,
	[birthdayS] [date] NULL,
	[address] [nvarchar](50) NULL,
	[phone] [varchar](11) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[registerbook]    Script Date: 2/2/2023 9:13:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[registerbook](
	[studentId] [varchar](20) NOT NULL,
	[bookId] [varchar](20) NOT NULL,
	[amount] [int] NULL,
	[borrowDate] [varchar](50) NULL,
	[appointDate] [varchar](50) NULL,
	[payDate] [varchar](50) NULL,
	[giveBookBack] [nvarchar](30) NULL,
 CONSTRAINT [p_ka] PRIMARY KEY CLUSTERED 
(
	[studentId] ASC,
	[bookId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[student]    Script Date: 2/2/2023 9:13:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[student](
	[studentId] [varchar](8) NOT NULL,
	[nameS] [nvarchar](50) NULL,
	[gender] [nvarchar](5) NULL,
	[birthdayS] [date] NULL,
	[class] [varchar](25) NULL,
	[address] [nvarchar](30) NULL,
	[marjor] [nvarchar](30) NULL,
	[phone] [varchar](11) NULL,
	[mail] [varchar](50) NULL,
	[passwd] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[studentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10001', N'Chương Trình Dịch', N'Công Nghệ Thông  Tin', N'Nguyễn Văn Phác', N'Học Viện Kĩ Thuật Mật Mã', 12500, 17)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10002', N'Lập Trình Hướng Đối Tượng', N'Công Nghệ Thông Tin', N'Lê Bá Cường', N'Học Viện Kĩ Thuật Mật Mã', 22500, 56)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10003', N'Kỹ Thuật Máy Tính', N'Công Nghệ Thông Tin', N'Vũ Văn Kiên', N'Đại Học Bách Khoa', 32500, 26)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10004', N'Cấu Trúc Dữ Liệu', N'Công Nghệ Thông Tin', N'Nguyễn Văn Phác', N'Học Viện Kĩ Thuật Mật Mã', 32500, 30)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10005', N'Cơ Sở Dữ Liệu', N'Công Nghệ Thông Tin', N'Nguyễn Thùy Trang', N'Đại Học Quốc Gia', 12500, 19)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10006', N'Hệ Thống Nhúng', N'Công Nghệ Thông Tin', N'Lê Bá Cường', N'Học Viện Kĩ Thuật Mật Mã', 22500, 26)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10007', N'Khai Thác Lỗ Hỏng', N'An Toàn Thông Tin', N'Nguyễn Thị Giang', N'Học Viện Kĩ Thuật Mật Mã', 12500, 23)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10008', N'Mã Độc', N'An Toàn Thông Tin', N'Nguyễn Ngọc Quang', N'Đại Học Khoa Học Tự Nhiên', 12500, 27)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10009', N'An Thông Mạng Không Dây', N'An Toàn Thông Tin', N'Nguyễn Văn Thắng', N'Học Viện Bưu Chính', 22000, 8)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10010', N'Quản Lý An Toàn Thông Tin', N'An Toàn Thông Tin', N'Đồng Văn Nghĩa', N'Đại Học FPT', 42000, 29)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10011', N'Tấn Công Và Phòng Thủ HT ', N'An Toàn Thông Tin', N'Đặng Xuân Nghĩa', N'Học Viện Kĩ Thuật Mật Mã', 12500, 27)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10012', N'Thiết Kế Vi Mạch Số', N'Điện Tử Viễn Thông', N'Lý Ngọc Ánh', N'Học Viện Kĩ Thuật Mật Mã', 32000, 48)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10013', N'Cơ Sở Điều Khiển', N'Điện Tử Viễn Thông', N'Trần Xuân Hùng', N'Học Viện Bưu Chính', 44500, 28)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10014', N'Điện Tử Tương Tự', N'Điện Tử Viễn Thông', N'Nguyễn Hồng Phong', N'Học Viện Kĩ Thuật Mật Mã', 42500, 30)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10015', N'Hệ Thống Viễn Thông', N'Điện Tử Viễn Thông', N'Nguyễn Văn Phượng', N'Học Viện Kĩ Thuật Mật Mã', 32500, 30)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10016', N'Linux và Phần mền mã mở', N'Công Nghệ Thông  Tin', N'Trần Văn Xuân', N'Đại Học Công Nghệ', 22500, 18)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10017', N'Toán Rời Rạc', N'Đại Cương', N'Nguyễn Hữu Cường', N'Đại Học Kĩ Thuật Hưng Yên', 13500, 12)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10018', N'Toán a2', N'Đại Cương', N'Nguyễn Văn Đệ', N'Học Viện Kĩ Thuật Mật Mã', 23500, 10)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10020', N'An Toàn Mạng', N'An Toàn Thông Tin', N'Nguyễn Hữu Nghĩa', N'Học Viện Kĩ Thuật Mật Mã', 12500, 100)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10021', N'Cơ Sở Dữ Liệu', N'Công Nghệ Thông Tin', N'Lê Bá Cường', N'Học Viện Kĩ Thuật Mật Mã', 12500, 39)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10022', N'Cơ Sở Dữ Liệu', N'Công Nghệ Thông Tin', N'Nguyễn Văn Phác', N'Học Viện Kĩ Thuật Mật Mã', 29000, 20)
INSERT [dbo].[book] ([bookId], [nameB], [category], [author], [producer], [price], [count]) VALUES (N'KMA10023', N'Chương trình dịch', N'Công Nghệ Thông Tin', N'Nguyễn Văn Đồng', N'Đại Học FPT', 13000, 97)
INSERT [dbo].[employee] ([tk], [passwd], [name], [gender], [birthdayS], [address], [phone]) VALUES (N'admin', N'admin456', N'Nguyễn Xuân Tuấn Anh', N'Nam', CAST(N'1992-12-09' AS Date), N'HÀ NỘI', N'0981089125')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10001', 2, N'01/11/2022 00:50:12', N'06/11/2022', N'26/11/2022 16:41:43', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10002', 1, N'01/10/2022 09:25:12', N'06/10/2022', N'26/11/2022 15:57:59', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10003', 2, N'02/12/2022 23:57:41', N'06/12/2022', N'16/12/2022 10:56:54', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10005', 2, N'19/12/2022 00:08:26', N'26/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10008', 1, N'25/11/2022 15:13:24', N'11/10/2023', N'21/12/2022 16:44:45', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10009', 2, N'02/12/2022 23:58:21', N'12/12/2022', N'15/12/2022 22:59:08', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10010', 1, N'05/12/2022 08:26:46', N'15/12/2022', N'18/12/2022 16:31:26', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10011', 3, N'18/12/2022 16:20:56', N'19/12/2022', N'18/12/2022 17:35:59', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10012', 2, N'18/12/2022 16:31:13', N'21/12/2022', N'18/12/2022 17:52:14', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10013', 2, N'18/12/2022 17:35:49', N'20/12/2022', N'21/12/2022 10:04:06', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10016', 3, N'18/12/2022 17:51:49', N'30/12/2022', N'21/12/2022 10:01:36', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10018', 3, N'21/12/2022 16:43:48', N'28/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10021', 1, N'19/12/2022 00:33:08', N'27/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171001', N'KMA10023', 3, N'21/12/2022 16:44:14', N'29/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10001', 1, N'22/11/2022 11:10:06', N'26/11/2022', N'28/11/2022 20:17:24', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10002', 1, N'25/09/2022 17:20:12', N'27/09/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10005', 3, N'12/12/2022 00:16:46', N'14/12/2022', N'18/12/2022 17:32:39', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10006', 2, N'27/11/2022 11:29:35', N'12/10/2023', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10007', 1, N'26/11/2022 22:34:28', N'28/11/2022', N'27/11/2022 11:45:36', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10008', 1, N'25/11/2022 15:23:42', N'12/12/2022', N'16/12/2022 10:31:05', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10009', 1, N'26/11/2022 22:32:35', N'28/11/2022', N'21/12/2022 10:01:48', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'AT171002', N'KMA10010', 2, N'05/12/2022 08:51:10', N'14/12/2022', N'16/12/2022 10:28:52', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051003', N'KMA10001', 1, N'20/11/2022 16:50:01', N'28/11/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051003', N'KMA10003', 1, N'01/09/2022 14:50:12', N'06/09/2022', N'26/11/2022 16:48:06', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051003', N'KMA10007', 2, N'17/12/2022 20:49:12', N'20/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051004', N'KMA10004', 1, N'20/10/2022 08:50:33', N'06/11/2022', N'18/12/2022 16:29:25', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051004', N'KMA10005', 1, N'25/10/2022 11:50:22', N'06/11/2022', N'30/11/2022 07:39:57', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051004', N'KMA10006', 3, N'18/12/2022 16:16:48', N'20/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051005', N'KMA10004', 2, N'18/12/2022 17:31:21', N'20/12/2022', N'18/12/2022 17:31:38', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051005', N'KMA10006', 1, N'10/10/2022 10:50:12', N'06/11/2022', N'17/12/2022 19:47:24', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051006', N'KMA10001', 3, N'12/12/2022 00:18:34', N'17/12/2022', N'', N'chưa trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051006', N'KMA10002', 3, N'18/12/2022 16:28:04', N'20/12/2022', N'18/12/2022 16:28:23', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051006', N'KMA10007', 2, N'11/11/2022 14:50:11', N'21/11/2022', N'28/11/2022 14:58:27', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051006', N'KMA10010', 2, N'17/12/2022 20:43:46', N'20/12/2022', N'18/12/2022 17:50:36', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051027', N'KMA10001', 2, N'18/12/2022 17:49:03', N'20/12/2022', N'18/12/2022 17:49:21', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051027', N'KMA10002', 2, N'18/12/2022 22:07:35', N'25/12/2022', N'21/12/2022 10:02:15', N'đã trả')
INSERT [dbo].[registerbook] ([studentId], [bookId], [amount], [borrowDate], [appointDate], [payDate], [giveBookBack]) VALUES (N'CT051027', N'KMA10004', 2, N'21/12/2022 16:39:19', N'25/12/2022', N'21/12/2022 16:41:20', N'đã trả')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'AT171001', N'Lê Thùy Dương', N'Nữ', CAST(N'1997-05-12' AS Date), N'AT17B', N'Hà Tĩnh', N'An toàn thông tin', N'0372018721', N'duong@gmail.com', N'duong123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'AT171002', N'Nguyễn Thị Nga', N'Nữ', CAST(N'1997-05-12' AS Date), N'AT17A', N'Hà Tĩnh', N'An toàn thông tin', N'0372018721', N'nga@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'AT171008', N'Phạm Trung Tính', N'Nam', CAST(N'1995-03-30' AS Date), N'AT17C', N'Hải Dương', N'An toàn thông tin', N'0367952382', N'tinh@gmail.com', N'tinh123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'AT171010', N'Phạm Thị Giang Hương', N'Nữ', CAST(N'1999-02-21' AS Date), N'AT17A', N'Nam Định', N'An toàn thông tin', N'0978360291', N'huong@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'AT171016', N'Lê Hồng Vân', N'Nữ', CAST(N'2004-12-22' AS Date), N'AT17C', N'Nghệ An', N'Công nghệ thông tin', N'0981089125', N'van@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051003', N'Trần Phương Thảo', N'Nam', CAST(N'1996-03-30' AS Date), N'CT5A', N'Nghệ An', N'Công nghệ thông tin', N'0345718342', N'thao@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051004', N'Lê Trường An', N'Nam', CAST(N'1995-11-20' AS Date), N'CT5C', N'Nam Định', N'Công nghệ thông tin', N'0934627827', N'truongan@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051005', N'Phạm Thị Hương Giang', N'Nữ', CAST(N'1999-02-21' AS Date), N'CT5B', N'Hà Nam', N'Công nghệ thông tin', N'0965783101', N'giang@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051006', N'Trần Anh Bảo', N'Nam', CAST(N'1995-12-14' AS Date), N'CT5B', N'Ninh Bình', N'Công nghệ thông tin', N'0298567150', N'bao@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051009', N'Lê An Hải', N'Nam', CAST(N'1995-11-20' AS Date), N'CT5A', N'Phú Thọ', N'Công nghệ thông tin', N'0390217653', N'hai@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051011', N'Đồng Văn Nghĩa', N'Nam', CAST(N'2003-12-22' AS Date), N'CT5C', N'Bắc Giang', N'Công nghệ thông tin', N'0981089111', N'nghia@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051013', N'Đặng Xuân Nam', N'nam', CAST(N'2001-11-13' AS Date), N'CT5C', N'Hà Nội', N'Công nghệ thông tin', N'0981089141', N'nam@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051014', N'Nguyễn Văn Tuấn', N'nam', CAST(N'2001-11-22' AS Date), N'CT5C', N'Hà Nội', N'Công nghệ thông tin', N'0981089115', N'tuan@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051015', N'Nguyễn Xuân Tuấn', N'Nam', CAST(N'2002-12-22' AS Date), N'CT5A', N'Bắc Giang', N'Công nghệ thông tin', N'0981089121', N'tuan@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051017', N'Nguyễn Xuân Tuấn Anh', N'Nam', CAST(N'2002-12-22' AS Date), N'CT5C', N'Bắc Giang', N'Công Nghệ Thông Tin', N'0981089125', N'xuantuananh@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051020', N'Nguyễn Văn Hùng', N'Nam', CAST(N'2003-12-22' AS Date), N'AT17C', N'Bắc Giang', N'Công Nghệ Thông Tin', N'0981089126', N'xuananh@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051022', N'Nguyễn Văn Hùng', N'Nam', CAST(N'2001-12-22' AS Date), N'CT5B', N'Bắc Giang', N'Công nghệ thông tin', N'0981089121', N'hung@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051023', N'Trần Bảo Ngọc', N'Nam', CAST(N'2002-12-12' AS Date), N'CT5A', N'Hà Nội', N'Công Nghệ Thông Tin', N'0981089123', N'ngoc2212@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051024', N'Lê Bá Hùng', N'Nam', CAST(N'2001-12-12' AS Date), N'CT5A', N'Hà Nội', N'Công Nghệ Thông Tin', N'0981089122', N'hung1122@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051025', N'Nguyễn Văn Đạt', N'Nam', CAST(N'2001-12-12' AS Date), N'CT5A', N'Hà Nội', N'Công nghệ thông tin', N'0980189112', N'dat2212@gmail.com', N'dat1234')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051026', N'Nguyễn Xuân Hà', N'Nam', CAST(N'2001-12-22' AS Date), N'CT5A', N'Hà Nam', N'Công nghệ thông tin', N'0981891255', N'ha2212@gmail.com', N'duong1')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051027', N'Lê Xuân Nghĩa', N'Nam', CAST(N'2002-12-12' AS Date), N'CT5A', N'Hà Nội', N'Công nghệ thông tin', N'0981089123', N'nghia12@gmail.com', N'nghia123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'CT051028', N'Lê Văn Dũng', N'Nam', CAST(N'2002-12-12' AS Date), N'CT5C', N'Bắc Giang', N'Công Nghệ Thông Tin', N'0981089123', N'dung1221@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'DT041012', N'Hoàng Xuân Nghĩa', N'Nam', CAST(N'2004-12-12' AS Date), N'DT4A', N'Hà Nội', N'Điện Tử Viễn Thông', N'0981089131', N'nghia@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'DT041018', N'Đồng Văn Sơn', N'Nam', CAST(N'2002-11-12' AS Date), N'DT4A', N'Hà Nội', N'Điện Tử Viễn Thông', N'0981089126', N'son@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'DT041019', N'Vũ Thị Ánh', N'Nữ', CAST(N'2004-04-13' AS Date), N'AT17B', N'Hà Tĩnh', N'Điện Tử Viễn Thông', N'0981089129', N'anh11@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'DT041021', N'Lê Trọng Hùng', N'Nam', CAST(N'2002-12-22' AS Date), N'DT4A', N'Hà Nội', N'Điện Tử Viễn Thông', N'0980189127', N'hung@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'DT041029', N'Nguyễn Văn Anh', N'Nam', CAST(N'2001-12-12' AS Date), N'DT4A', N'Bắc Giang', N'Điện Tử Viễn Thông', N'0981089127', N'anh123@gmail.com', N'kma123')
INSERT [dbo].[student] ([studentId], [nameS], [gender], [birthdayS], [class], [address], [marjor], [phone], [mail], [passwd]) VALUES (N'DT041030', N'Nguyễn Văn Hải', N'Nam', CAST(N'2001-12-12' AS Date), N'DT4A', N'Bắc Giang', N'Điện Tử Viễn Thông', N'0981089128', N'xuananh2212@gmail.com', N'kma123')
ALTER TABLE [dbo].[student]  WITH CHECK ADD CHECK  (([gender]=N'Nam' OR [gender]=N'Nữ'))
GO
USE [master]
GO
ALTER DATABASE [QLTV] SET  READ_WRITE 
GO