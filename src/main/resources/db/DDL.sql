-- DDL

create table city
(
    id   bigint unsigned auto_increment primary key,
    name varchar(50) not null unique
);

create table person
(
    id        bigint unsigned auto_increment primary key,
    name      varchar(50) not null,
    last_name varchar(50) not null
);

create table address
(
    id      bigint unsigned auto_increment primary key,
    street  varchar(50)     not null,
    number  int unsigned    not null,
    city_id bigint unsigned not null,
    foreign key (city_id) references city (id)
);

create table building
(
    id           bigint unsigned auto_increment primary key,
    address_id   bigint unsigned not null,
    person_id    bigint unsigned not null,
    size         int unsigned    not null,
    market_value  decimal(10, 2)  not null,
    property_type varchar(50)     not null,
    foreign key (address_id) references address (id),
    foreign key (person_id) references person (id)
);
drop schema zenitech;
