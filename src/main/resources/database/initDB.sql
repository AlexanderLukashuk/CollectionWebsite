CREATE TABLE IF NOT EXISTS books
(
    id    int PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    price int NOT NULL ,
    features text[]
);