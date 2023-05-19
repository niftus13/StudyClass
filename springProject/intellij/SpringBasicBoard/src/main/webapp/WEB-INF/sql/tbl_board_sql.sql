-- tbl_board 


-- select
SELECT * FROM project.tbl_board;

-- insert

insert into tbl_board (title, content, writer) values ('게시글 테스트','게시글 쓰기 테스트 1','테스터');
-- insert into tbl_board (title, content, writer) values (#{},#{},#{});


-- update
update tbl_board 
set title='test11', content='test11', writer='test11',file ='aa.jpg'
where bno = 4;
-- update tbl_board set title=#{title}', content=#{content}', writer=#{},file =#{} where bno = #{};

-- delete
