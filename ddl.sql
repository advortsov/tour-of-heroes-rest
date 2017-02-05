CREATE TYPE gender AS ENUM ('M', 'F');

CREATE TABLE hero (
  hero_id SERIAL PRIMARY KEY,
  name    TEXT,
  gender  gender
);

CREATE TABLE specialization (
  spec_id        SERIAL PRIMARY KEY,
  specialization TEXT NOT NULL
);

CREATE TABLE unique_skills (
  skill_id   SERIAL PRIMARY KEY,
  skill_name TEXT NOT NULL,
  hero_id_fk SERIAL REFERENCES hero (hero_id)
);

CREATE TABLE hero_specialization (
  hero_id SERIAL REFERENCES hero (hero_id) ON UPDATE CASCADE ON DELETE CASCADE,
  spec_id SERIAL REFERENCES specialization (spec_id) ON UPDATE CASCADE,
  CONSTRAINT hero_spec_pkey PRIMARY KEY (hero_id, spec_id)
);