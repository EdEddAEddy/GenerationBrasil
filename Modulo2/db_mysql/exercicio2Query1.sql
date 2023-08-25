create database db_generation_game_online;

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_classes` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `classe` VARCHAR(255) NOT NULL,
  `raça` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_personagens` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `ataque` INT NOT NULL,
  `defesa` INT NOT NULL,
  `vida` INT NOT NULL,
  `mana` INT NOT NULL,
  `tb_classes_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_personagens_tb_classes_idx` (`tb_classes_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_personagens_tb_classes`
    FOREIGN KEY (`tb_classes_id`)
    REFERENCES `mydb`.`tb_classes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


insert into tb_classes(classe, raça)
values ('ladina', 'draconato'),
('mago', 'humano'),
('feiticeiro', 'drow'),
('guerreiro', 'gith'),
('barbaro', 'orc');

select * from tb_classes;

insert into tb_personagens(ataque, defesa, vida, mana, tb_classes_id)
values (2000, 1200, 5000, 1500, 4),
(3000, 800, 5500, 800, 5),
(5000, 500, 3000, 2500, 2),
(5500, 800, 2500, 1000, 1),
(1500, 3000, 8000, 2000, 4);

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where defesa between 1000 and 2000;

select * from tb_personagens where vida like 3000;

SELECT * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.tb_classes_id;

select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.tb_classes_id where classe like 'guerreiro';


