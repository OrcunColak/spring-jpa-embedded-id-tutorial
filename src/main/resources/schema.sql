create table people (
  age integer,
  first_name varchar(255) not null,
  last_name varchar(255) not null,
  primary key (first_name, last_name)
);