-- Create events table
CREATE TABLE EVENTS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    date_of_creation TIMESTAMP,
    affected_brand VARCHAR(255),
    description TEXT,
    malicious_url VARCHAR(255),
    domain_registration_date DATE,
    a_record VARCHAR(255),
    ns_record VARCHAR(255),
    mx_record VARCHAR(255),
    status VARCHAR(255)
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
