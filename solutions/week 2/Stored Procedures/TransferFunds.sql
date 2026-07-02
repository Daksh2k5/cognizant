DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN p_FromAccount INT,
    IN p_ToAccount INT,
    IN p_Amount DECIMAL(10,2)
)
BEGIN
    DECLARE v_Balance DECIMAL(10,2);
    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_FromAccount;

    IF v_Balance >= p_Amount THEN

        START TRANSACTION;

        UPDATE Accounts
        SET Balance = Balance - p_Amount
        WHERE AccountID = p_FromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_Amount
        WHERE AccountID = p_ToAccount;

        COMMIT;

    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance';
    END IF;
END //

DELIMITER ;