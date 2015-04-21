DROP TABLE poe;
DROP TABLE partner;
DROP TABLE dell_dashboard;
DROP TABLE request;

create table request(
    project_name varchar2(200),
    company_name varchar2(100),                                       --Partner id er et random number
    activity_desc varchar2(1000),
    comments varchar2(1000),
    target_audience varchar2(1000),
    currency varchar2(100),
    cost varchar2(100),
    activity_status varchar2(1000),
    exe_quarter varchar2(500),
    startdate varchar2(1000),
    enddate varchar2(1000),
    obj_result varchar2(1000),
    req_poe varchar2(1000),
    primary key (project_name)
);

create table dell_dashboard(
    project_name varchar2(6),
    id_dell varchar2(20), 
    activity_desc varchar2(20),
    comments varchar2(100),
    target_audience varchar2(20),
    currency varchar2(2),
    cost varchar2(7),
    mdf_budget varchar2(20),
    activity_status varchar2(20),
    exe_quarter varchar2(20),
    startdate varchar2(20),
    enddate varchar2(20),
    obj_result varchar2(20),
    req_poe varchar2(20),                                      --Eksempel: ap10. a/d for approved/declined. p = poe. f = first time approval. +Random id number.
    primary key (id_dell),
    foreign key (project_name) references request
);

create table partner(
    project_name varchar2(6),
    partner_name varchar2(20),
    partner_pw varchar2(20),
    partner_un varchar2(20),
    primary key (partner_name),
    foreign key (project_name) references request
);

create table poe(
    project_name varchar2(6),
    poe varchar2(20),
    primary key (poe),
    foreign key (project_name) references request
);



insert into request(project_name, company_name, activity_desc, comments, target_audience, currency, cost, activity_status, exe_quarter, startdate, enddate, obj_result, req_poe)
values ('Ekstrem salg a computere', 'Elgiganten', 'Udsalg af dell computere', 'Vil gerne sælge de nyeste computere', 'børnefamilier og unge', 'dkk', '1 million', 'planned', 'Q3 2016', 'august 2016', 'december 2016', 'sælge en masse dell computere og tjene flere penge', 'billeder');

select * from request;


commit;