CREATE TABLE CUSTOMER(
    id int auto_increment primary key,
    name varchar(60) not null,
    email varchar(60) not null unique
);