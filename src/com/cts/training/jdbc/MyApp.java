package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyApp {
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/studentdb","root","");
			
			Statement stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add record\n2.Delete record\n3.Show all records\nChoose the operation :");
			byte ch=sc.nextByte();
			boolean flag=true;
			
			while(flag) {
				if(ch <5 && ch>0) {
					switch(ch) {
					case 1: System.out.println("Enter the details:");
							System.out.println("name:");
							String name=sc.next();
							System.out.println("email:");
							String email=sc.next();
							System.out.println("department:");
							String dept=sc.next();
							String query="insert into student(name,email,department) values ('"+name+"','"+email+"',"+"'"+dept+"');";
							//System.out.println(query);
							int k = stmt.executeUpdate(query);
							System.out.println(k+" rows effected!!!");
							break;
					
					case 2: System.out.println("Enter the id of row you want to delete:");
							int id1=sc.nextInt();
							String query1="delete from student where id="+id1;
							int k1 = stmt.executeUpdate(query1);
							System.out.println(k1+" row deleted!!!");
							break;
					
					case 3: ResultSet rs = stmt.executeQuery("select * from student;");
							while(rs.next()) {
								System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));
							}
							//System.out.println("Retrieval completed");
							rs.close();
							break;
					
					//case 4:System.exit(0);
			
					}
					System.out.println("\n 1.Add record\n2.Delete record\n3.Show all records\n4.exit\nChoose the operation :");
					byte another=sc.nextByte();
					ch=another;
					if(ch==4)
						flag = false;	
				}
				
			}
			con.close();
			System.out.println("Exit successfull");	
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
	}

}
