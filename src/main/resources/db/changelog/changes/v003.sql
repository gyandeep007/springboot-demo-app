-- liquibase formatted sql

-- changeset liquibase:3
create table Employee13 (
                         id number primary key,
                         firstName varchar2(30),
                         lastName varchar2(30),
                         dob     DATE ,
                         email   varchar2(30)
)
