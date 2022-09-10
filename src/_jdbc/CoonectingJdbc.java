package _jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CoonectingJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// com.mysql.cj.jdbc.Driver---> class name
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt_2022", "root", "Vicky75@");

		System.out.println("connected to sql");

		Statement smt = con.createStatement();

		// frame a query here in string

		String q1 = "select * from dept";
		//using method executeQuery

		ResultSet rs = smt.executeQuery(q1);

		System.out.println("query executed");

		// resultSet has no method of hasNext() . hasNext() is in arraylist
		// resultSet go row by row

		while (rs.next()) {
			// column Index to be printed or we can even give column name

			System.out.println(rs.getString("deptcode") + " " + rs.getString(2) + " " + rs.getInt(3));

		}
		
		// using method executeUpdate;
		
		String q2 =" update salary set basic = basic+200000 where empcode= 6569";
		int row= smt.executeUpdate(q2);
		
		System.out.println("number of records updated ="+ row);

	}

}
