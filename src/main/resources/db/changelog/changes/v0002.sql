-- liquibase formatted sql

-- changeset liquibase:2
create table student (
    id number primary key,
    firstName varchar2(30),
    lastName varchar2(30),
    dob     DATE ,
    email   varchar2(30)
)
