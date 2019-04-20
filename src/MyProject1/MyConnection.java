/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SANTOSH
 */
public class MyConnection {
    Connection con=null;
    
    public Connection connectMe(){
        try{
         //return DriverManager.getConnection("jdbc:ucanaccess://.\\test\\Record\\CollegeData.accdb");
         return DriverManager.getConnection("jdbc:ucanaccess://.\\test\\Record\\ACADEMY_RECORD.accdb");
        }catch (Exception ex){
            System.out.println("sorry");
            javax.swing.JOptionPane.showMessageDialog(null,ex);}
    return null;
    }
}
