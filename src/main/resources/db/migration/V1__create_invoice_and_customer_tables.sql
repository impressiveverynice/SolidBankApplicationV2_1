CREATE TABLE Account
(
    account_id INTEGER  NOT NULL AUTO_INCREMENT,
    account_type NVARCHAR(40),
    balance DOUBLE PRECISION NOT NULL,
    client_id INTEGER NOT NULL,
    withdraw_allowed BOOL,
    CONSTRAINT PK_Account PRIMARY KEY  (account_id)
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
    CURRENTDATE date DEFAULT CURRENT_TIMESTAMP(),
    CONSTRAINT PK_TRANSACTIONS PRIMARY KEY (transaction_id)
);


-- INSERT INTO Account_types VALUES(1, 'fixed');
-- INSERT INTO Account_types VALUES(2, 'checking');
-- INSERT INTO Account_types VALUES(3, 'saving')
