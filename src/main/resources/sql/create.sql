
-- 创建用户
drop table if exists "user";

create table "user" (
    user_id serial NOT NULL ,

    user_name varchar(50) NOT NULL,

    password varchar(50) NOT NULL,

    create_date timestamp NOT NULL ,

    alter_date timestamp ,

    primary key (user_id),

    constraint user_name unique(user_name)
);
-- 创建角色

drop table if exists "role";
create table "role" (
    role_id serial NOT NULL,

    role_name varchar(50) NOT NULL,

    create_date timestamp NOT NULL,

    alter_date timestamp,

    primary key(role_id),

    constraint role_name unique(role_name)
);

-- 创建app表
drop table if exists "app";
create table "app"(
    app_id varchar(50) NOT NULL,

    app_secret varchar(50) NOT NULL,

    app_name varchar(50) NOT NULL,

    create_date timestamp NOT NULL,

    alter_date timestamp,

    primary key(app_id),

    constraint app_secret unique(app_secret)
);
-- 创建user_role
drop table if exists "user_role";
create table "user_role" (
    user_role_id serial NOT NULL,

    user_id int8 NOT NULL,

    role_id int8 NOT NULL,

    primary key (user_role_id),

    constraint user_id_and_role_id unique(user_id, role_id)
);

alter table user_role add constraint fk_user_tole_user_id foreign key (user_id) references "user"(user_id);
alter table user_role add constraint fk_user_tole_role_id foreign key (role_id) references "role"(role_id);

--创建user_app

drop table if exists "user_app" ;
create table "user_app" (
    user_app_id serial NOT NULL,

    user_id int8 NOT NULL,

    app_id varchar(50) NOT NULL,

    constraint user_id_and_app_id unique(user_id, app_id)
);

alter table user_app add constraint fk_user_app_user_id foreign key (user_id) references "user"(user_id);
alter table user_app add constraint fk_user_app_app_id foreign key (app_id) references "app"(app_id);

