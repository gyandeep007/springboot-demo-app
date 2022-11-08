-- liquibase formatted sql

-- changeset liquibase:1
CREATE TABLE product (product_id number primary key, product_name VARCHAR2(100), cost number(5))

