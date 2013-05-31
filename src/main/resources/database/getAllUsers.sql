DELIMITER // 
	CREATE OR REPLACE PROCEDURE `getUser`(IN firstName VARCHAR(255))
		BEGIN
        	SELECT * 
        		FROM User
        		WHERE firstname = firstName;
    	END // 
DELIMITER ; 