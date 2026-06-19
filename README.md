# MicroServices

CREATE TABLE roles (
    id INT NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(50),
    role VARCHAR(50),
    PRIMARY KEY (id),
    CONSTRAINT fk_roles_members
        FOREIGN KEY (user_id)
        REFERENCES members(user_id)
);

INSERT INTO members (user_id, password, active)
VALUES
('john', '{noop}12345', 1),
('mary', '{noop}password', 1),
('admin', '{noop}admin123', 1);

INSERT INTO roles (user_id, role)
VALUES
('john', 'ROLE_USER'),
('mary', 'ROLE_USER'),
('admin', 'ROLE_ADMIN');

CREATE TABLE members (
    user_id VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    active TINYINT(1) NOT NULL,
    PRIMARY KEY (user_id)
);
