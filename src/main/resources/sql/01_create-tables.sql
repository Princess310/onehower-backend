-- quick EMPTY : truncate "user" RESTART IDENTITY cascade;
-- quick DROP  : drop table  "user";

-- --------- user --------- --
CREATE TABLE "user"
(
	id bigserial NOT NULL,
	name character varying(128),
	password character varying(128),
	avatar character varying(256),
	"isAdmin" boolean DEFAULT false,
	"ctime" timestamp without time zone,
	"utime" timestamp without time zone,
	CONSTRAINT user_pkey PRIMARY KEY (id)
);
create index on "user" (name);
-- --------- /user --------- --

-- --------- moment --------- --
CREATE TABLE "moment"
(
	id bigserial NOT NULL,
	type character varying(128),
	content text,
	article text,
	pictures text,
	audio character varying(256),
	vedio character varying(256),
	tags text,
	"ctime" timestamp without time zone,
	"utime" timestamp without time zone,
	CONSTRAINT moment_pkey PRIMARY KEY (id)
);
create index on "moment" (content);
-- --------- /moment --------- --

-- --------- life --------- --
CREATE TABLE "life"
(
	id bigserial NOT NULL,
	title character varying(128),
	breif character varying(128),
	content text,
	pictures text,
	audio character varying(256),
	vedio character varying(256),
	"ctime" timestamp without time zone,
	"utime" timestamp without time zone,
	CONSTRAINT life_pkey PRIMARY KEY (id)
);
create index on "life" (title);
-- --------- /life --------- --

-- --------- message --------- --
CREATE TABLE "message"
(
	id bigserial NOT NULL,
	username character varying(128),
	email character varying(128),
	avatar character varying(256),
	content text,
	ip inet,
	"ctime" timestamp without time zone,
	"utime" timestamp without time zone,
	CONSTRAINT message_pkey PRIMARY KEY (id)
);
create index on "message" (username);
-- --------- /message --------- --

-- --------- song --------- --
CREATE TABLE "song"
(
	id bigserial NOT NULL,
	name character varying(256),
	singer character varying(128),
	audio character varying(256),
	lyric character varying(256),
	thumbnail character varying(256),
	"ctime" timestamp without time zone,
	"utime" timestamp without time zone,
	CONSTRAINT song_pkey PRIMARY KEY (id)
);
create index on "song" (audio);
-- --------- /song --------- --