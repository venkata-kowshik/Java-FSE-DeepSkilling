CREATE OR REPLACE PACKAGE CustomerManagement AS
PROCEDURE AddCustomer(p_id NUMBER,p_name VARCHAR2,p_dob DATE,p_bal NUMBER);
PROCEDURE UpdateCustomer(p_id NUMBER,p_bal NUMBER);
FUNCTION GetBalance(p_id NUMBER) RETURN NUMBER;
END;
/
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
PROCEDURE AddCustomer(p_id NUMBER,p_name VARCHAR2,p_dob DATE,p_bal NUMBER) IS BEGIN INSERT INTO Customers VALUES(p_id,p_name,p_dob,p_bal,SYSDATE); END;
PROCEDURE UpdateCustomer(p_id NUMBER,p_bal NUMBER) IS BEGIN UPDATE Customers SET Balance=p_bal WHERE CustomerID=p_id; END;
FUNCTION GetBalance(p_id NUMBER) RETURN NUMBER IS v NUMBER; BEGIN SELECT Balance INTO v FROM Customers WHERE CustomerID=p_id; RETURN v; END;
END;
/
-- Similar packages can be created for EmployeeManagement and AccountOperations following the same pattern.
