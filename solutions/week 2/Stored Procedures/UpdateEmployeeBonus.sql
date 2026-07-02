DELIMITER //

CREATE PROCEDURE UpdateEmployeeBonus(
    IN p_Department VARCHAR(50),
    IN p_BonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE Department = p_Department;
END //

DELIMITER ;