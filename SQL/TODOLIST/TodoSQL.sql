
INSERT INTO tbl_todo VALUES();

-- DML Insert
INSERT INTO `project`.`tbl_todo`
(`todo`,`duedate`)
VALUES
('JSP 공부','2023-05-05');


-- DML update
UPDATE tbl_todo SET TODO='청소', DUEDATE='2023-05-03' WHERE TNO=2;
 -- UPDATE tbl_todo SET TODO=?', DUEDATE='?' WHERE TNO=?;
 
-- DML delete
DELETE FROM tbl_todo WHERE TNO = 8;
-- DELETE FROM tbl_todo WHERE TNO = ?;

-- DQL SELECT
-- LIST
SELECT * FROM tbl_todo;

-- 상세보기 VIEW, 수정 UPDATE- VIEW
SELECT * FROM tbl_todo WHERE TNO = 2;
-- SELECT * FROM tbl_todo WHERE TNO = ?;
