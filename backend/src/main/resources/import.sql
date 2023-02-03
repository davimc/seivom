INSERT INTO tb_director(id, name) VALUES (1, 'Steven Spielberg');
INSERT INTO tb_director(id, name) VALUES (2, 'Stanley Kubrick');
INSERT INTO tb_director(id, name) VALUES (3, 'Quentin Tarantino');
INSERT INTO tb_director(id, name) VALUES (4, 'Martin Scorsese');

INSERT INTO tb_studio(id, name) VALUES (1, 'Universal Pictures');
INSERT INTO tb_studio(id, name) VALUES (2, 'Walt Disney Pictures');
INSERT INTO tb_studio(id, name) VALUES (3, 'Warner Bros');
INSERT INTO tb_studio(id, name) VALUES (4, 'Paramount Pictures');
INSERT INTO tb_studio(id, name) VALUES (5, 'Columbia Pictures');

INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Slade Santana','hendrerit@google.edu','591.252-64','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1975-04-16','2019-01-30');
INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Randall Candido','feugiat.sed@icloud.edu','718.348-26','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1976-03-26','2014-12-23');

INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Cheyenne Carneiro','nunc@outlook.org','732.962-74','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1979-06-15','2020-11-08');
INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Alfreda Guimaraes','sapien@grupotsm.net','176.388-75','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1975-12-09','2017-12-02');
INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Shea Paiva','cum.sociis.natoque@yahoo.couk','792.864-48','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1993-05-21','2017-10-11');
INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Clark Messias','gravida.molestie@aol.net','695.247-67','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1977-05-05','2015-11-28');
INSERT INTO tb_user (name,email,cpf, password,birthdate,dt_entry) VALUES ('Jeanette Sántos','luctus@grupotsm.org','254.575-37','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','1993-06-14','2016-08-08');


INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (5, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (6, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (7, 1);


INSERT INTO tb_movie (director_id,studio_id,name,date_release,genre) VALUES (1,5,'Avram Walker','1983-07-26',2);
INSERT INTO tb_movie (director_id,studio_id,name,date_release,genre) VALUES (1,3,'Avatar','1990-11-19',5);
INSERT INTO tb_movie (director_id,studio_id,name,date_release,genre) VALUES (3,1,'Exterminador do Futuro','2005-12-27',4);
INSERT INTO tb_movie (director_id,studio_id,name,date_release,genre) VALUES (1,4,'De volta para o futuro','2008-06-08',3);
INSERT INTO tb_movie (director_id,studio_id,name,date_release,genre) VALUES (3,1,'Star Wars: Episódio V','2012-03-10',5);

INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('Suspendisse tristique neque venenatis lacus. Etiam bibendum fermentum metus. Aenean sed pede nec ante blandit',2,'2023-08-24',3,3);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('amet, consectetuer adipiscing elit. Curabitur sed tortor. Integer aliquam adipiscing lacus. Ut nec urna et',3,'2023-02-21',1,4);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('consequat purus. Maecenas libero est, congue a, aliquet vel, vulputate eu, odio. Phasellus at augue',1,'2021-04-01',5,5);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('nisi. Aenean eget metus. In nec orci. Donec nibh. Quisque nonummy ipsum non arcu. Vivamus',1,'2023-05-21',1,1);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('elit erat vitae risus. Duis a mi fringilla mi lacinia mattis. Integer eu lacus. Quisque',3,'2022-02-16',3,3);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('tincidunt aliquam arcu. Aliquam ultrices iaculis odio. Nam interdum enim non nisi. Aenean eget metus.',4,'2021-07-24',5,1);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('Nunc mauris elit, dictum eu, eleifend nec, malesuada ut, sem. Nulla interdum. Curabitur dictum. Phasellus',2,'2023-12-13',3,3);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('luctus, ipsum leo elementum sem, vitae aliquam eros turpis non enim. Mauris quis turpis vitae',3,'2021-05-27',6,4);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('Mauris molestie pharetra nibh. Aliquam ornare, libero at auctor ullamcorper, nisl arcu iaculis enim, sit',2,'2023-08-12',4,2);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('Sed auctor odio a purus. Duis elementum, dui quis accumsan convallis, ante lectus convallis est,',0,'2022-11-22',4,1);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('eu metus. In lorem. Donec elementum, lorem ut aliquam iaculis, lacus pede sagittis augue, eu',5,'2022-03-14',1,4);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('lectus rutrum urna, nec luctus felis purus ac tellus. Suspendisse sed dolor. Fusce mi lorem,',5,'2023-11-21',2,2);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('eu, euismod ac, fermentum vel, mauris. Integer sem elit, pharetra ut, pharetra sed, hendrerit a,',3,'2022-08-26',3,3);
INSERT INTO tb_comment (comment,rating,date,user_id,movie_id) VALUES ('primis in faucibus orci luctus et ultrices posuere cubilia Curae Donec tincidunt. Donec vitae erat',4,'2023-11-13',1,4);
