-- Insert sample events
INSERT INTO EVENTS (id, name, date_of_creation, affected_brand, description, malicious_url, domain_registration_date, a_record, ns_record, mx_record, status)
VALUES (1, 'Event 1', '2024-05-10 10:00:00', 'Brand A', 'Description for Event 1', 'http://malicious1.com', '2024-01-01', 'A1', 'NS1', 'MX1', 'TODO');
INSERT INTO EVENTS (id, name, date_of_creation, affected_brand, description, malicious_url, domain_registration_date, a_record, ns_record, mx_record, status)
VALUES (2, 'Event 2', '2024-05-11 11:00:00', 'Brand B', 'Description for Event 2', 'http://malicious2.com', '2024-02-01', 'A2', 'NS2', 'MX2', 'DONE');
INSERT INTO EVENTS (id, name, date_of_creation, affected_brand, description, malicious_url, domain_registration_date, a_record, ns_record, mx_record, status)
VALUES (3, 'Event 3', '2024-05-12 12:00:00', 'Brand C', 'Description for Event 3', 'http://malicious3.com', '2024-03-01', 'A3', 'NS3', 'MX3', 'DONE');

-- Insert sample keywords for events
INSERT INTO EVENT_MODEL_MATCHING_KEYWORDS (Event_Model_id, matching_Keywords)
VALUES (1, 'keyword1'), (1, 'keyword2'), (2, 'keyword3'), (3, 'keyword4'), (3, 'keyword5');

-- Insert sample comments
INSERT INTO COMMENTS (id, text, timestamp, event_id)
VALUES (1, 'Comment 1 for Event 1', '2024-05-10 15:00:00', 1);
INSERT INTO COMMENTS (id, text, timestamp, event_id)
VALUES (2, 'Comment 2 for Event 1', '2024-05-10 16:00:00', 1);
INSERT INTO COMMENTS (id, text, timestamp, event_id)
VALUES (3, 'Comment for Event 2', '2024-05-11 17:00:00', 2);
INSERT INTO COMMENTS (id, text, timestamp, event_id)
VALUES (4, 'Comment 1 for Event 3', '2024-05-12 18:00:00', 3);
INSERT INTO COMMENTS (id, text, timestamp, event_id)
VALUES (5, 'Comment 2 for Event 3', '2024-05-12 19:00:00', 3);
