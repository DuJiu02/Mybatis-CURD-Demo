package com.hr.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hr.entity.Users;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//加载主配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//创建session工厂
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		//创建session
		SqlSession session = sf.openSession();
		
		//使用session进行增删改查
		//查询全部
		//List<Users> list = session.selectList("com.hr.dao.UsersMapper.queryAll");
		//System.out.println(list);
		
		//查询单个
		//Users u = session.selectOne("com.hr.dao.UsersMapper.queryOne", 1);
		//System.out.println(u);
		
		//根据名字模糊查询
//		List<Users> list = session.selectList("com.hr.dao.UsersMapper.queryLike","张");
//		System.out.println(list);
		
		//年龄小于多少多少
//		List<Users> list = session.selectList("com.hr.dao.UsersMapper.queryByAge",2);
//		System.out.println(list);
		
		
		//添加
//		Users u = new Users();
//		u.setUname("王五");
//		u.setSex("男");
//		u.setAge(10);
//		u.setUsid(2);
//		int count = session.insert("com.hr.dao.UsersMapper.insert",u);
//		session.commit();//增删改需要提交事务
//		System.out.println(count);
//		System.out.println(u.getUid());
		
		
		//修改
//		Users u = new Users();
//		u.setUid(6);
//		u.setSex("男");
//		u.setUsid(2);
//		u.setAge(15);
//		u.setUname("王老六");
//		int count = session.insert("com.hr.dao.UsersMapper.update",u);
//		session.commit();//增删改需要提交事务
//		System.out.println(count);
//		System.out.println(u.getUid());
		
		//删除
		int count = session.delete("com.hr.dao.UsersMapper.delete", 1);
		session.commit();//增删改需要提交事务
		System.out.println(count);
		
		
		//关闭session
		session.close();
	}
}
