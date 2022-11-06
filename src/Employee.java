import java.sql.*;
import java.util.Scanner;

public class Employee {
    public static void main(String args[])
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
        }
        catch (Exception e){
            System.out.println(e);
        }
        int choice;
        String employeename,designation,companyname,emailid,password;
        int employeecode,salary,phno;
        Scanner s= new Scanner(System.in);
        while(true){
            System.out.println("1.select any option");
            System.out.println("1.insert");
            System.out.println("2.select");
            System.out.println("3.search");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.exit");
            System.out.println("enter the choice");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("insertdata");
                    System.out.println("enter employee code");
                    employeecode=s.nextInt();
                    System.out.println("enter employee name");
                    employeename=s.next();
                    System.out.println("enter employee desigantion");
                    designation=s.next();
                    System.out.println("enter employee salary");
                    salary=s.nextInt();
                    System.out.println("enter company name");
                    companyname=s.next();
                    System.out.println("enter phone number");
                    phno=s.nextInt();
                    System.out.println("enter email id");
                    emailid=s.next();
                    System.out.println("enter password");
                    password=s.next();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
                        String sql="INSERT INTO `employees`(`employeecode`, `employeename`, `designation`, `salary`, `companyname`, `phno`, `emailid`, `password`) VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setInt(1,employeecode);
                        stmt.setString(2,employeename);
                        stmt.setString(3,designation);
                        stmt.setString(4,companyname );
                        stmt.setInt(5,phno);
                        stmt.setString(6,emailid);
                        stmt.setString(7,password);

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;

                case 2:
                    System.out.println("select data");
                    break;
                case 3:
                    System.out.println("search data");
                    break;
                case 5:
                    System.out.println("delete data");
                    break;
                case 6:
                    System.out.println("exit");
                    System.exit(0);
                    break;
            }
        }
    }
}

