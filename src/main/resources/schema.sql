-- Create events table
CREATE TABLE EVENTS (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(255),
    date_of_creation TIMESTAMP,
    affected_brand VARCHAR(255),
    description TEXT,
    malicious_url VARCHAR(255),
    domain_registration_date DATE,
    a_record VARCHAR(255),
    ns_record VARCHAR(255),
    mx_record VARCHAR(255),
    status VARCHAR(255),
    PRIMARY KEY(id)
);

-- Create matching keywords table
CREATE TABLE EVENT_MODEL_MATCHING_KEYWORDS (
    event_model_id BIGINT,
    matching_keywords VARCHAR(255),
    FOREIGN KEY (event_model_id) REFERENCES EVENTS(id)
);

-- Create comments table
CREATE TABLE COMMENTS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    text TEXT,
    timestamp TIMESTAMP,
    event_id BIGINT,
    FOREIGN KEY (event_id) REFERENCES EVENTS(id)
);

-- Users table
CREATE TABLE users (
                       id BIGINT GENERATED ALWAYS AS IDENTITY,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       username VARCHAR(255) UNIQUE NOT NULL,
                       name VARCHAR(255),
                       PRIMARY KEY(id)
);

-- Authorities table
CREATE TABLE authorities (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             authority_name VARCHAR(255) UNIQUE NOT NULL
);

-- Join table for the many-to-many relationship between users and authorities
CREATE TABLE users_authorities (
                                   user_id BIGINT NOT NULL,
                                   authority_id BIGINT NOT NULL,
                                   PRIMARY KEY (user_id, authority_id),
                                   FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                                   FOREIGN KEY (authority_id) REFERENCES authorities(id) ON DELETE CASCADE
);
