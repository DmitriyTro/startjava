SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'destroyed';

SELECT * FROM Jaegers WHERE mark = '2' IN mark = '4';

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE LAUNCH = (SELECT MIN(launch) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'life';

DELETE FROM Jaegers WHERE status = 'destroyed';