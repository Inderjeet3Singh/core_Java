package _jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_dbt_2022", "root", "Vicky75@");

		System.out.println("connected to sql");

		// in prepared statement we have to declare query first show that
		// it will know which query has to executed

		String q1 = "select * from salary where empcode = ? ";
		// ? means "1 parameter"

		// we have to set the empcode value before running the code

		java.sql.PreparedStatement pmt = con.prepareStatement(q1);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter empcode ");

		int no = sc.nextInt();
		// for setting the value of ? we have a method name pmt.setInt(1, no); which
		// do--->for parameter 1 we
		// are substituting the value "no"

		pmt.setInt(1, no);
		ResultSet rs = pmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getInt(3) + " " + rs.getInt(5));
		}
       
		String q2 =" update salary set basic = basic- ? where empcode= ?";
		
		java.sql.PreparedStatement pmt2 = con.prepareStatement(q2);
		
		System.out.println("enter salary to be updated ");

		int sal = sc.nextInt();
		
		System.out.println("enter empcode whose salary is to be updated ");
		
		int emp = sc.nextInt();
		
		pmt2.setInt(1, sal);
		pmt2.setInt(2, emp);
		
		int row= pmt2.executeUpdate();
		
		System.out.println("number of records updated ="+ row);
		

		
       
	}

}
