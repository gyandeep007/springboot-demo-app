-- liquibase formatted sql

-- changeset liquibase:4
create table Employee14 (
                         id number primary key,
                         firstName varchar2(30),
                         lastName varchar2(30),
                         dob     DATE ,
                         email   varchar2(30)
)
