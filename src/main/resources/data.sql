drop table if exists kindofrequest;

create table kindofrequest (
  id int auto_increment  primary key,
  label varchar(50) not null
);

insert into kindofrequest (label) values
  ('Contract Adjustment' ),
  ('Damage Case'),
  ('Complaint');

-- // uncomment if you want recreate table customermessages
-- drop table if exists customermessages;
-- create table customermessages (
--   id int auto_increment  primary key,
--   kindofrequestid int not null,
--   policy_number varchar(250) not null,
--   first_name varchar(250) not null,
--   last_name varchar(250) not null,
--   customerrequest varchar(5000) default null
-- );
--
-- ALTER USER sa SET PASSWORD 'superPw'




