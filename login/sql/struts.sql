set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_fujie;
create database logindb_fujie;
use logindb_fujie;

create table user_fujie(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user_fujie values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");


