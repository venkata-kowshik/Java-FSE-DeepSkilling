DECLARE CURSOR c IS SELECT c.Name,t.* FROM Customers c JOIN Accounts a ON c.CustomerID=a.CustomerID JOIN Transactions t ON a.AccountID=t.AccountID WHERE TRUNC(t.TransactionDate,'MM')=TRUNC(SYSDATE,'MM');
BEGIN FOR r IN c LOOP DBMS_OUTPUT.PUT_LINE(r.Name||' '||r.Amount); END LOOP; END; /
DECLARE CURSOR c IS SELECT AccountID FROM Accounts;
BEGIN FOR r IN c LOOP UPDATE Accounts SET Balance=Balance-100 WHERE AccountID=r.AccountID; END LOOP; COMMIT; END; /
DECLARE CURSOR c IS SELECT LoanID,InterestRate FROM Loans;
BEGIN FOR r IN c LOOP UPDATE Loans SET InterestRate=r.InterestRate+0.5 WHERE LoanID=r.LoanID; END LOOP; COMMIT; END;
/