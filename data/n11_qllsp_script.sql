--drop database n11_qllsp;select * from bangchamcong
create database n11_qllsp;
go
use n11_qllsp;
declare @test int;
CREATE TABLE phanxuong (
 stt int,
 maPhanXuong varchar(255) PRIMARY KEY,
 tenPhanXuong NVARCHAR(255),
 tenNguoiDaiDien NVARCHAR(255),
 maCongDoan varchar(255),
 viTri varchar(255),
 soLuongCongNhan int
);
--GOGOGO
insert into phanxuong values (1,'PX1',N'Phân xưởng nhuộm màu',N'Nguyễn Văn A','CD1','A2',20);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Phân xưởng cắt vải',N'Nguyễn Văn B','CD2','E3',25);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Xưởng may may hình sơ bộ',N'Nguyễn Văn C','CD3','F5',26);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Xưởng cắt chìa thừa',N'Nguyễn Văn D','CD4','D3',20);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Khâu hình trung bộ',N'Nguyễn Văn E','CD5','D7',22);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Khâu hoàn chỉnh',N'Nguyễn Văn F','CD6','D3',26);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Xưởng xếp đồ vào khuôn',N'Nguyễn Văn G','CD7','D2',29);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Xưởng đóng gói',N'Nguyễn Văn H','CD8','C8',30);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Chuyển lên xe VC',N'Nguyễn Văn I','CD9','C1',22);
set @test =  (select TOP 1 stt from phanxuong order by stt desc);
insert into phanxuong values (@test+1,CONCAT('PX',@test+1),N'Kiểm kiện hàng lỗi',N'Nguyễn Văn J','CD10','C6',30);
--GOGOGO
create table phongban(
	stt int,
    maPhongBan varchar (255) PRIMARY KEY,
    tenPhongBan NVARCHAR (255),
    viTri varchar (255),
    soLuongNhanVien int,
    tenNguoiDaiDien NVARCHAR (255),
    nghiepVu NVARCHAR(255)
);
insert into phongban values (1,'PB1',N'Phòng kế toán','E4.20',10,N'NGUYỄN VĂN Z',N'Quản lý thu chi');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng kiểm toán','E3.11',10,N'NGUYỄN VĂN Y',N'Kiểm toán lại tài liệu');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng hành chính','F2.1',12,N'NGUYỄN VĂN X',N'Sử lý hành chính công vụ');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng Quản Trị','D6.8',12,N'NGUYỄN VĂN W',N'Quản lý họp mặt meeting của QTV');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng Quản Lý','Z3.5',12,N'NGUYỄN VĂN V',N'Quản lý các cv Phòng ban khác');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng Tài vụ','Y4.4',12,N'NGUYỄN VĂN U',N'Quản lý tài vụ/ tiền tệ');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng ban sản xuất','F2.1',12,N'NGUYỄN VĂN V',N'Quản lý bộ phận kho');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng ban Marketing','L4.8',19,N'NGUYỄN VĂN U',N'Quản lý đồ họa');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng ban Thu mua','L2.2',19,N'NGUYỄN VĂN T',N'Thu mua vật liệu');
set @test = (select TOP 1 stt from phongban order by stt desc);
insert into phongban values (@test+1,CONCAT('PB',@test+1),N'Phòng ban Kinh Doanh','E3.4',19,N'NGUYỄN VĂN S',N'Tiếp cận thị trường');
--GOGOGO
create table congdoan(
	stt int,
	maCongDoan varchar(255) PRIMARY KEY,
	tenCongDoan NVARCHAR(255),
	maSanPham varchar(255),
	thoiGianHoatDong VARCHAR(255),
	soLuongSanPham int
);
--GOGOGO
insert into congdoan values (1,'CD1',N'Nhuộm màu vải sơ bộ','SP1','Ca 1, Ca2',200);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'May tạo hình đúng mẫu','SP2','Ca 1, Ca2',220);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Cắt chỉ thừa','SP2','Ca 1, Ca2',230);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Tạo hình cải thiện','SP3','Ca 1, Ca2',250);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Ghép ảnh vào áo','SP4','Ca 1, Ca2',220);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Nhuộm kim sa kim tím','SP5','Ca 1, Ca2',500);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Gia công lại','SP6','Ca 1, Ca2',280);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Kiểm tra khuôn mẫu','SP7','Ca 1, Ca2',430);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Đóng thùng','SP8','Ca 1, Ca2',280);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Chuyển thùng','SP8','Ca 1, Ca2',220);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Chất thùng lên xe đẩy','SP2','Ca 1, Ca2',280);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Dán keo','SP4','Ca 1, Ca2',280);
set @test =  (select TOP 1 stt from congdoan order by stt desc);
insert into congdoan values (@test+1,CONCAT('CD',@test+1),N'Ghi mã số / in dấu','SP6','Ca 1, Ca2',270);
--GOGOGO
create table sanpham(
	stt int,
    maSanPham varchar(255) PRIMARY KEY,
    tenSanPham NVARCHAR(255),
    soLuong int,
    donVi varchar(255),
    donGia money
);
--GOGOGO
insert into sanpham values (1,'SP1',N'Áo thun trắng',988,N'Chiếc',19000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Quần jean đen',869,N'Chiếc',48000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo ba lỗ teen',1255,N'Chiếc',20000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo tay lỡ',1355,N'Chiếc',22000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo tay ngắn',1455,N'Chiếc',22400);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo tay phồng',1655,N'Chiếc',22000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo cổ thắt nơ',1385,N'Chiếc',40000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo cổ trụ',1755,N'Chiếc',25000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Quần skinky',2355,N'Chiếc',32000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Chân váy jean',4055,N'Chiếc',88000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo pijama',4355,N'Chiếc',28000);
set @test =  (select TOP 1 stt from sanpham order by stt desc);
insert into sanpham values (@test+1,CONCAT('SP',@test+1),N'Áo bơi',2355,N'Chiếc',24000);
--GOGOGO
create table bangchamcong(
	stt int,
	maBangChamCong varchar(255) PRIMARY KEY,
	maDonVi varchar(255),
	ngayChamCong date
);
--GOGOGO
insert into bangchamcong values (1,'BCC1','PX1',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX2',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX3',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX4',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX5',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX6',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX7',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX8',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX9',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PX10',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB1',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB2',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB3',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB4',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB5',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB6',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB7',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB8',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB9',GETDATE());
set @test =  (select TOP 1 stt from bangchamcong order by stt desc);
insert into bangchamcong values (@test+1,concat('BCC',@test+1),'PB10',GETDATE());
--GOGOGO
create table donxinnghi(
	stt int,
	maDonNghi varchar(255) PRIMARY KEY,
	maNhanVien varchar(255),
	tenNhanVien NVARCHAR(255),
	loaiNhanVien smallint,--0 là nhanvien 1 là congnhan
	lyDo NVARCHAR(255),
	ngayNghi date,
	soNgayXinNghi int,
	loaiNghi smallint --0 la khong phep, 1 la co phep
);
--GOGOGO
insert into donxinnghi  values (1,'DN1','NVHC1',N'LÊ VĂN A',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'NVHC2',N'LÊ VĂN B',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'NVHC3',N'LÊ VĂN C',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'NVHC4',N'LÊ VĂN D',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'NVHC5',N'LÊ VĂN E',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'NVHC6',N'LÊ VĂN F',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'NVHC7',N'LÊ VĂN G',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'CN1',N'LÊ VĂN H',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'CN2',N'LÊ VĂN I',0,N'Bệnh',GETDATE(),1,1);
set @test =  (select TOP 1 stt from donxinnghi order by stt desc);
insert into donxinnghi  values (@test+1,concat('DN',@test+1),'CN3',N'LÊ VĂN J',0,N'Bệnh',GETDATE(),1,1);
--GOGOGO
create table nhanvien(
	stt int,
    maNhanVien varchar(255) PRIMARY KEY,
    tenNhanVien NVARCHAR(255),
    namSinh int,
	gioiTinh smallint,--0 là nam 1 là nữ
    ngayKhoiCong date,
    SDT varchar(255),
    maPhongBan varchar (255)
);
--GOGOGO
insert into nhanvien values (1,'NVHC1',N'LÊ VĂN A',2001,0,GETDATE(),'0338188507','PB1');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN B',2002,0,GETDATE(),'0338188506','PB2');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN C',2000,1,GETDATE(),'0338188504','PB3');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN D',2001,0,GETDATE(),'0338188505','PB4');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN E',2003,1,GETDATE(),'0338188503','PB5');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN F',2004,0,GETDATE(),'0338188502','PB6');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN G',1999,0,GETDATE(),'0338188501','PB7');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN H',2001,0,GETDATE(),'0338188516','PB8');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN I',1999,0,GETDATE(),'0338188516','PB9');
set @test =  (select TOP 1 stt from nhanvien order by stt desc);
insert into nhanvien values (@test+1,concat('NVHC',@test+1),N'LÊ VĂN J',1995,1,GETDATE(),'0338188536','PB10');
--GOGOGO
create table congnhan(
	stt int,
	maCongNhan varchar(255) PRIMARY KEY,
	tenCongNhan NVARCHAR(255),
	namSinh int,
	gioiTinh smallint,
	ngayKhoiCong date,
	SDT varchar(255),
	maPhanXuong varchar(255)
);
--GOGOGO
insert into congnhan values (1,'CN1',N'NGUYỄN VĂN A',2001,0,GETDATE(),'0333645527','PX1');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN B',1999,0,GETDATE(),'0333645526','PX2');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN C',2001,0,GETDATE(),'0333645526','PX3');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN D',2002,0,GETDATE(),'0333645526','PX4');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN E',2003,0,GETDATE(),'0333645526','PX5');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN F',2004,0,GETDATE(),'0333645526','PX6');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN G',2004,1,GETDATE(),'0333645526','PX7');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN H',1998,0,GETDATE(),'0333645526','PX8');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN I',1997,0,GETDATE(),'0333645526','PX9');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN J',1997,1,GETDATE(),'0333645526','PX10');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN K',1996,0,GETDATE(),'0333645526','PX1');
set @test =  (select TOP 1 stt from congnhan order by stt desc);
insert into congnhan values (@test+1,concat('CN',@test+1),N'NGUYỄN VĂN L',1995,1,GETDATE(),'0333645526','PX2');
--GOGOGO
create table hopdong(
	stt int,
    maHopDong varchar(255) PRIMARY KEY,
    tenDoiTac NVARCHAR(255),
    ngayKy date,
    tienDatCoc money,
    tienTra money,
    ngayGiaoHang date,
    diaChi NVARCHAR(255),
	phongBanQuanLy varchar(255)
);
--GOGOGO
insert into hopdong values (1,'HD1',N'Người đại diện Sunhouse',GETDATE(),5000000,100000000,GETDATE(),N'60/122 bến nghe kho Hà Đông','PB1');
set @test = (select TOP 1 stt from hopdong order by stt desc);
insert into hopdong values (@test+1,CONCAT('HD',@test+1),N'Chủ bếp genny',GETDATE(),6500000,120000000,GETDATE(),N'35/577 Xã Ấp Thới, Huyện hà đông','PB1');
set @test = (select TOP 1 stt from hopdong order by stt desc);
insert into hopdong values (@test+1,CONCAT('HD',@test+1),N'Tiệm quần áo Salacon',GETDATE(),6500000,120000000,GETDATE(),N'Kho rỗng đồng nai P2','PB1');
set @test = (select TOP 1 stt from hopdong order by stt desc);
insert into hopdong values (@test+1,CONCAT('HD',@test+1),'Shopping close viahile',GETDATE(),3500000,70000000,GETDATE(),N'Kho hàng Kiên Giang, cầu chữ Y','PB3');
set @test = (select TOP 1 stt from hopdong order by stt desc);
insert into hopdong values (@test+1,CONCAT('HD',@test+1),N'Shop brand Hoàn Hồ chibi',GETDATE(),25000000,50000000,GETDATE(),N'Quận tân phú, đường lê lợi, kho Tân Gia','PB1');
set @test = (select TOP 1 stt from hopdong order by stt desc);
insert into hopdong values (@test+1,CONCAT('HD',@test+1),'GalaxyStore clothes',GETDATE(),65000000,100000000,GETDATE(),N'55/222 Shop galaxyStore','PB2');
--GOGOGO
create table chitiethopdong(
	maHopDong varchar(255),
    maSanPham varchar(255),
    tenSanPham NVARCHAR(255),
    soLuong int,
    yeuCau NVARCHAR(255)
);
--GOGOGO
insert into chitiethopdong values ('HD1','SP1',N'Áo thun trắng',500,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD2','SP2',N'Quần jean đen',1000,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD3','SP3',N'Áo ba lỗ teen',2200,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD4','SP4',N'Áo tay lỡ',5000,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD5','SP5',N'Áo tay ngắn',4500,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD6','SP6',N'Áo tay phồng',4600,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD7','SP7',N'Áo cổ thắt nơ',4900,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD8','SP8',N'Áo cổ trụ',6500,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD9','SP9',N'Quần skinky',3500,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD10','SP10',N'Chân váy jean',4550,N'Chuẩn về thẩm mĩ');
insert into chitiethopdong values ('HD11','SP11',N'Áo pijama',9500,N'Chuẩn về thẩm mĩ');
--GOGOGO
create table phieuluongdonvi(
	 stt int,
	 maPhieuLuong varchar(255) PRIMARY KEY,
	 thangLuong smallint,
	 loaiDonVi smallint,--0 la phongban 1 la phanxuong
	 maDonVi varchar(255) NOT NULL,
	 luongTra money DEFAULT NULL,
	 phuCapPhatSinh money DEFAULT NULL,
	 soLuongNhanVien int DEFAULT NULL,
	 ngayTra DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	 tongTien money
);
--GOGOGO
insert into phieuluongdonvi values (1,'PLDV1',10,0,'PB1',58000000,0,30,CURRENT_TIMESTAMP,58000000);
--GOGOGO
CREATE TABLE phieuluongnhanvien(
	 stt int,
	 maPhieuLuong varchar(255) PRIMARY KEY,
	 thangLuong smallint,
	 maNhanVien varchar(255) NOT NULL,
	 tenNhanVien NVARCHAR(255),
	 phongBan varchar(255) DEFAULT NULL,
	 soNgayCong smallint DEFAULT NULL,
	 soNgayNghiCoPhep smallint DEFAULT NULL,
	 soNgayNghiKhongPhep smallint DEFAULT NULL,
	 soGioTangCa int DEFAULT NULL,
	 tongTienTangCa money,
	 phuCap money DEFAULT NULL,
	 donViChamCong NVARCHAR(255),
	 chiPhiPhatSinh money DEFAULT NULL,
	 ngayInPhieuLuong DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	 tongTien money
);
insert into phieuluongnhanvien values (1,'PL1',10,'NVHC1',N'Phạm Hưu Binh','PB1',25,2,2,5,210000,0,N'Ngày',10000,CURRENT_TIMESTAMP,6730769);
--GOGOGO
create table phieuluongcongnhan(
	stt int,
	maPhieuLuong varchar(255) PRIMARY KEY,
	thangLuong smallint,
	maCongNhan varchar(255),
    hoTen NVARCHAR(255),
	phanXuong varchar(255),
    ngayKhoiCong date,
    soNgayCong SMALLINT,
    soNgayNghiCoPhep SMALLINT,
    soNgayNghiKhongPhep SMALLINT,
    tongSoLuongSanPham int,
    tongTienSanPham money,
    phuCap money,
	donViChamCong NVARCHAR(255),
    phiPhatSinh money,
    ngayInPhieuLuong DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    tongTien money
);
--GOGOGO
insert into phieuluongcongnhan values (1,'PLCN1',10,'CN1',N'NGUYỄN VĂN A','PX1',GETDATE(),30,1,0,400,6000000,0,N'sản phẩm',0,CURRENT_TIMESTAMP,6000000);
--GOGOGO
create table sanphamcongnhan(--chi tiết bản chấm công của công nhân
	maCongNhan varchar(255),
    maCongDoan varchar(255),
    soLuongSanPham int,
    donGia money,
	ngayCong date
);
--GOGOGO
insert into sanphamcongnhan values ('CN1','CD1',23,12000,GETDATE());
insert into sanphamcongnhan values ('CN2','CD1',25,11000,GETDATE());
insert into sanphamcongnhan values ('CN3','CD1',26,12000,GETDATE());
insert into sanphamcongnhan values ('CN1','CD1',27,13000,GETDATE());
insert into sanphamcongnhan values ('CN4','CD1',28,14000,GETDATE());
insert into sanphamcongnhan values ('CN5','CD1',28,14000,GETDATE());
insert into sanphamcongnhan values ('CN6','CD1',23,15000,GETDATE());
insert into sanphamcongnhan values ('CN7','CD1',26,15000,GETDATE());
insert into sanphamcongnhan values ('CN1','CD1',24,16000,GETDATE());
insert into sanphamcongnhan values ('CN3','CD1',22,17000,GETDATE());
insert into sanphamcongnhan values ('CN3','CD1',23,17000,GETDATE());
insert into sanphamcongnhan values ('CN2','CD1',22,18000,GETDATE());
insert into sanphamcongnhan values ('CN5','CD1',21,14000,GETDATE());
insert into sanphamcongnhan values ('CN5','CD1',23,13000,GETDATE());
insert into sanphamcongnhan values ('CN7','CD1',26,12000,GETDATE());
--GOGOGO
create table sanphamnhanvien(-- chi tiết bản chấm công của nhân viên
	maNhanVien varchar(255),
    soGioTangCa int(255),
	loaiTangCa smallint,
	ngayCong Date PRIMARY KEY
);
insert into sanphamnhanvien values ('NV1',0,2,'2021-11-13');
insert into sanphamnhanvien values ('NV2',3,1,'2021-11-12');
insert into sanphamnhanvien values ('NV3',5,3,'2021-11-11');
insert into sanphamnhanvien values ('NV4',4,3,'2021-11-10');
insert into sanphamnhanvien values ('NV5',0,2,'2021-11-09');
insert into sanphamnhanvien values ('NV6',2,3,'2021-11-08');
insert into sanphamnhanvien values ('NV7',0,1,'2021-11-07');
insert into sanphamnhanvien values ('NV8',3,2,'2021-11-06');
insert into sanphamnhanvien values ('NV9',0,3,'2021-11-05');
insert into sanphamnhanvien values ('NV10',4,1,'2021-11-04');
--GOGOGO
create table danhsachphieuluong(
	 stt int,
	 maPhieuLuong varchar(255),
	 thangLuong smallint PRIMARY KEY,
	 luongDaTra money DEFAULT NULL,
	 ngayLuu DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);
--GOGOGO
create table taikhoan(
	 username varchar(255),
	 password varchar(255),
	 maSo varchar(255) PRIMARY KEY,
	 thoiGianHoatDong int
);
insert into taikhoan values ('nqll', '087663az','SUPERVISOR2',0);
insert into taikhoan values ('giamdoc', '315067680az','ADMINISTRATOR',0);
--GOGOGO
create table usersaver(
	 ipv4 varchar(255),
	 hostname varchar(255)
);
--KHÓA NGOẠI
--GOGOGO
alter table phanxuong
add constraint FK_phanxuong2congdoan
foreign key (maCongDoan) references congdoan(maCongDoan);
--GOGOGO
alter table congdoan
add constraint FK_congdoan2sanpham
foreign key (maSanPham) references sanpham(maSanPham);
--GOGOGO
alter table bangchamcong
add constraint FK_bangchamcong2phanxuong
foreign key (maPhanXuong) references phanxuong(maPhanXuong);
--GOGOGO
alter table donxinnghi
add
	foreign key (maNhanVien) references nhanvien(maNhanVien),
	foreign key (maNhanVien) references congnhan(maCongNhan);
--GOGOGO
alter table nhanvien
add constraint FK_nhanvien2phongban
foreign key (maPhongBan) references phongban(maPhongBan);
--GOGOGO
alter table congnhan
add constraint FK_congnhan2phanxuong
foreign key (maPhanXuong) references phanxuong(maPhanXuong);
--GOGOGO
alter table hopdong
add constraint FK_hopdong2phongban
foreign key (phongBanQuanLy) references phongban(maPhongBan);
--GOGOGO
alter table chitiethopdong
add
	foreign key (maHopDong) references hopdong(maHopDong),
	foreign key (maSanPham) references sanpham(maSanPham);
--GOGOGO
alter table phieuluongdonvi
add
	foreign key (maDonVi) references phongban(maPhongBan),
	foreign key (maDonVi) references phanxuong(maPhanXuong);
--GOGOGO
alter table phieuluongnhanvien
add constraint FK_phieuluongnhanvien2nhanvien
foreign key (maNhanVien) references nhanvien(maNhanVien);
--GOGOGO
alter table phieuluongcongnhan
add constraint FK_phieuluongcongnhan2congnhan
foreign key (maCongNhan) references congnhan(maCongNhan);
--GOGOGO
alter table danhsachphieuluong
add
	foreign key (maPhieuLuong) references phieuluongdonvi(maPhieuLuong),
	foreign key (maPhieuLuong) references phieuluongnhanvien(maPhieuLuong),
	foreign key (maPhieuLuong) references phieuluongcongnhan(maPhieuLuong);