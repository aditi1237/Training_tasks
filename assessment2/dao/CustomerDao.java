package com.demos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.demos.dbutil.DbConn;
import com.demos.pojos.Customer;

public class CustomerDao {

	public  String sequence(){
		try{
			Connection con=DbConn.getConnection();
			String sql="select updateID.nextval from dual";
			PreparedStatement sta1=con.prepareStatement(sql);
			ResultSet res= sta1.executeQuery();
			System.out.println("hi");
			if(res.next()){
				int seq=res.getInt(1);
				if( seq < 10){
					return "00" + res.getString(1);
				}
				else if(seq<100){
					return "0" + res.getString(1);
				}
				else
				{
					return ""+seq;
				}
			}
			else{
				return null;
			}
		
		}
		catch(Exception e){
			return null;
			
		}
	}
	public void inputCus(Customer customer){
		try{
		
			Connection con1= DbConn.getConnection();

			String sql2="insert into customerr values(?,?,?,?)";

				PreparedStatement stat=con1.prepareStatement(sql2);
				String cusID = customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+sequence();
				
				
				customer.setCustId(cusID);
				System.out.println(customer.getCustId());
				/*sta3.setString(1,customer.getCustName());
				sta3.setString(2,cs.getCustName());
				int result=sta3.executeUpdate();
				if(result>0)
				{
					System.out.println("Updated!!");	
				}

			}
*/			stat.setString(1,customer.getCustName());
			stat.setString(2,customer.getCustLastName());
			stat.setString(3,customer.getCustId());
			stat.setString(4,customer.getAddress());
			int result = stat.executeUpdate();
			
			if(result>0)
				System.out.println(result);
				
			System.out.println(customer.getCustId());
				}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
