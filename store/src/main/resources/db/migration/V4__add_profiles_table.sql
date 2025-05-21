create table profiles
(
    id              bigint auto_increment
        primary key,
    bio             text          null,
    phone_number    varchar(15)   null,
    data_of_birth   date          null,
    loyality_points int default 0 null,
    constraint profiles_users_id_fk
        foreign key (id) references users (id)
);