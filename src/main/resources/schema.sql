create table people (
  age integer,
  first_name varchar(255) not null,
  last_name varchar(255) not null,
  primary key (first_name, last_name)
);

CREATE TABLE Student (
    name VARCHAR(255),    -- Composite primary key field 1
    age INT,              -- Composite primary key field 2
    address VARCHAR(255), -- Composite primary key field 3
    school VARCHAR(255),  -- Non-key field
    PRIMARY KEY (name, age, address)  -- Composite primary key
);