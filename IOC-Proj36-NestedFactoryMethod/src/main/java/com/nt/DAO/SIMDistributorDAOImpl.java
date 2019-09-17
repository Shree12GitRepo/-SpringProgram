package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.BO.SIMDistributorBO;

public class SIMDistributorDAOImpl implements SIMDistributorDAO {
	private DataSource ds;

	public SIMDistributorDAOImpl(DataSource ds) {
		System.out.println("SIMDistributorDAOImpl::1ParamConstructor");
		this.ds = ds;
	}

	@Override
	public List<SIMDistributorBO> find_Distributor_NameBySIM_Name(String simName) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		SIMDistributorBO bo=null;
		List<SIMDistributorBO> liBO=null;
		
		try 
		{
			//get Connection Object..
			con=ds.getConnection();
			System.out.println(simName);
			//get Preparestatement object...
			ps=con.prepareStatement("select ID,DNAME,LOCATION,SIMCOMPANY from SimDistributor where Simcompany in"+simName+"");
			
			//get resultSet Object...
			rs=ps.executeQuery();
			liBO=new ArrayList<SIMDistributorBO>();
			while(rs.next())
			{
				bo=new SIMDistributorBO();
				bo.setId(rs.getInt(1));
				bo.setDname(rs.getString(2));
				bo.setLocation(rs.getString(3));
				bo.setSimCompany(rs.getString(4));
				liBO.add(bo);
			}
			
			

			
		} 
		catch (SQLException se) 
		{
			throw se;
			
		}
		catch (Exception e) 
		{
			throw e;
			
		}
		finally 
		{
			//close PrepareStatement..
			try {
				if(ps!=null)
				{
					ps.close();
				}
			}
			catch(Exception e)
			{
				throw e;
			}
			//close ResultSet...
			try {
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(Exception e)
			{
				throw e;
			}
			
			//close connectionObject...
			try {
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				throw e;
			}
			
		}
		System.out.println(bo.getDname()+"--->"+bo.getId());		
		return liBO;
	}

	
}
