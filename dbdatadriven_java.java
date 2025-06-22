package rkarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbdatadriven {

	public static void main(String[] args) {
		ArrayList<String> web = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/ramwebsite","root","");
			Statement vm=db.createStatement();
			ResultSet av=vm.executeQuery("select * from websites");

			while(av.next()) {
				System.out.println(av.getInt(1)+" "+av.getString(2));
				web.add(av.getString(2));
			}
			System.out.println("End");
			System.out.println("The Array list final websites are:" +web);
			for (int j=0; j<=2; j++)
			{
				WebDriver s = new ChromeDriver();
				s.get(web.get(j));
			}
			System.out.println("Webpages launched Successfully!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
