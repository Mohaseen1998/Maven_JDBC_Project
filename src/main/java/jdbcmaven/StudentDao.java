package jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	public void saveStudent(Student stu) {
		String s = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String user_name = "root";
		String password = "root";
		String query = "insert into stu values (?,?,?)";
		try {
			// 1: load and register Driver
			Class.forName(s);
			// 2: EStablish Connection
			Connection c = DriverManager.getConnection(url, user_name, password);
			// 3: create a statement
			PreparedStatement pre = c.prepareStatement(query);
			pre.setInt(1, stu.getId());
			pre.setString(2, stu.getName());
			pre.setDouble(3, stu.getPhone());
			// 4: Execute statement / Query
			pre.executeUpdate();
			// 5: close
			c.close();
			System.out.println(" data saved");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
	}
}
