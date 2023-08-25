create database db_pizzaria_legal;

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `db_pizzaria_legal` DEFAULT CHARACTER SET utf8 ;
USE `db_pizzaria_legal` ;

CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_categorias` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `doce` TINYINT NOT NULL,
  `salgado` TINYINT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_pizzas` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `ingredientes` VARCHAR(255) NOT NULL,
  `preco` DECIMAL NOT NULL,
  `nota` INT NULL,
  `tb_categorias_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_pizzas_tb_categorias_idx` (`tb_categorias_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_pizzas_tb_categorias`
    FOREIGN KEY (`tb_categorias_id`)
    REFERENCES `db_pizzaria_legal`.`tb_categorias` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

use db_pizzaria_legal;

insert into tb_categorias(doce, salgado)
values (true, false),
(false, true);

use db_pizzaria_legal;
select * from tb_categorias;

use db_pizzaria_legal;
insert into tb_pizzas(nome, ingredientes, preco, nota, tb_categorias_id)
values ('Calabresa', 'Calabresa, Cebola, Azeitona', 38.00, 8, 1),
('Portuguesa', 'Queijo, Presunto, Ovo', 52.00, 7, 1),
('Brocolis', 'Queijo, Brocolis, Bacon', 65.00, 9, 1),
('Chocolate', 'Chocolate, Nojo, Não mexa', 100.00, 0, 2),
('Frango Catupiry', 'Frango, Catupiry, Milho', 45.00, 100, 1);

select * from tb_pizzas;

select * from tb_pizzas where preco > 45;

select * from tb_pizzas where preco between 50 and 100;

select * from tb_pizzas where nome like 'c%';

SELECT * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.tb_categorias_id;

SELECT * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.tb_categorias_id where tb_categorias_id = 1;
