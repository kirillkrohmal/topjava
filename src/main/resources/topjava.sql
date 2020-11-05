CREATE TABLE meals
(
  id integer NOT NULL,
  date_time timestamp without time zone,
  description text NOT NULL,
  calories integer NOT NULL,
  user_id integer NOT NULL,
  CONSTRAINT meals_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE meals
  OWNER TO postgres;


CREATE TABLE users
(
  id integer NOT NULL,
  name text NOT NULL,
  email text NOT NULL,
  password text NOT NULL,
  CONSTRAINT users_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE users
  OWNER TO postgres;


INSERT INTO meals (id, date_time, description, calories, user_id)
VALUES (1, '2020-01-30 10:00:00', 'Завтрак', 500, 1),
       (2, '2020-01-30 13:00:00', 'Обед', 1000, 1),
       (3, '2020-01-30 20:00:00', 'Ужин', 500, 1),
       (4, '2020-01-31 0:00:00', 'Еда на граничное значение', 100, 1),
       (5, '2020-01-31 10:00:00', 'Завтрак', 500, 2),
       (6, '2020-01-31 13:00:00', 'Обед', 1000, 2),
       (7, '2020-01-31 20:00:00', 'Ужин', 510, 2),
       (8, '2020-01-31 14:00:00', 'Админ ланч', 510, 1),
       (9, '2020-01-31 21:00:00', 'Админ ужин', 1500, 1);


INSERT INTO users (id, name, email, password)
VALUES (1, 'User', 'user@yandex.ru', 'password'),
       (2, 'Admin', 'admin@gmail.com', 'admin');