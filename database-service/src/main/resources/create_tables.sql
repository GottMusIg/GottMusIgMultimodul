CREATE TABLE `account` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(64) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- -----------------------------------------------------
-- Table `gmidb`.`wowclass`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`wowclass` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`wowclass` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE1` (`name` ASC))
  ENGINE = InnoDB
  AUTO_INCREMENT = 13
  DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`classspecification`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`classspecification` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`classspecification` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `WOWClass_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_classSpecification_WOWClass1_idx` (`WOWClass_id` ASC),
  CONSTRAINT `fk_classSpecification_WOWClass1`
  FOREIGN KEY (`WOWClass_id`)
  REFERENCES `gmidb`.`wowclass` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  AUTO_INCREMENT = 38
  DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`realm`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`realm` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`realm` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `location` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`tooltip_params`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`tooltip_params` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`tooltip_params` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `enchant` INT(11) NULL DEFAULT NULL,
  `gem0` INT(11) NULL DEFAULT NULL,
  `gem1` INT(11) NULL DEFAULT NULL,
  `gem2` INT(11) NULL DEFAULT NULL,
  `transmog_item` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`item`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`item` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`item` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `item_id` INT(11) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `item_level` INT(11) NOT NULL,
  `armor` INT(11) NULL DEFAULT NULL,
  `quality` INT(11) NULL DEFAULT NULL,
  `tooltip_params_id` INT(11) NULL DEFAULT NULL,
  `context` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_item_tooltip_params1_idx` (`tooltip_params_id` ASC),
  CONSTRAINT `fk_item_tooltip_params1`
  FOREIGN KEY (`tooltip_params_id`)
  REFERENCES `gmidb`.`tooltip_params` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`wowcharacter`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`wowcharacter` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`wowcharacter` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `dps` INT(11) NOT NULL,
  `realm_id` INT(11) NOT NULL,
  `classspecification_id` INT(11) NOT NULL,
  `thumbnail_id` VARCHAR(45) NULL DEFAULT NULL,
  `head_id` INT(11) NOT NULL,
  `neck_id` INT(11) NOT NULL,
  `shoulder_id` INT(11) NOT NULL,
  `back_id` INT(11) NOT NULL,
  `skirt_id` INT(11) NOT NULL,
  `chest_id` INT(11) NOT NULL,
  `wrist_id` INT(11) NOT NULL,
  `main_hand_id` INT(11) NOT NULL,
  `off_hand_id` INT(11) NOT NULL,
  `hands_id` INT(11) NOT NULL,
  `finger_1_id` INT(11) NOT NULL,
  `finger_2_id` INT(11) NOT NULL,
  `waist_id` INT(11) NOT NULL,
  `legs_id` INT(11) NOT NULL,
  `feet_id` INT(11) NOT NULL,
  `trinket_1_id` INT(11) NOT NULL,
  `trinket_2_id` INT(11) NOT NULL,
  `average_item_level` INT(11) NOT NULL,
  `average_item_level_equipped` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_character_realm1_idx` (`realm_id` ASC),
  INDEX `fk_character_classspecification1_idx` (`classspecification_id` ASC),
  INDEX `fk_wowcharacter_item1_idx` (`head_id` ASC),
  INDEX `fk_wowcharacter_item2_idx` (`neck_id` ASC),
  INDEX `fk_wowcharacter_item3_idx` (`shoulder_id` ASC),
  INDEX `fk_wowcharacter_item4_idx` (`back_id` ASC),
  INDEX `fk_wowcharacter_item5_idx` (`skirt_id` ASC),
  INDEX `fk_wowcharacter_item6_idx` (`chest_id` ASC),
  INDEX `fk_wowcharacter_item7_idx` (`wrist_id` ASC),
  INDEX `fk_wowcharacter_item8_idx` (`main_hand_id` ASC),
  INDEX `fk_wowcharacter_item9_idx` (`off_hand_id` ASC),
  INDEX `fk_wowcharacter_item10_idx` (`hands_id` ASC),
  INDEX `fk_wowcharacter_item11_idx` (`finger_1_id` ASC),
  INDEX `fk_wowcharacter_item12_idx` (`finger_2_id` ASC),
  INDEX `fk_wowcharacter_item13_idx` (`waist_id` ASC),
  INDEX `fk_wowcharacter_item14_idx` (`legs_id` ASC),
  INDEX `fk_wowcharacter_item15_idx` (`feet_id` ASC),
  INDEX `fk_wowcharacter_item16_idx` (`trinket_1_id` ASC),
  INDEX `fk_wowcharacter_item17_idx` (`trinket_2_id` ASC),
  CONSTRAINT `fk_character_classspecification1`
  FOREIGN KEY (`classspecification_id`)
  REFERENCES `gmidb`.`classspecification` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_character_realm1`
  FOREIGN KEY (`realm_id`)
  REFERENCES `gmidb`.`realm` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item1`
  FOREIGN KEY (`head_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item10`
  FOREIGN KEY (`hands_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item11`
  FOREIGN KEY (`finger_1_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item12`
  FOREIGN KEY (`finger_2_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item13`
  FOREIGN KEY (`waist_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item14`
  FOREIGN KEY (`legs_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item15`
  FOREIGN KEY (`feet_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item16`
  FOREIGN KEY (`trinket_1_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item17`
  FOREIGN KEY (`trinket_2_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item2`
  FOREIGN KEY (`neck_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item3`
  FOREIGN KEY (`shoulder_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item4`
  FOREIGN KEY (`back_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item5`
  FOREIGN KEY (`skirt_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item6`
  FOREIGN KEY (`chest_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item7`
  FOREIGN KEY (`wrist_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item8`
  FOREIGN KEY (`main_hand_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_wowcharacter_item9`
  FOREIGN KEY (`off_hand_id`)
  REFERENCES `gmidb`.`item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`characteraccountrelation`
-- -----------------------------------------------------
-- DROP TABLE IF EXISTS `gmidb`.`characteraccountrelation`;

-- CREATE TABLE IF NOT EXISTS `gmidb`.`characteraccountrelation` (
 -- `id` INT(11) NOT NULL AUTO_INCREMENT,
--  `character_id` INT(11) NOT NULL,
 -- `account_id` INT(11) NOT NULL,
 -- PRIMARY KEY (`id`),
--  INDEX `characteraccountrelation_wowcharacter_id_fk` (`character_id` ASC),
-- INDEX `characteraccountrelation_account_id_fk` (`account_id` ASC),
-- CONSTRAINT `characteraccountrelation_account_id_fk`
-- FOREIGN KEY (`account_id`)
-- REFERENCES `gmidb`.`account` (`id`),
-- CONSTRAINT `characteraccountrelation_wowcharacter_id_fk`
-- FOREIGN KEY (`character_id`)
-- REFERENCES `gmidb`.`wowcharacter` (`id`))
-- ENGINE = InnoDB
-- DEFAULT CHARSET = utf8;


-- -----------------------------------------------------
-- Table `gmidb`.`specificationdps`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gmidb`.`specificationdps` ;

CREATE TABLE IF NOT EXISTS `gmidb`.`specificationdps` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `dps` INT(11) NOT NULL,
  `classSpecification_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_specificationDPS_classSpecification_idx` (`classSpecification_id` ASC),
  CONSTRAINT `fk_specificationDPS_classSpecification`
  FOREIGN KEY (`classSpecification_id`)
  REFERENCES `gmidb`.`classspecification` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  AUTO_INCREMENT = 37
  DEFAULT CHARSET = utf8;
