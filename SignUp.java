import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {
public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	String url = "jdbc:mysql://localhost:3306/btm";
	String un = "root";
	String pass = "1234";
	String query = "insert into faketook values (?, ?, ?, ?)";
	Connection con = null;
	PreparedStatement pre = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, un, pass);
		pre = con.prepareStatement(query);
		System.out.println("Enter id");
		int id = user.nextInt();
		user.nextLine();
		pre.setInt(1, id);
		System.out.println("Enter name");
		String name = user.nextLine();
		pre.setString(2, name);
		System.out.println("Enter password");
		String pass1 = user.nextLine();
		pre.setString(3, pass1);
		System.out.println("Enter uid");
		String uid = user.nextLine();
		pre.setString(4, uid);
		pre.executeUpdate();
		System.out.println("Completed");	
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			con.close();
			pre.close();
			user.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}

}
