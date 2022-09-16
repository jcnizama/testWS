create database test;

create table products(
CodPro int auto_increment primary key,
NmePro varchar(30),
CtgPro varchar(30) unique,
PrcPro float,
StsPro varchar(9) check (StsPro in ('Active','Inactive'))
);

create table clients(
CodCli int auto_increment primary key,
FnmCli varchar(25),
LnmCli varchar(25)
);

create table orders(
CodOrd int auto_increment primary key,
CodCli int,
StsOrd varchar(9) check (StsOrd in ('Pending','Completed','Rejected')),
DteOrd date not null,
TotOrd float not null,
constraint fk_clients_CodCli foreign key (CodCli) references clients(CodCli) on delete cascade
);


create table ordes_products(
CodOrd int,
CodPro int,
QtyOpr int,
UnpOpr int not null,
CstOpr float not null,
constraint fk_orders_CodOrd foreign key (CodOrd) references orders(CodOrd) on delete cascade,
constraint fk_products_CodPro foreign key (CodPro) references products (CodPro) on delete cascade
);

insert into products (
CodPro,
NmePro,
CtgPro,
PrcPro ,
StsPro 
)
VALUES (1,"Chocolate","Candy",10,"Active"),
(2,"Chocolate chip cookie","Cookies",5,"Inactive"),
(3,"Chocolate cake","Cakes",25,"Active");

insert into products (
CodPro,
NmePro,
CtgPro,
PrcPro ,
StsPro 
)
VALUES (1,"Chocolate","Candy",10,"Active"),
(2,"Chocolate chip cookie","Cookies",5,"Inactive"),
(3,"Chocolate cake","Cakes",25,"Active");

insert into clients (
CodCli,
FnmCli,
LnmCli
)
VALUES (1,"Joe","Smith"),
(2,"Joe","Baker"),
(3,"Joe","Adams"),
(4,"Joseph","Evans");

insert into oders (
CodOrd,
CodCli,
StsOrd,
DteOrd,
TotOrd
)
VALUES(1,1,"Pending",'2021-05-02',127.23),
(2,2,"Completed",'2021-05-02,50'),
(3,2,"Rejected",'2021-05-01',200.5),
(4,4,"Completed",'2021-04-30',100);


