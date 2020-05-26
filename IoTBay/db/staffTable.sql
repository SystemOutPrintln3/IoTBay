CREATE TABLE STAFF 
(
"STAFFID" INT NOT NULL PRIMARY KEY
    GENERATED ALWAYS AS IDENTITY
    (START WITH 1, INCREMENT BY 1),
"NAME" VARCHAR(50), EMAIL VARCHAR(50), 
PHONENUMBER VARCHAR(12), 
ADDRESS VARCHAR(100), 
STAFFTYPE VARCHAR(20), 
ACTIONHISTORY VARCHAR(100), 
USERACCOUNTID INTEGER
);