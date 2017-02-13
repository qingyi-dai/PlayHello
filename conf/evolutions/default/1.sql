# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table index_data (
  info_id                       integer auto_increment not null,
  user_id                       integer not null,
  info_content                  varchar(255),
  info_type                     varchar(255),
  create_date                   datetime(6),
  constraint pk_index_data primary key (info_id)
);


# --- !Downs

drop table if exists index_data;

