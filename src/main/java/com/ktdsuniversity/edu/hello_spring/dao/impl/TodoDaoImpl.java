package com.ktdsuniversity.edu.hello_spring.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.hello_spring.dao.TodoDao;
import com.ktdsuniversity.edu.hello_spring.vo.TodoVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoWriteVO;

@Repository
public class TodoDaoImpl extends SqlSessionDaoSupport implements TodoDao {

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public TodoVO selectOneTodo(int id) {
		return this.getSqlSession().selectOne("com.ktdsuniversity.edu.hello_spring.dao.selectOneTodo", id);
	}

	@Override
	public List<TodoVO> selectAllTodo() {
		return this.getSqlSession().selectList("com.ktdsuniversity.edu.hello_spring.dao.selectAllTodo");
	}

	@Override
	public int insertTodo(TodoWriteVO todoWriteVO) {
		return this.getSqlSession().insert("com.ktdsuniversity.edu.hello_spring.dao.insertTodo" , todoWriteVO);
	}

	@Override
	public int updateTodo(TodoVO todoVO) {
		return this.getSqlSession().update("com.ktdsuniversity.edu.hello_spring.dao.updateTodo", todoVO);
	}

	@Override
	public int deleteTodo(int id) {
		return this.getSqlSession().delete("com.ktdsuniversity.edu.hello_spring.dao.deleteTodo", id);
	}
}
