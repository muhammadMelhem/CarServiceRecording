--Customer table
insert into customer (name,date_created) values ('customer_1','2021-09-08 16:35:39.927000');
insert into customer (name,date_created) values ('customer_2','2021-09-08 16:35:39.927000');
insert into customer (name,date_created) values ('customer_3','2021-09-08 16:35:39.927000');
insert into customer (name,date_created) values ('customer_4','2021-09-08 16:35:39.927000');
insert into customer (name,date_created) values ('customer_5','2021-09-08 16:35:39.927000');
insert into customer (name,date_created) values ('customer_6','2021-09-08 16:35:39.927000');

--Car table
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_1','2021-09-08 16:35:39.927000','A4SD65A4SD4SDVSDVD4V8FGJ8GFD6',2);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_2','2021-09-08 16:35:39.927000','S5G4S6D5G4SDVSDVD4V8FGJ8GFD6',4);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_3','2021-09-08 16:35:39.927000','S5G4S6D5GAS5DV1VSV18GFD6',5);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_4','2021-09-08 16:35:39.927000','S5G4S6D5G4SDVSDVD4V8FGJ8GFD6',1);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_5','2021-09-08 16:35:39.927000','S5G4S6SV5D4V5SDVV8FGJ8GFD6',1);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_6','2021-09-08 16:35:39.927000','LKLKKSDVSDVD4V8FGJ8GFD6',4);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_7','2021-09-08 16:35:39.927000','F5G4FGSDVSDVD4V8FGJ8GFD6',6);
insert into car (car_name,date_created,car_vin,CUSTOMER_ID) values ('car_8','2021-09-08 16:35:39.927000','4545N44SDVSDVD4V8FGJ8GFD6',2);

--Car services table
insert into CAR_SERVICE (name,date_created) values ('Car polish','2021-09-08 16:35:39.927000');
insert into CAR_SERVICE (name,date_created) values ('Oil change','2021-09-08 16:35:39.927000');
insert into CAR_SERVICE (name,date_created) values ('Car Painting','2021-09-08 16:35:39.927000');
insert into CAR_SERVICE (name,date_created) values ('Oil Filter','2021-09-08 16:35:39.927000');

--Services Cars table
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(1,2);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(2,3);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(3,6);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(1,5);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(4,8);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(2,7);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(1,1);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(2,4);
insert into  SERVICES_CARS  (CAR_SERVICE_ID,car_id) values(2,8);
 