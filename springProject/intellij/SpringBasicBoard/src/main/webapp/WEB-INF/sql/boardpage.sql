SELECT * FROM project.tbl_board order by bno desc limit 0,5;	-- 1page (1-1) *5 = 0
SELECT * FROM project.tbl_board order by bno desc limit 5,5;	-- 2page (2-1)*5 = 5
SELECT * FROM project.tbl_board order by bno desc limit 10,5;	-- 3page (3-1)*5 = 10
SELECT * FROM project.tbl_board order by bno desc limit 15,5;	-- 4page (4-1)*5 = 15
