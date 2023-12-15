drop database if exists export_inport;
create database if not exists export_inport;
use export_inport;
create table phieu_xuat(
so_phieu_xuat varchar(20) primary key,
ngay_xuat datetime not null
);
create table vat_tu(
ma_vat_tu varchar(20) primary key,
ten_vat_tu varchar(70) not null
);
create table phieu_nhap(
so_phieu_nhap varchar(20) primary key,
ngay_nhap datetime not null
);
create table don_dat_hang(
so_don_hang varchar(30) primary key ,
ngay_dat_hang datetime not null
);

create table nha_cung_cap(
ma_nha_cung_cap varchar(20) primary key ,
ten_nha_cung_cap varchar(30) not null,
dia_chi varchar(70) not null
);

create table sdt_nha_cung_cap(
ma_nha_cung_cap varchar(20)primary key,
sdt int unique,
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table chi_tiet_phieu_xuat(
dg_xuat long not null,
sl_xuat int not null,
so_phieu_xuat varchar(20),
ma_vat_tu varchar(20),
primary key (so_phieu_xuat,ma_vat_tu),
foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)

);
create table chi_tiet_phieu_nhap(
dg_nhap long not null,
sl_nhap int not null,
ma_vat_tu varchar(20) not null,
so_phieu_nhap varchar(20)  not null,
primary key (ma_vat_tu,so_phieu_nhap),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);
create table chi_tiet_dat_hang(
ma_vat_tu varchar(20) not null,
so_don_hang varchar(30) not null,
primary key(ma_vat_tu,so_don_hang),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_don_hang) references don_dat_hang(so_don_hang)
);