BEGIN;
INSERT INTO flights(id, number, origin, destination, departureDate, departureTime, arrivalDate, arrivalTime, plane_id)
VALUES(NEXTVAL('flightsSequence'), 'ABC123', 'City1', 'City2', '2023-11-21', '08:00:00', '2023-11-21', '18:00:00', 1);
INSERT INTO flights(id, number, origin, destination, departureDate, departureTime, arrivalDate, arrivalTime, plane_id)
VALUES(NEXTVAL('flightsSequence'), 'DEF456', 'City3', 'City4', '2023-11-22', '09:30:00', '2023-11-22', '19:30:00',2 );
INSERT INTO flights(id, number, origin, destination, departureDate, departureTime, arrivalDate, arrivalTime, plane_id)
VALUES(NEXTVAL('flightsSequence'), 'GHI789', 'City5', 'City6', '2023-11-23', '11:00:00', '2023-11-23', '21:00:00', 2);
INSERT INTO flights(id, number, origin, destination, departureDate, departureTime, arrivalDate, arrivalTime, plane_id)
VALUES(NEXTVAL('flightsSequence'), 'JKL012', 'City7', 'City8', '2023-11-24', '12:30:00', '2023-11-24', '22:30:00', 1);
COMMIT;
