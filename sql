CREATE TABLE category (
    id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL, 
    PRIMARY KEY (id)
);

CREATE TABLE discoverer (
    id INT NOT NULL AUTO_INCREMENT, 
    fname VARCHAR(50) NOT NULL, 
    lname VARCHAR(50), 
    PRIMARY KEY (id)
);
Stris
CREATE TABLE star (
    id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL,
    coorX VARCHAR(20) NOT NULL,
    coorY VARCHAR(20) NOT NULL,
    category_id int NOT NULL references category(id),
    discoverer_id int references discoverer(id),
    PRIMARY KEY (id)
);
