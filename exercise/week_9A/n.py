select sname from salesperson where sid in(select distinct sid from sales where pid in (select pid from products where pname="maggie") and pid in (select pid from products where pname="good day"));
