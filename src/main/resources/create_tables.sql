-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema gmidb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `gmidb` ;

-- -----------------------------------------------------
-- Schema gmidb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gmidb` DEFAULT CHARACTER SET utf8 ;
USE `gmidb` ;

-- -----------------------------------------------------
-- Table `gmidb`.`wowclass`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`wowclass` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`wowclass` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gmidb`.`classspecification`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`classspecification` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`classspecification` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `WOWClass_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_classSpecification_WOWClass1_idx` (`WOWClass_id` ASC),
  CONSTRAINT `fk_classSpecification_WOWClass1`
    FOREIGN KEY (`WOWClass_id`)
    REFERENCES `gmidb`.`wowclass` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gmidb`.`specificationdps`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`specificationdps` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`specificationdps` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dps` INT NOT NULL,
  `classSpecification_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_specificationDPS_classSpecification_idx` (`classSpecification_id` ASC),
  CONSTRAINT `fk_specificationDPS_classSpecification`
    FOREIGN KEY (`classSpecification_id`)
    REFERENCES `gmidb`.`classspecification` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
