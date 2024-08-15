CREATE TABLE IF NOT EXISTS user (

    ID INT NOT NULL,
    firstname VARCHAR(64),
    lastname VARCHAR(64),
    email VARCHAR(128),
    profession VARCHAR(64),
    dateCreated TIMESTAMP,
    country VARCHAR(64),
    city VARCHAR(64),
    PRIMARY KEY ( id )

)