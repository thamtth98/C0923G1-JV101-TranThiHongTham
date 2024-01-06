drop database if exists quan_ly_chuong_lon;
create database if not exists quan_ly_chuong_lon;

use quan_ly_chuong_lon;
create table chuong(
id_chuong int primary key auto_increment,
loai_chuong char(200) not null,
suc_chua int not null
);

create table lon(
id_lon int auto_increment,
ten_lon char(200) not null,
trong_luong int not null,
tuoi int not null,
gioi_tinh char(20),
chuong_hien_tai char(100),
primary key(id_lon)
);

INSERT INTO `quan_ly_chuong_lon`.`lon` (`id_lon`, `ten_lon`, `trong_luong`, `tuoi`, `gioi_tinh`, `chuong_hien_tai`) VALUES (1, 'hi', '100', 3, 'nai', '1');

