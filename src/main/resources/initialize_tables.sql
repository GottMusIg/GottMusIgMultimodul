INSERT INTO gmidb.wowclass (name)  VALUES ('Warrior'),
  ('Paladin'),
  ('Hunter'),
  ('Rogue'),
  ('Priest'),
  ('Death Knight'),
  ('Shaman'),
  ('Mage'),
  ('Warlock'),
  ('Monk'),
  ('Druid'),
  ('Demon Hunter');

INSERT INTO gmidb.classspecification (name, wowclass_id) VALUES ('Fury',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warrior')),
  ('Arms',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warrior')),
  ('Protection',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warrior')),
  ('Holy',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Paladin')),
  ('Protection',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Paladin')),
  ('Retribution',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Paladin')),
  ('Beast Mastery',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Hunter')),
  ('Marksmanship',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Hunter')),
  ('Survival',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Hunter')),
  ('Assassination',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Rogue')),
  ('Outlaw',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Rogue')),
  ('Subtlety',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Rogue')),
  ('Holy',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Priest')),
  ('Shadow',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Priest')),
  ('Discipline',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Priest')),
  ('Blood',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Death Knight')),
  ('Frost',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Death Knight')),
  ('Unholy',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Death Knight')),
  ('Elemental',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Shaman')),
  ('Enhancement',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Shaman')),
  ('Restoration',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Shaman')),
  ('Frost',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Mage')),
  ('Arcane',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Mage')),
  ('Fire',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Mage')),
  ('Affliction',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warlock')),
  ('Destruction',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warlock')),
  ('Demonology',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warlock')),
  ('Brewmaster',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Monk')),
  ('Windwalker',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Monk')),
  ('Mistweaver',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Monk')),
  ('Guardian',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Druid')),
  ('Balance',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Druid')),
  ('Feral',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Druid')),
  ('Restoration',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Druid')),
  ('Havoc',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Demon Hunter')),
  ('Vengeance',(SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Demon Hunter'));

INSERT INTO gmidb.specificationdps (dps, classspecification_id) VALUES (417063, (SELECT id
                                                                                 FROM gmidb.classspecification
                                                                                 WHERE name = 'Fury')),
  (420973, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Arms')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Protection' AND classspecification.wowclass_id = (SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Warrior'))),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Holy' AND classspecification.wowclass_id = (SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Paladin'))),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Protection'AND classspecification.wowclass_id = (SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Paladin'))),
  (398254, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Retribution')),
  (359598, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Beast Mastery')),
  (344744, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Marksmanship')),
  (362074, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Survival')),
  (388832, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Assassination')),
  (385378, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Outlaw')),
  (379931, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Subtlety')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Holy' AND classspecification.wowclass_id = (SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Priest'))),
  (340688, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Shadow')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Discipline')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Blood')),
  (372127, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Frost' AND classspecification.wowclass_id = (SELECT id
                                                                       FROM gmidb.wowclass
                                                                       WHERE gmidb.wowclass.name = 'Death Knight'))),
  (341534, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Unholy')),
  (361802, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Elemental')),
  (385264, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Enhancement')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Restoration' AND classspecification.wowclass_id = (SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Shaman'))),
  (427221, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Frost' AND classspecification.wowclass_id = (SELECT id
                                                                       FROM gmidb.wowclass
                                                                       WHERE gmidb.wowclass.name = 'Mage'))),
  (387155, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Arcane')),
  (375833, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Fire')),
  (339744, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Affliction')),
  (346306, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Destruction')),
  (417562, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Demonology')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Brewmaster')),
  (360956, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Windwalker')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Mistweaver')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Guardian')),
  (367482, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Balance')),
  (413077, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Feral')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Restoration' AND classspecification.wowclass_id = (SELECT id FROM gmidb.wowclass WHERE gmidb.wowclass.name = 'Druid'))),
  (363694, (SELECT id
            FROM gmidb.classspecification
            WHERE name = 'Havoc')),
  (0,(SELECT id FROM gmidb.classspecification WHERE name = 'Vengeance'));

INSERT INTO gmidb.realm (name, location) VALUES ('Blackhand', 'de_DE');
INSERT INTO gmidb.realm (name, location) VALUES ('Blackmoore', 'de_DE');
INSERT INTO gmidb.realm (name, location) VALUES ('Proudmoore', 'de_DE');
INSERT INTO gmidb.realm (name, location) VALUES ('Onyxia', 'de_DE');
INSERT INTO gmidb.realm (name, location) VALUES ('Blackrock', 'de_DE');
INSERT INTO gmidb.realm (name, location) VALUES ('Krag''Jin', 'de_DE');
