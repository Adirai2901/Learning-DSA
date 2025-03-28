import java.sql.*;
public class demo_JDBC {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "****";
//        String sql = "insert into student values (5,'Monkey',99)";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connect established");

        Statement st = con.createStatement();

//        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//      String name = rs.getString("Name");
//      System.out.println(name);
//        while(rs.next()){
//            System.out.print(rs.getInt(1)+"-");
//            System.out.print(rs.getString(2)+"-");
//            System.out.println(rs.getInt(3));
//        }
        boolean x = st.execute("insert into student values (6,'cow',99)");
//        System.out.println(x);

        

        ResultSet rs = st.executeQuery("Select * from student");
        while(rs.next()){
            System.out.print(rs.getInt(1)+"-");
            System.out.print(rs.getString(2)+"-");
            System.out.println(rs.getInt(3));
        }


        con.close();


        System.out.println("connection closed");

    }
}
