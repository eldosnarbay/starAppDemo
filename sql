CREATE TABLE category (
    id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL, 
    PRIMARY KEY (id)
);

INSERT INTO category(name) VALUES ('Голубая');
INSERT INTO category(name) VALUES ('Бело-голубая');
INSERT INTO category(name) VALUES ('Белая');
INSERT INTO category(name) VALUES ('Желто-белая');
INSERT INTO category(name) VALUES ('Желтая');
INSERT INTO category(name) VALUES ('Оранжевая');
INSERT INTO category(name) VALUES ('Красная');

CREATE TABLE discoverer (
    id INT NOT NULL AUTO_INCREMENT,
    fname VARCHAR(50) NOT NULL,
    lname VARCHAR(50),
    PRIMARY KEY (id)
);

INSERT INTO discoverer(fname, lname) VALUES ('Галилей', 'Галилео');

CREATE TABLE star (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    coorX VARCHAR(20) NOT NULL,
    coorY VARCHAR(20) NOT NULL,
    category_id int NOT NULL references category(id),
    discoverer_id int references discoverer(id),
    PRIMARY KEY (id)
);

INSERT INTO star(name, coorX, coorY, category_id, discoverer_id) VALUES ('Альтаир', '234', '5433', 4, 1);
