drop database if exists Usur;
create database Usur;
use Usur;

create table usr(
Usr nvarchar(20),
contra nvarchar(20)
);

	drop procedure if exists sp_valida;
    
    delimiter **
    create procedure sp_valida(in Usua nvarchar(20), psw nvarchar(20))
    begin
    declare existe int;
    declare msg nvarchar(200);
    
		set existe = (select count(*) from usr where Usua = Usr and psw = contra);
        
        if(existe = 1)	then
        set msg = 'Hola';
        else
        set msg = 'incorrecto';
        end if;
    
    end ;**
    delimiter ;