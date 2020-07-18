-- DML

insert into city (name) value ('Vilnius');
insert into city (name) value ('Kaunas');
insert into city (name) value ('Klaipeda');

insert into person (name, last_name) values ('Jonas', 'Jonaitis');
insert into person (name, last_name) values ('Petras', 'Petraitis');
insert into person (name, last_name) values ('Tadas', 'Tadaitis');

insert into address (street, number, city_id) values ('Savanoriai', 10, (select id from city where name = 'Vilnius'));
insert into address (street, number, city_id) values ('Maironio', 5, (select id from city where name = 'Kaunas'));
insert into address (street, number, city_id) values ('Vokieciu', 33, (select id from city where name = 'Klaipeda'));

insert into building(size, market_value, property_type, address_id, person_id) values (10, 21000, 'HOUSE', (select id from address where street = 'Savanoriai'), (select id from person where name = 'Jonas'));
insert into building(size, market_value, property_type, address_id, person_id) values (78, 50000, 'COMMERCIAL', (select id from address where street = 'Maironio'), (select id from person where name = 'Tadas'));
insert into building(size, market_value, property_type, address_id, person_id) values (15, 111000, 'APARTMENT', (select id from address where street = 'Vokieciu'), (select id from person where name = 'Petras'));


