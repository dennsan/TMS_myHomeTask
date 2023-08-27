CREATE TABLE persons(
                        id serial  primary key not null ,
                        username varchar,
                        sex varchar,
                        birthday date
);

CREATE TABLE type_hobby(
                           id serial primary key not null ,
                           type varchar
);

CREATE TABLE hobby(
                      id serial primary key not null ,
                      hobbyname varchar,
                      hobby_id int constraint fk_hobby references type_hobby(id)
);

CREATE TABLE persons_hobby(
                              id serial primary key not null,
                              persons_id int constraint fk_persons references persons(id),
                              hobby_id int constraint fk_hobby references hobby(id)
);

INSERT INTO persons (username, sex, birthday) VALUES (
                                                         'Ivan', 'men', '2000-12-13'
                                                     ),
                                                     (
                                                         'Petr','men', '1996-08-20'
                                                     ),
                                                     (
                                                         'Serg', 'men', '1990-01-02'
                                                     ),
                                                     (
                                                         'Nina', 'women', '1999-05-21'
                                                     ),
                                                     (
                                                         'Svetlana', 'women', '1995-03-22'
                                                     ),
                                                     (
                                                         'Sidor', 'men', '1988-04-30'
                                                     ),
                                                     (
                                                         'Lina', 'women', '1990-05-09'
                                                     ),
                                                     (
                                                         'Denis', 'men', '1991-04-03'
                                                     ),
                                                     (
                                                         'Mischa', 'men', '1989-07-14'
                                                     ),
                                                     (
                                                         'Kristina', 'women', '2000-12-28'
                                                     );

DELETE FROM persons;

INSERT INTO type_hobby (type) VALUES(
                                        'active'
                                    ),
                                    (
                                        'passive'
                                    );
DELETE FROM type_hobby;

INSERT INTO hobby(hobbyname, hobby_id) VALUES (
                                                  'Football', 1
                                              ),
                                              (
                                                  'Swimming', 1
                                              ),
                                              (
                                                  'Chess', 2
                                              ),
                                              (
                                                  'Basketball', 1
                                              ),
                                              (
                                                  'Reading', 2
                                              ),
                                              (
                                                  'Singing', 2
                                              );

DELETE FROM hobby;

INSERT INTO persons_hobby (persons_id, hobby_id) VALUES (1, 1),
                                                        (2, 3),
                                                        (1, 4),
                                                        (4, 2),
                                                        (4, 5),
                                                        (2, 2),
                                                        (3, 6),
                                                        (5, 5),
                                                        (6, 3),
                                                        (7, 2),
                                                        (8, 4),
                                                        (9, 5),
                                                        (10, 1);

DELETE FROM persons_hobby;

SELECT * FROM persons WHERE birthday < '1995-01-01';

SELECT sex, count(*) FROM persons GROUP BY sex;

SELECT username, hobbyname FROM persons
                                    JOIN persons_hobby ph on persons.id = ph.persons_id
                                    join hobby h on h.id = ph.hobby_id;

SELECT username, count(*) FROM persons
                                   JOIN persons_hobby ph on persons.id = ph.persons_id
                                   join hobby h on h.id = ph.hobby_id group by username
having count(*) > 1;

SELECT type, count(*) FROM hobby
                               join type_hobby th on th.id = hobby.hobby_id group by type;

SELECT hobbyname, type FROM hobby
                                join type_hobby th on th.id = hobby.hobby_id;

