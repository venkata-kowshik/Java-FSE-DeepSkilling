-- Exercise 1: Control Structures
-- Scenario 1
DECLARE
BEGIN
 FOR c IN (SELECT CustomerID,DOB FROM Customers) LOOP
   IF TRUNC(MONTHS_BETWEEN(SYSDATE,c.DOB)/12)>60 THEN
      UPDATE Loans SET InterestRate=InterestRate-1 WHERE CustomerID=c.CustomerID;
   END IF;
 END LOOP;
 COMMIT;
END;
/
-- Scenario 2 (requires IsVIP column)
-- ALTER TABLE Customers ADD IsVIP CHAR(1);
BEGIN
 FOR c IN (SELECT CustomerID,Balance FROM Customers) LOOP
   IF c.Balance>10000 THEN
      UPDATE Customers SET IsVIP='Y' WHERE CustomerID=c.CustomerID;
   END IF;
 END LOOP;
 COMMIT;
END;
/
-- Scenario 3
BEGIN
 FOR r IN (
   SELECT c.Name,l.EndDate FROM Customers c JOIN Loans l
   ON c.CustomerID=l.CustomerID
   WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE+30)
 LOOP
   DBMS_OUTPUT.PUT_LINE('Reminder: '||r.Name||' loan due on '||r.EndDate);
 END LOOP;
END;
/