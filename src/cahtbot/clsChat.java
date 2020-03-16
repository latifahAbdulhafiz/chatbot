/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cahtbot;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author لطيفه
 */
public class clsChat {
    
    public static int save(String Sendername,String msgtxt){
        int status = 0 ;
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        try{
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into chathistory (sendername,msgtxt,mdate) values (?,?,?)");
            ps.setString(1, Sendername);
            ps.setString(2, msgtxt);
            ps.setString(3,now.toString());
            
            status = ps.executeUpdate();
            con.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
        
        return status;
    
    }
    
    
    public static ResultSet getchattingList(){
        ResultSet rs = null ;
        try{
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from chathistory",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=ps.executeQuery();
            //con.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
    
    }

    
    
    
    
}
