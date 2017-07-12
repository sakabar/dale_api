drop database if exists dale;

create database dale;

create table dale.bad_move (
  kif_id varchar(15) not null,
  move_num int not null,
  best_score int not null,
  actual_score int not null,
  diff_score int not null,
  sfen varchar(100) not null,
  flipped_sfen varchar(100) not null,
  actual_move varchar(20) not null,
  pv text not null,
  id serial not null primary key
) default charset=utf8;


load data local infile "/Users/sak/project/dale_api/src/main/resources/bad_moves.csv" into table dale.bad_move fields terminated by ',';
