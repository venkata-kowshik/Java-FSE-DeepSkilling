CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS BEGIN
 UPDATE Accounts SET Balance=Balance*1.01 WHERE AccountType='Savings'; COMMIT; END; /
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(p_dept VARCHAR2,p_bonus NUMBER) IS BEGIN
 UPDATE Employees SET Salary=Salary+(Salary*p_bonus/100) WHERE Department=p_dept; COMMIT; END; /
CREATE OR REPLACE PROCEDURE TransferFunds(p_from NUMBER,p_to NUMBER,p_amt NUMBER) IS v NUMBER;
BEGIN SELECT Balance INTO v FROM Accounts WHERE AccountID=p_from FOR UPDATE;
IF v<p_amt THEN RAISE_APPLICATION_ERROR(-20002,'Insufficient'); END IF;
UPDATE Accounts SET Balance=Balance-p_amt WHERE AccountID=p_from;
UPDATE Accounts SET Balance=Balance+p_amt WHERE AccountID=p_to; COMMIT; END;
/