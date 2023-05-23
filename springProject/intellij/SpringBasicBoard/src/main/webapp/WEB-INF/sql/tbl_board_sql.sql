-- tbl_board 


-- select
SELECT * FROM project.tbl_board;

SELECT bno,title,content,file,uname as writer
FROM tbl_board b, member m
where b.memidx = m.idx
;

-- insert

insert into tbl_board (title, content, writer) values ('게시글 테스트','게시글 쓰기 테스트 1','테스터');
-- insert into tbl_board (title, content, writer) values (#{},#{},#{});

insert into tbl_board(title,content, memidx) values('게시글 테스트1','글쓰기 테스트1',5);
-- insert into tbl_board(title,content, memidx) values('#{}','#{}',#{});

-- update
update tbl_board 
set title='test11', content='test11', writer='test11',file ='aa.jpg'
where bno = 4;
-- update tbl_board set title=#{title}', content=#{content}', writer=#{},file =#{} where bno = #{};

-- delete
