package userInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String address = "jdbc:mysql://localhost:3306/btm";
		String admin = "root";
		String code = "1234";
		Connection con2 = null;
		PreparedStatement recive = null;
		String take = "select * from faketook where uid = ? and pass = ?;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con2 = DriverManager.getConnection(address, admin, code);
			 recive = con2.prepareStatement(take); 
			 System.out.println("Enter user id");
			 String id = scan1.nextLine();
			 recive.setString(1, id);	 
			 System.out.println("Enter user password");
			 String tic = scan1.nextLine();
			 recive.setString(2, tic); 
			 ResultSet result = recive.executeQuery();
			 if(result.next()) {
				 System.out.println("Found");
			 }
			 else {
				 System.out.println("Not Found");
			 }
			 
			 
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con2.close();
				recive.close();
				scan1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
