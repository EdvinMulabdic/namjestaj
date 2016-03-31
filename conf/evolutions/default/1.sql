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

create table image (
  id                        integer auto_increment not null,
  public_id                 varchar(255),
  image_url                 varchar(255),
  secret_image_url          varchar(255),
  item_id                   integer,
  constraint pk_image primary key (id))
;

create table item (
  id                        integer auto_increment not null,
  name                      varchar(255),
  price                     varchar(255),
  old_price                 varchar(255),
  description               TEXT,
  is_visible                tinyint(1) default 0,
  user_id                   integer,
  category_id               integer,
  sub_category_id           integer,
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

create table sub_category (
  id                        integer auto_increment not null,
  name                      varchar(255),
  category_id               integer,
  constraint pk_sub_category primary key (id))
;

alter table image add constraint fk_image_item_1 foreign key (item_id) references item (id) on delete restrict on update restrict;
create index ix_image_item_1 on image (item_id);
alter table item add constraint fk_item_user_2 foreign key (user_id) references app_user (id) on delete restrict on update restrict;
create index ix_item_user_2 on item (user_id);
alter table item add constraint fk_item_category_3 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_item_category_3 on item (category_id);
alter table item add constraint fk_item_subCategory_4 foreign key (sub_category_id) references sub_category (id) on delete restrict on update restrict;
create index ix_item_subCategory_4 on item (sub_category_id);
alter table store add constraint fk_store_user_5 foreign key (user_id) references app_user (id) on delete restrict on update restrict;
create index ix_store_user_5 on store (user_id);
alter table sub_category add constraint fk_sub_category_category_6 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_sub_category_category_6 on sub_category (category_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table app_user;

drop table category;

drop table image;

drop table item;

drop table store;

drop table sub_category;

SET FOREIGN_KEY_CHECKS=1;

