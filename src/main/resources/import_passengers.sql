BEGIN;
INSERT INTO passengers(id, surname, firstname, email)
VALUES (NEXTVAL('passengersSequence'), 'Doe', 'John', 'john@example.com');
INSERT INTO passengers(id, surname, firstname, email)
VALUES (NEXTVAL('passengersSequence'), 'Smith', 'Alice', 'alice@example.com');
COMMIT;
