CREATE TABLE Account
(
    account_id INTEGER  NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    account_type NVARCHAR(40),
    balance DOUBLE PRECISION NOT NULL,
    client_id INTEGER NOT NULL,
    withdraw_allowed BOOL

);

-- CREATE TABLE Account_types
-- (
--     account_type_id INTEGER NOT NULL,
--     type_name NVARCHAR(40) NOT NULL,
--     CONSTRAINT PK_Invoice PRIMARY KEY  (account_type_id),
--     FOREIGN KEY (account_type_id) REFERENCES Account (account_type)
-- );

CREATE TABLE Transactions
(
    transaction_id BIGINT NOT NULL AUTO_INCREMENT,
    name_of_transaction NVARCHAR(40)  NOT NULL,
    amount DOUBLE PRECISION NOT NULL NOT NULL,
    account_id NVARCHAR(40),
    client_id INT NOT NULL,
    transaction_status BIT NOT NULL,
    CURRENTDATE date DEFAULT CURRENT_TIMESTAMP()

);

create table ROLE_ENTITY
(
    id   INTEGER  not null AUTO_INCREMENT,
    name varchar(20) not null,
    CONSTRAINT PK_ROLE_ENTITY primary key (id)
);
insert into ROLE_ENTITY(name) values ('ROLE_ADMIN');
insert into ROLE_ENTITY(name) values ('ROLE_USER');

create table USER_ENTITY
(
    id  INTEGER not null AUTO_INCREMENT UNIQUE,
    login    varchar(50) NOT NULL UNIQUE ,
    password varchar(500) NOT NULL,
    role  varchar(20)  not null,
    CONSTRAINT PK_USER_ENTITY primary key (id)
);