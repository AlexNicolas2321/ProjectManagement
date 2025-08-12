use project_management;

create table if not exists user (
    id int primary key auto_increment,
    name varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null
);

create table if not exists project(
    id int primary key auto_increment
    name varchar(255) not null,
    description varchar(255) not null,
    start_date date not null,
    end_date date not null
    
);

create table if not exists role(
    id int primary key auto_increment,
    name enum("OWNER","ADMIN","MEMBER") not null,
)

create table if not exists user_project_role(
    user_id int not null,
    project_id int not null,
    role_id int not null,
    foreign key(user_id) references user(id),
    foreign key(project_id) references project(id),
    foreign key(role_id) references role(id)
);

create table if not exists task(
    id int primary key auto_increment,
    title varchar(255) not null,
    description varchar(255) not null,
    status enum("IN_PROGRESS","COMPLETED") not null,
    project_id int not null,
    parent_id int, -- if id of parent task is null, it is a main task , if not null, it is a subtask and if the id of parent task is the id of the parent task, it is a subtask of subtask
    foreign key(project_id) references project(id),
    foreign key(parent_id) references task(id)
);

