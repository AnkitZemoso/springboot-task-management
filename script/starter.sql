DROP SCHEMA IF EXISTS `spring-demo`;

CREATE SCHEMA `spring-demo`;

use `spring-demo`;



DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `title` varchar(128) not null,
                        `status` varchar(20) ,
                        `startdate` date ,
                        `enddate` date ,
                        PRIMARY KEY (`id`)
);


DROP TABLE IF EXISTS `notes`;

CREATE TABLE `notes` (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `description` varchar(256) not NULL,
                         `createdAt` date ,
                         `modifiedAt` date,
                         `task_id` int DEFAULT NULL,

                         PRIMARY KEY (`id`),

                         KEY `FK_task_idx` (`task_id`),

                         CONSTRAINT `FK_task`
                             FOREIGN KEY (`task_id`)
                                 REFERENCES `task` (`id`)

                                 ON DELETE NO ACTION ON UPDATE NO ACTION
);
insert into task values(1,"Version Control","Completed","2021-09-16","2021-09-17");
insert into task values(2,"Clean Code","Completed","2021-09-17","2021-09-20");
insert into task values(3,"Java","Completed","2021-09-20","2021-09-30");
insert into task values(4,"DBMS","Completed","2021-10-01","2021-10-06");
insert into task values(5,"Spring","Ongoing","2021-10-07","2021-10-26");

insert into notes values(1,"Starting with git basic commands","2021-09-16","2021-09-16",1);
insert into notes values(2,"Follow best design practices","2021-09-17","2021-09-17",1);
insert into notes values(3,"Read about solid principles.","2021-09-18","2021-09-18",2);
insert into notes values(4,"Start with java course","2021-09-20","2021-09-24",2);
insert into notes values(5,"Start Working on java assignments.","2021-09-24","2021-09-28",2);
insert into notes values(6,"Prepare a solid Demo","2021-09-29","2021-09-30",2);
insert into notes values(7,"Start the dbms course on orielly","2021-10-01","2021-10-03",3);
insert into notes values(8,"Practice sql commands.","2021-08-03","2021-08-04",3);
insert into notes values(9,"Create and submit er diagram assignments.","2021-10-04","2021-10-06",3);

