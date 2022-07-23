use book;
select * from book;
show databases;

insert into book (bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) values('B001', '자바프로그래밍', '홍길동', '2020-01-01', '30000', '멀티출판사');
insert into book (bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) values('B002', 'MYSQL이해', '나이해', '2022-01-01', '25000', '캠퍼스출판');
insert into book (bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) values('B003', 'SPRING 활용', '김고수', '2021-01-01', '45000', '디지털출판사');


select * , to_char('2020-01-01', 'yyyy') from book;

select *, date_format(bookYear,'%Y')as bookYearonly from book ;


select *, date_format('2022-01-01','%Y')as bookYearonly from book where bookNo = 'B002';
select *, date_format('2021-01-01','%Y')as bookYearonly from book where bookNo = 'B003';

update book set bookyear = '2020' where bookNo = 'B001';







