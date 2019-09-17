package com.Student_info.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Student_info.BO.StudentBO;

@Repository("studentDAO")
public final class Student_infoDAOImpl implements Student_infoDAO {
	private static final String insert_Query="insert into Student_info values(?,?,?,?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	
	@Override
	public int insert(StudentBO bo) throws Exception{
		//get the Connection Object from Connection Pool
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(insert_Query);
		System.out.println(bo.getPercentage());
		ps.setString(1, bo.getName());
		ps.setInt(2, bo.getRoll());
		ps.setString(3, bo.getAddress());
		ps.setInt(4, bo.getMark1());
		ps.setInt(5, bo.getMark2());
		ps.setInt(6, bo.getMark3());
		ps.setInt(7, bo.getTotalMark());
		ps.setInt(8, bo.getPercentage());
		int rs=ps.executeUpdate();
		if(rs!=0)
		{
			System.out.println("Inserted Successfully");
		}
		else
		{
			System.out.println("Insertion Failed");
		}
		ps.close();
		con.close();
		return rs;
	}

}
