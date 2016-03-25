# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table app_user (
  id                        integer auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  phone                     varchar(255),
  city                      varchar(255),
  address                   varchar(255),
  password                  varchar(255),
  user_access_level         integer,
  constraint pk_app_user primary key (id))
;

create table category (
  id                        integer auto_increment not null,
  name                      varchar(255),
  constraint pk_category primary key (id))
;

create table item (
  id                        integer auto_increment not null,
  name                      varchar(255),
  price                     varchar(255),
  description               TEXT,
  user_id                   integer,
  category_id               integer,
  constraint pk_item primary key (id))
;

create table store (
  id                        integer auto_increment not null,
  name                      varchar(255),
  city                      varchar(255),
  address                   varchar(255),
  user_id                   integer,
  constraint pk_store primary key (id))
;

alter table item add constraint fk_item_user_1 foreign key (user_id) references app_user (id) on delete restrict on update restrict;
create index ix_item_user_1 on item (user_id);
alter table item add constraint fk_item_category_2 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_item_category_2 on item (category_id);
alter table store add constraint fk_store_user_3 foreign key (user_id) references app_user (id) on delete restrict on update restrict;
create index ix_store_user_3 on store (user_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table app_user;

drop table category;

drop table item;

drop table store;

SET FOREIGN_KEY_CHECKS=1;

