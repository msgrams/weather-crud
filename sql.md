```sql
CREATE TABLE air
(
    id                 int PRIMARY KEY auto_increment comment '记录编号',
    district_id        int         not null comment '区域编号',
    monitor_time       date        not null comment '检测时间',
    pm10               int         not null comment 'PM10',
    pm25               int         not null comment 'PM2.5',
    monitoring_station varchar(32) not null comment '监测站',
    last_modify_time   timestamp   not null default current_timestamp on update current_timestamp comment '最后修改时间'
) comment '空气质量指数表';


create table district
(
    id   int primary key auto_increment comment '区域编号',
    name varchar(16) not null comment '区域名称'
) comment '区域表';


insert into district(name)
values ('东城区');
insert into district(name)
values ('南城区');
insert into district(name)
values ('北城区');
insert into district(name)
values ('中城区');
insert into district(name)
values ('1城区');
insert into district(name)
values ('2城区');


select *
from district;


select a.*,
       d.name as district_name
from air a,
     district d
where a.district_id = d.id;


INSERT INTO `weather`.`air`
(`id`, `district_id`, `monitor_time`, `pm10`, `pm25`, `monitoring_station`, `last_modify_time`)
VALUES (5, 54, '2024-07-03', 14, 24, '中城区', '2024-07-04 17:53:00');

```