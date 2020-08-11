-- 创建数据库
create database test   ;


-- 创建表
-- auto-generated definition
create table demo
(
    id               int auto_increment
        primary key,
    name             varchar(50) null,
    create_timestamp timestamp   null,
    create_date      date        null,
    create_datetime  datetime    null,
    year             year        null,
    time             time        null
);

--插入数据

INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (1, 'hello1', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 1992, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (2, 'hello2', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 2001, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (3, 'hello3', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 1992, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (4, 'hello3', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 2004, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (5, 'hello4', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 1992, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (6, 'hello5', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 2005, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (7, 'hello53', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 1992, '12:12:12');
INSERT INTO test.demo (id, name, create_timestamp, create_date, create_datetime, year, time) VALUES (8, 'hello54', '2020-06-05 15:04:10', '2020-06-05', '2020-06-05 15:04:16', 2006, '12:12:12');