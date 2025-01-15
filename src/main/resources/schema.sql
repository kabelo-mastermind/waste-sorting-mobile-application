CREATE TABLE waste_category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255)
);

CREATE TABLE disposal_guidelines (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    guideline VARCHAR(255) NOT NULL,
    waste_type VARCHAR(255) NOT NULL
);

CREATE TABLE recycling_tips (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tip VARCHAR(255) NOT NULL
);