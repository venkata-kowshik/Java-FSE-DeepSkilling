CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers FOR EACH ROW
BEGIN :NEW.LastModified:=SYSDATE; END; /
CREATE TABLE AuditLog(AuditID NUMBER GENERATED ALWAYS AS IDENTITY,TransactionID NUMBER,AccountID NUMBER,ActionDate DATE,Action VARCHAR2(50));
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions FOR EACH ROW
BEGIN INSERT INTO AuditLog(TransactionID,AccountID,ActionDate,Action)
VALUES(:NEW.TransactionID,:NEW.AccountID,SYSDATE,'Transaction Inserted'); END; /
CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions FOR EACH ROW
DECLARE v NUMBER;
BEGIN
SELECT Balance INTO v FROM Accounts WHERE AccountID=:NEW.AccountID;
IF :NEW.TransactionType='Deposit' AND :NEW.Amount<=0 THEN RAISE_APPLICATION_ERROR(-20001,'Invalid deposit'); END IF;
IF :NEW.TransactionType='Withdrawal' AND :NEW.Amount>v THEN RAISE_APPLICATION_ERROR(-20002,'Insufficient balance'); END IF;
END;
/