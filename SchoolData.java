package SchoolManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolData 
{
    String SchoolName,StudentName;
	int StudentId;
	int NumberofAdmission,TotalStudents=500;
	int NumberofTeachers;
	int TotalFees=200000;
	int AmountAvailable;
	String TeacherName;
	int TeacherID;
	int ch,ch1;
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	void Student() 
	{
		String SchoolName;
		String StudentName = null;
		int StudentId = 0;
		int i;
		System.out.println("------------SCHOOL MANAGEMENT SYSTEM-------------");
		System.out.println("Enter the school name: ");
		SchoolName = sc.next();
		System.out.println("Enter the no. of Admission: ");
		NumberofAdmission=sc.nextInt();
		TotalStudents+=NumberofAdmission;
		System.out.println("Total number of students: "+TotalStudents);
		
		for(i=0;i<NumberofAdmission;i++)
		{
		System.out.println("----------STUDENT DETAILS-----------");
		System.out.println("Enter the student name: ");
		StudentName=sc.next();
		System.out.println("Enter student ID: ");
		StudentId=sc.nextInt();
		
		System.out.println("--------COURSES---------");
		System.out.println("1. Automobile");
		System.out.println("2. CSE");
		System.out.println("3. ECE");
		System.out.println("4. EEE");
		System.out.println("5. IT");
		System.out.println("6. Mechanical");
		System.out.println("7. Civil");
		
		System.out.println("Enter your course: ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			int Fees=5000;
			System.out.println("1. Automobile");
			System.out.println("Fees for Automobile is "+Fees);
			TotalFees+=Fees;
			break;
		case 2:
			int Fees1=7000;
			System.out.println("2. CSE");
			System.out.println("Fees for CSE is "+Fees1);
			TotalFees+=Fees1;
			break;
		case 3:
			int Fees2=6000;
			System.out.println("3. ECE");
			System.out.println("Fees for ECE is "+Fees2);
			TotalFees+=Fees2;
			break;
		case 4:
			int Fees3=6000;
			System.out.println("4. EEE");
			System.out.println("Fees for EEE is "+Fees3);
			TotalFees+=Fees3;
			break;
		case 5:
			int Fees4=7000;
			System.out.println("5. IT");
			System.out.println("Fees for IT is "+Fees4);
			TotalFees+=Fees4;
			break;
		case 6:
			int Fees5=5000;
			System.out.println("6. Mechanical");
			System.out.println("Fees for Mechanical is "+Fees5);
			TotalFees+=Fees5;
			break;
		case 7:
			int Fees6=6000;
			System.out.println("7. Civil");
			System.out.println("Fees for Civil is "+Fees6);
			TotalFees+=Fees6;
			break;
			default:
				System.out.println("Entered the wrong course");
		}
		System.out.println("Total amount paid by students: "+TotalFees);
		AmountAvailable=TotalFees;
		}
	}
	
	void Teacher() 
	{
		System.out.println("Enter number of Teachers: ");
		NumberofTeachers=sc.nextInt();
		for(int i=0;i<NumberofTeachers;i++)
		{
		System.out.println("----------TEACHER DETAILS---------");
		System.out.println("Enter Teacher name: ");
		TeacherName=sc.next();
		System.out.println("Enter Teacher ID: ");
		TeacherID=sc.nextInt();
		System.out.println("Enter course handled by Teacher: ");
		ch1=sc.nextInt(); 
		switch(ch1)
		{
		case 1:
			Double Salary=30000.00;
			System.out.println("1. Automobile");
			System.out.println("Salary for Automobile is "+Salary);
			AmountAvailable-=Salary;
			break;
		case 2:
			Double Salary1=40000.00;
			System.out.println("2. CSE");
			System.out.println("Salary for CSE is "+Salary1);
			AmountAvailable-=Salary1;
			break;
		case 3:
			Double Salary2=30000.00;
			System.out.println("3. ECE");
			System.out.println("Salary for ECE is "+Salary2);
			AmountAvailable-=Salary2;
			break;
		case 4:
			Double Salary3=35000.00;
			System.out.println("4. EEE");
			System.out.println("Salary for EEE is "+Salary3);
			AmountAvailable-=Salary3;
			break;
		case 5:
			Double Salary4=45000.00;
			System.out.println("5. IT");
			System.out.println("Salary for IT is "+Salary4);
			AmountAvailable-=Salary4;
			break;
		case 6:
			Double Salary5=35000.00;
			System.out.println("6. Mechanical");
			System.out.println("Salary for Mechanical is "+Salary5);
			AmountAvailable-=Salary5;
			break;
		case 7:
			Double Salary6=30000.00;
			System.out.println("7. Civil");
			System.out.println("Salary for Civil is "+Salary6);
			AmountAvailable-=Salary6;
			break;
			default:
				System.out.println("Entered the wrong course"); 
		}
		System.out.println("Remaining School Amount= "+AmountAvailable); 
	}
	}
	
	 void UseDatabase() throws ClassNotFoundException, SQLException
	 {
	  String sql;
	  System.out.println("Connecting to a selected database....");
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagement","root","root");
	  System.out.println("Connected Database successfully");
	  java.sql.Statement ps=con.createStatement();
	  {
	   sql="CREATE TABLE SCHOOL" +"(StudentId INTEGER not NULL,"+"StudentName VARCHAR(25),"+" TeacherID INTEGER not NULL,"
	   		+ ""+" TeacherName VARCHAR(20))";
	  }
	   ps.executeUpdate(sql);
	  System.out.println("Created table in given database");
	  
	 }
	 void InsertRecord()throws ClassNotFoundException
	 {
	  try
	  {
	   System.out.println("you want insert your database:");
	   System.out.println("1.YES");
	   
	   int ch2=sc.nextInt();
	   switch(ch2)
	   {
	   case 1:
	    System.out.println("1.YES");
	    break;
	   }
	   System.out.println("Enter StudentID:");
	   StudentId=sc.nextInt();
	   System.out.println("Enter StudentName:");
	   StudentName=sc.next();
	   System.out.println("Enter TeacherID:");
	   TeacherID=sc.nextInt();
	   System.out.println("Enter TeacherName:");
	   TeacherName=sc.next();
	   
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagement","root","root");
	   PreparedStatement ps=con.prepareStatement("Insert into SCHOOL values(?,?,?,?)");
	   ps.setInt(1, StudentId);
	   ps.setString(2, StudentName);
	   ps.setLong(3, TeacherID );
	   ps.setString(4, TeacherName);
	   int i=ps.executeUpdate();
	   System.out.println(i+" Record inserted");
	   con.close();
	   }
	  
	  catch(SQLException e)
	  {
	   System.out.println(e);
	  }
	 }
	 void RetriveRecord() throws SQLException
	  {
	  try
	  {
	   System.out.println("you want retrive your database:");
	   System.out.println("1.YES");
	   
	   int ch3=sc.nextInt();
	   switch(ch3)
	   {
	   case 1:
	    System.out.println("1.YES");
	    break;
	    }


	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagement","root","root");
	   PreparedStatement ps=con.prepareStatement("Select * from SCHOOL");
	   ResultSet rs=ps.executeQuery();
	   while(rs.next())
	   {
	    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	   } 
	  }
	  catch(ClassNotFoundException e)
	  {
	   System.out.println(e);
	  }
	  }
		
	 void UpdateRecord()throws ClassNotFoundException
	 {
	  try
	  {
	   System.out.println("Enter the StudentId");
	   StudentId=sc.nextInt();
	   System.out.println("Enter the StudentName");
	   StudentName=sc.next();
	   
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchoolManagement","root","root");
	   PreparedStatement ps=con.prepareStatement("UPDATE SCHOOL SET StudentName=? where StudentId=?");
	   ps.setString(1, StudentName);
	   ps.setInt(2, StudentId);
	   int i=ps.executeUpdate();
	   System.out.println(i+" Record updated");
	   con.close();
	  }
	  catch(SQLException e)
	  {
	   e.printStackTrace();
	  }
	 }
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		SchoolData sd=new SchoolData();
		//sd.Student();
		//sd.Teacher();
		//sd.UseDatabase();
		sd.InsertRecord();
		//sd.RetriveRecord();
	    //sd.UpdateRecord();
	}

}
