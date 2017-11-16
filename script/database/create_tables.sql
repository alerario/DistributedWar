CREATE TABLE public.cidade
(
  idcidade integer NOT NULL,
  nome character varying(40),
  CONSTRAINT pk_cid PRIMARY KEY (idcidade)
);


CREATE TABLE public.role
(
  idrole integer NOT NULL,
  nome character varying(30),
  descricao character varying(80),
  CONSTRAINT pk_role PRIMARY KEY (idrole)
);
