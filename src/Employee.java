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
                    System.out.println("Insert the data");
                    System.out.println("Enter the empcode");
                    int empcode = s.nextInt();
                    System.out.println("Enter the name of the employee ");
                    String name = s.next();
                    System.out.println("Enter the designation ");
                    String design = s.next();
                    System.out.println("Enter the salary of the employee");
                    salary = s.nextInt();
                    System.out.println("Enter the company name of the employeee");
                    String compName = s.next();
                    System.out.println("Enter the phone number of the employee ");
                    String phone = s.next();
                    System.out.println("Enter the Email id of the employee ");
                    String email = s.next();
                    System.out.println("Enter the password");
                    password = s.next();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
                        String sql = "INSERT INTO `employees`(`employeecode`, `employeename`, `designation`, `salary`, `companyname`, `phno`, `emailid`, `password`) VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setInt(1,empcode);
                        stmt.setString(2,name);
                        stmt.setString(3,design);
                        stmt.setInt(4,salary);
                        stmt.setString(5,compName);
                        stmt.setString(6,phone);
                        stmt.setString(7,email);
                        stmt.setString(8,password);
                        stmt.executeUpdate();
                    }
                    catch (Exception e){
                        System.out.println((e));
                    }
                    //String sql = "INSERT INTO `students`(`name`, `admNo`, `rollNo`, `collage`) VALUES ('"+name+"','"+admin+"','"+rollNo+"','"+collegeName+"')";
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

