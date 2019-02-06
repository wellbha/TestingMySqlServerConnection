package testing;

import org.testng.annotations.Test;

import java.sql.*;

public class MySqlConnection {

    @Test
    public void connectSqlDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","well7bha");
        System.out.println("Connected to my SQL DB");
        Statement statement = conection.createStatement();
        ResultSet results = statement.executeQuery("select * from employeedetails");

        while(results.next()){
            String firstname = results.getString("firstname");
            System.out.print(firstname+" ");
            String secondname = results.getString("secondname");
            System.out.print(secondname+" ");
            String id = results.getString("id");
            System.out.println(id);
        }

    }

}
