

create table facil (id integer primary key auto_increment,
                    titulo varchar(20), cuerpo varchar(50),
                    fecha date);

select * from facil;
drop table cliente;
select * from cliente;
select * from direccion;


create table cliente(id_cliente integer primary key auto_increment,
nombre varchar(30), email varchar(30));

create table direccion(id_direccion integer
 primary key auto_increment,
id_cliente integer, calle varchar(40), municipio varchar(30),
cp integer, foreign key(id_cliente) references cliente(id_cliente));