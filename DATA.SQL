INSERT INTO users VALUES (nextval('users_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'hideya@talan.com','hideya',null,true,'rebai','$2a$10$wJBnbUQn.pwPzehHuHpjFuSnoQw99pJVgybVi5Oq6FhQMeSBJgVJS',28888888,'USER');

INSERT INTO users VALUES (nextval('users_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'omar@talan.com','omar',null,true,'shal','$2a$10$DpvaPgpCbioI6uC9J/0EKeUgSfUx/rMNf3Sua.ACKq9XODj7E3FRm',27858880,'USER');

INSERT INTO users VALUES (nextval('users_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'admin@talan.com','admin',null,true,'admin','$2a$10$0jBBhmk6BGcerB8Ry25F/.uzZh5NutYzFAatBZI/d2W0y/r/5S1je',27858880,'ADMIN');

INSERT INTO category VALUES (nextval('category_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'CAT1','Pièces mécaniques');

INSERT INTO category VALUES (nextval('category_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'CAT2','Gaines thermo-retractables');

INSERT INTO category VALUES (nextval('category_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'CAT3','Assemblages mécaniques');


INSERT INTO product VALUES (nextval('product_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'P1','Ecrou',10,4.5,25,1);

INSERT INTO product VALUES (nextval('product_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'P2','Coude',12,3.66,30,1);

INSERT INTO product VALUES (nextval('product_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'P3','Cylindre queue de sapin',8,4.2,80,1);

INSERT INTO product VALUES (nextval('product_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'P4','Gaine silicone',15,7.33,45,2);

INSERT INTO product VALUES (nextval('product_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'P5','Gaine thermo noir',11,7.2,37,2);

INSERT INTO product VALUES (nextval('product_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'P6','bague à dents',12,2.5,74,1);


INSERT INTO sub_assembly VALUES (nextval('sub_assembly_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'SA1',20,5,'Ecrou équipé',12.5,1,1,"SUBASSEMBLY",2,2);

INSERT INTO sub_assembly VALUES (nextval('sub_assembly_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'SA2',18,4,'coude soudé',12.5,1,1,"SUBASSEMBLY",2,3);


INSERT INTO sub_assembly_products VALUES (1,6);

INSERT INTO sub_assembly_products VALUES (1,1);

INSERT INTO sub_assembly_products VALUES (2,2);

INSERT INTO sub_assembly_products VALUES (2,3);

INSERT INTO customer VALUES (nextval('customer_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'hello','hello','hello','hello','hello','hello','hello');


INSERT INTO assembly VALUES (nextval('assembly_id_seq'),'mohamed',CURRENT_TIMESTAMP,'mohamed',CURRENT_TIMESTAMP ,'A1','raccord à coude 90°',3);

INSERT INTO assembly_sub_assemblies VALUES (1,1);

INSERT INTO assembly_sub_assemblies VALUES (1,2);

