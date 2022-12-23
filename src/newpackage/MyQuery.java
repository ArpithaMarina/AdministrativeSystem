package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author 1bestcsharp.blogspot.com
 */
public class MyQuery {
    
   public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull", "root","");
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public ArrayList<Product> BindTable(){
        
   ArrayList<Product> list = new ArrayList<Product>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = con.createStatement();
   rs = st.executeQuery("SELECT `ID_PRO`, `PRO_NAME`, `QTE_IN_STOCK`, `RETAIL_PRICE`, `PRO_IMAGE`, `WH_SALE PRICE` FROM `products`");
   
   Product p;
   while(rs.next()){
   p = new Product(
   rs.getString("ID_PRO"),
   rs.getString("PRO_NAME"),
   rs.getInt("QTE_IN_STOCK"),
   rs.getString("RETAIL_PRICE"),
   rs.getBytes("PRO_IMAGE"),
   rs.getInt("WH_SALE PRICE")
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
   Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }
}
