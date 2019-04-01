package g;
import java.sql.*;

import g.GetCon;
public class RegisterUser {
    static int nextvalue1 = 11;

static int status=0;
//int accountno=1;
public static int register(String username,String password,String repassword,double amount,String adderess,double phone){
	//public static int register(String email,String password,String gender,String country,String name){

	Connection con=GetCon.getCon();
	PreparedStatement ps;
	try {
		ps = con.prepareStatement("Insert into NEWACCOUNT values(?,?,?,?,?,?,?)");
//		int	nextvalue1=GetCon.getPrimaryKey();

	// if resultset has data, get the primary key value
	// of last inserted record
        
	
		ps.setInt(1,nextvalue1++);
		ps.setString(2,username);
		ps.setString(3,password);
		ps.setString(4,repassword);
		ps.setDouble(5,amount);
		ps.setString(6,adderess);
		ps.setDouble(7,phone);
		String q=ps.toString();
		status=ps.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return status;
	
}
}
