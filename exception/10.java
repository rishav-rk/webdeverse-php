// Write a Java program to throw the SQL Query, insert, delete, update, if not successful then throw an exception

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
class Main {
    private static Connection con;
    private static String query;
    Main(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        }
        catch(ClassNotFoundException cnf_e)
        {
            System.out.println("Error in finding class");
        }
        catch(SQLException sql_e)
        {
            System.out.println(sql_e.toString());
        }
    }
    public static void main(String[] args) {
        new Main();
        int rows_affected_insert,rows_affected_update,rows_affected_delete;
        try
        {
                Statement  ps = con.createStatement();

                query = "insert into student (roll_no) values (1234)";
                rows_affected_insert = ps.executeUpdate(query);

                query = "UPDATE student SET roll_no = 4321 WHERE roll_no = 1234";
                rows_affected_update = ps.executeUpdate(query);

                query = "DELETE FROM student WHERE roll_no = 7002";
                rows_affected_delete = ps.executeUpdate(query);

                System.out.println("Rows inserted : "+rows_affected_insert);
                System.out.println("Rows updated: "+rows_affected_update);
                System.out.println("Rows deleted: "+rows_affected_delete);
        }
        catch(SQLException sqle)
        {
                        System.out.println(sqle.toString());
                        sqle.printStackTrace();
        }
        finally{
            if(con!=null)
            {
               try
               {
                    con.close();
               } 
               catch(SQLException s)
               {
                    s.printStackTrace();
               }
            }
        }
    }
}
