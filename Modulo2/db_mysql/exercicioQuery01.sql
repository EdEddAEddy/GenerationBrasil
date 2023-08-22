create database db_rh

create table tb_colaboradores(
id bigint auto_increment,
  nome varchar(255) not null,
  sobrenome varchar(255) not null,
  cargo varchar(255) not null,
  salario int not null,
  cpf varchar(255) not null,
  primary key (id)
);


insert into tb_colaboradores(nome, sobrenome, cargo, salario, cpf) 
values ('Edevando', 'Alves', 'CEO', 12000, '50470075880');

insert into tb_colaboradores(nome, sobrenome, cargo, salario, cpf) 
values ('Gabriel', 'Nascimento', 'Engenheiro Civil', 6000, '403877892870');

insert into tb_colaboradores(nome, sobrenome, cargo, salario, cpf) 
values ('Welington', 'da Silva', 'Lider de produção', 8000, '323454532342');

insert into tb_colaboradores(nome, sobrenome, cargo, salario, cpf) 
values ('William', 'Alegria', 'Chefe de departamento', 7000, '32454365455');

insert into tb_colaboradores(nome, sobrenome, cargo, salario, cpf) 
values ('Ana', 'Paula', 'Dona de tudo', 12000, '32143424355');

select * from tb_colaboradores where salario > 2000;

select * from tb_colaboradores where salario < 2000;

update tb_colaboradores set salario = 20000 where id = 1;