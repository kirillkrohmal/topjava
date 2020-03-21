CREATE TABLE meals
(
  id integer NOT NULL,
  date_time timestamp without time zone,
  description text NOT NULL,
  calories integer NOT NULL,
  CONSTRAINT meals_pkey PRIMARY KEY (id)
);
