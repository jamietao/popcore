--===============================================================
--	popcore schema scripts:
--		1. This scripts will create the required database schema. 
--		2. The scripts support postgresql database.   	 
--===============================================================

--===============================================================
--			create t_user table 
--===============================================================
DROP SEQUENCE IF EXISTS t_user_id_seq;
DROP TABLE IF EXISTS t_user;

CREATE SEQUENCE t_user_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE t_user
(
  id	integer NOT NULL DEFAULT nextval('t_user_id_seq'::regclass),
  name	character varying(50) NOT NULL,
  avatar_url	character varying(100),
  create_time	timestamp without time zone default NOW(),
  modified_time	timestamp without time zone default NOW(),
  
  CONSTRAINT t_user_pkey PRIMARY KEY (id),
  CONSTRAINT t_user_name_unique UNIQUE (name)
);

--==================================================================
--			create t_post table
--==================================================================
DROP SEQUENCE IF EXISTS t_post_id_seq;
DROP TABLE IF EXISTS t_post;

CREATE SEQUENCE t_post_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
CREATE TABLE t_post
(
	id 	integer NOT NULL DEFAULT nextval('t_post_id_seq'::regclass),
	title	character varying(100)	NOT NULL,
	image_url	character varying(100)	NOT NULL,
	content	character varying(250),
	author_id	integer	NOT NULL,
	detail	character varying(1000),
	read_count	integer NOT NULL DEFAULT 0,
	collection_count	integer NOT NULL DEFAULT 0,
	comment_count	integer NOT NULL DEFAULT 0,
	star_count	integer NOT NULL DEFAULT 0,
	background_music_url	character varying(100),
	background_music_title	character varying(20),
	background_music_cover_url	character varying(100),
	create_time	timestamp without time zone default NOW(),
 	modified_time	timestamp without time zone default NOW(),
 	
 	CONSTRAINT t_post_pkey PRIMARY KEY(id),
 	CONSTRAINT t_post_fkey_user FOREIGN KEY(author_id) REFERENCES t_user(id)
)