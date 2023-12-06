BEGIN;
INSERT INTO planes(id, operator, model, registration, capacity)
VALUES(NEXTVAL('planeSequence'), 'AirbusIndustrie', 'AIRBUS A380',
       'F-ABCD', 10);
INSERT INTO planes(id, operator, model, registration, capacity)
VALUES(NEXTVAL('planeSequence'), 'Boeing', 'BOEING CV2', 'F-AZER', 15);
COMMIT;
