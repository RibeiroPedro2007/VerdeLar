create database aplicacao;
use aplicacao;

create table login(
nome varchar(50),
email varchar(50),
senha varchar(50),
primary key(email)
);
ALTER TABLE login ADD COLUMN 
escolha INT;
ALTER TABLE login
ADD COLUMN cenario VARCHAR(50),
ADD COLUMN planta VARCHAR(50);

insert into login (nome, email, senha) values ();
select * from login;

CREATE TABLE plantas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    tipo VARCHAR(50),
    solo VARCHAR(50),
    descricao VARCHAR(2600)
);
ALTER TABLE plantas
ADD COLUMN descricao VARCHAR(2600);
TRUNCATE TABLE plantas;
INSERT INTO plantas (nome, tipo, solo, descricao) VALUES
('Batata-doce', 'Alimentícia', 'Arenoso, Siltoso, Humífero', 'A Ipomoea batatas é uma planta herbácea perene pertencente à família Convolvulaceae. Cultivada por suas raízes tuberosas comestíveis, ricas em amido e variáveis em cor. Prefere sol pleno e solos leves, férteis e bem drenados, especialmente arenosos, siltosos e humíferos.'),
('Amendoim', 'Alimentícia', 'Arenoso, Siltoso', 'O Arachis hypogaea é uma leguminosa de ciclo de 120 dias. Suas vagens se desenvolvem no solo. Exige solo leve, solto e bem drenado, preferindo solos arenosos ou siltosos.'),
('Couve', 'Alimentícia', 'Humífero, Argiloso', 'A Brassica oleracea var. acephala é uma planta herbácea de folhas largas e verdes, da família das crucíferas. Prefere clima ameno e solos ricos em nutrientes e umidade. Desenvolve-se bem em solo humífero e também em argiloso bem adubado.'),
('Quiabo', 'Alimentícia', 'Humífero, Argiloso', 'O Abelmoschus esculentus é uma planta herbácea da família Malvaceae. Possui flores amarelas com miolo roxo e gosta de sol pleno. Cresce bem em solo fértil e bem drenado, como o humífero ou argiloso.'),
('Cenoura', 'Alimentícia', 'Arenoso, Siltoso', 'A Daucus carota é uma planta da família Apiaceae, cultivada por sua raiz tuberosa rica em betacaroteno. Prefere clima ameno e solo leve, profundo e solto (arenoso ou siltoso).'),
('Mandioca', 'Alimentícia', 'Arenoso, Siltoso', 'A Manihot esculenta é um arbusto lenhoso com raízes ricas em amido. Muito rústica, adapta-se a solos pobres, arenosos e siltosos, preferindo clima tropical.'),
('Alface', 'Alimentícia', 'Humífero', 'A Lactuca sativa é uma hortaliça de ciclo curto. Seu solo ideal é fértil, rico em matéria orgânica e úmido (tipo humífero).'),
('Tomate', 'Alimentícia', 'Humífero', 'O Solanum lycopersicum é uma planta herbácea da família Solanaceae. Necessita tutoramento e solo fértil, rico em matéria orgânica (humífero).'),
('Milho', 'Alimentícia', 'Humífero', 'A Zea mays é uma gramínea alta com flores masculinas e femininas separadas. Prefere solos férteis (humíferos) e temperaturas entre 16°C e 35°C.'),
('Feijão', 'Alimentícia', 'Humífero', 'O Phaseolus vulgaris é uma leguminosa que forma vagens. Exige sol e solo fértil, úmido e rico em matéria orgânica (humífero).'),
('Lavanda', 'Ornamental', 'Arenoso', 'A Lavandula é uma planta mediterrânea de flores roxas e aroma marcante. Gosta de sol pleno e solo bem drenado, seco e arenoso.'),
('Suculentas', 'Ornamental', 'Arenoso', 'Plantas que armazenam água em seus tecidos, como cactos. Precisam de substrato leve e drenante (arenoso) e boa ventilação.'),
('Alecrim', 'Ornamental', 'Arenoso', 'O Rosmarinus officinalis é um arbusto lenhoso e aromático. Prefere sol pleno e solo bem drenado (arenoso).'),
('Espada-de-São-Jorge', 'Ornamental', 'Arenoso', 'A Dracaena trifasciata é resistente, com folhas verticais e rígidas. Tolera sombra e ar condicionado, mas precisa de solo bem drenado (arenoso).'),
('Costela-de-Adão', 'Ornamental', 'Humífero', 'A Monstera deliciosa tem folhas grandes e recortadas. Gosta de solo rico em matéria orgânica (humífero) e umidade leve.'),
('Hibisco', 'Ornamental', 'Humífero', 'O Hibiscus é uma planta tropical com flores grandes e vistosas. Precisa de sol pleno e solo fértil (humífero).'),
('Beijinho (Impatiens)', 'Ornamental', 'Humífero', 'A Impatiens é uma planta de flores coloridas e delicadas. Ideal para sombra, solo fértil e úmido (humífero).'),
('Samambaia', 'Ornamental', 'Humífero', 'Plantas do grupo Pteridophyta, sem flores ou sementes. Gostam de ambientes úmidos e luz filtrada, em solo leve e rico em matéria orgânica (humífero).'),
('Lírio-da-paz', 'Ornamental', 'Humífero', 'O Spathiphyllum wallisii é uma planta de interior de folhas verde-escuras e espata branca. Prefere meia-sombra e solo rico em matéria orgânica (humífero).'),
('Antúrio', 'Ornamental', 'Humífero', 'O Anthurium tem brácteas coloridas e é típico de florestas tropicais. Gosta de solo úmido e fértil (humífero), sem sol direto.');


CREATE TABLE jardim (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email_usuario VARCHAR(50),
    nome_planta VARCHAR(50),
    nome_personalizado VARCHAR(50),
    FOREIGN KEY (email_usuario) REFERENCES login(email)
);
ALTER TABLE jardim
ADD COLUMN nivel INT DEFAULT 1;

select * from jardim;
describe jardim;

