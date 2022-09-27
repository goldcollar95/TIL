
-- 2022. 09. 26 최신 ver. db구조도 members, board, boardHis, boardupload, product, reservation, zzim --
-- members db 쿼리문 --

CREATE TABLE `members` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `userid` VARCHAR(45) NOT NULL,
  `pw` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(200) NULL,
  `email` VARCHAR(80) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `userid_UNIQUE` (`userid` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);


insert into members (userid,pw,name,address,email,phone) values('backcoder', '1111', 'june', 'ilgok', 'sksk@naver.com', '01092920303');
select * from members;



create table board(
	seq int primary key auto_increment,
    pw int,
    title varchar(500),
    contents varchar(1000),
    writer varchar(50),
    img varchar(100),
    viewcount int,
    writingtime datetime);
    

select * from board;



create table boardHis(
   seq int primary key auto_increment ,
    title varchar(100) not null,
    contents varchar(4000),
    writer varchar(30) not null,
   pw varchar(25) not null,
    viewcount int,
    writingtime datetime,
    updatingtime datetime,
    deletingtime datetime
);



create table boardupload(
name varchar(30),
description varchar(1000),
file1 varchar(200),
uploadtime datetime);

select * from boardupload;




create table product(
id int primary key auto_increment,
userid varchar(20) not null,
title varchar(30) not null, 
contents varchar(300) not null,
boardRegion varchar(20) not null,
createdAt datetime default now(),
img varchar(100)
);

alter table product add zzim tinyint default 0;
alter table product change img img1 varchar(100);
alter table product add img2 varchar(100);
alter table product add img3 varchar(100);
alter table product add img4 varchar(100);
alter table product add img5 varchar(100);
alter table product add img6 varchar(100);


insert into product (userid, title, contents, boardRegion) values ('june', '컴퓨터빌려줌', '한달가능', '일곡동');
insert into product (userid, title, contents, boardRegion) values ('Tom', '핸드폰 렌탈', '일년가능', '판교동');
insert into product (userid, title, contents, boardRegion) values ('elly', '기타빌려줌', '이틀가능', '역삼동');

select * from product;

select * from product order by createdat desc;
select * from reservation order by boardid desc;




create table reservation(
id int primary key auto_increment, 
buyerid varchar(20) not null, 
sellerid varchar(20) not null,
startRental datetime,
endRental datetime,
boardid int not null, 
price bigint,
Foreign key(boardid) references product(id)
on delete cascade on update cascade
);


select * from reservation;


create table zzim(
seq int NOT NULL PRIMARY KEY auto_increment,
productseq int not null,
memberid varchar(30) NOT NULL,
zzimCheck tinyint DEFAULT 0 NOT NULL,
FOREIGN KEY (memberid) REFERENCES members(userid) ON DELETE CASCADE on update cascade,
FOREIGN KEY (productseq) REFERENCES product(id) ON DELETE CASCADE on update cascade 
);



create table boardcomment(
seq int  NOT NULL, 
contents VARCHAR(1000) NOT NULL, 
writer varchar(20) NOT NULL,
secret TINYINT NOT NULL DEFAULT 0,
foreign key(seq) references board(seq)	
on delete cascade on update cascade,
writingtime datetime not null default now());


select * from boardcomment;

