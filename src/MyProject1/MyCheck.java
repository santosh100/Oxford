/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTOSH
 */
public class MyCheck {
    static PreparedStatement pstmt=null;
    static ResultSet rs=null;
    
    public static void check(String formno){
        try{
            pstmt=MyLogin.con.prepareStatement("select FORM_NO from ADMISSION_TABLE where FORM_NO=?");
            pstmt.setString(1,formno);
            rs=pstmt.executeQuery(); 
            pstmt.clearParameters();
            
            if(rs.next()){
              //  if(formno(rs.getInt("FORM_NO"))){                 
                    JOptionPane.showMessageDialog(null,"Record already exists: Form Number = "+rs.getInt("FORM_NO"),"Record Duplication",JOptionPane.WARNING_MESSAGE);                                    
              //  }                    
            }                                            
        }
        catch(Exception e){
            System.out.println(""+e);
        }
        try{
            pstmt.close();
            rs.close();
        }
        catch(Exception e){   
        }
    }
    
/**
     * @param formno*    
     * @return **************************************************************************************/    
public static int checkAvailability(String formno){
    
    // Note:-  This Method is called in Register page inside okButtonActionPerformed()    
        try{
            pstmt=MyLogin.con.prepareStatement("select FORM_NO from ADMISSION_TABLE where FORM_NO=?");
            pstmt.setString(1,formno);
            rs=pstmt.executeQuery(); 
            pstmt.clearParameters();
            
            if(rs.next()){                                
                    return(1);
            }                                            
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            pstmt.close();
            rs.close();
        }
        catch(Exception e){   
        }
        return(0);
    }  
/**
     * @param formno
     * @return ***************************************************************************************/
public static int checkRegistration(String formno){
    
    // Note:-  This Method is called in Register page inside okButtonActionPerformed()    
        try{
            rs=null;
            pstmt=MyLogin.con.prepareStatement("select S_ID from ADMISSION_TABLE where FORM_NO=?");
            pstmt.setString(1,formno);
            rs=pstmt.executeQuery(); 
            pstmt.clearParameters();
            
            if(rs.next()){
                if((rs.getString("S_ID")).equals("-")){
                    pstmt.close();
                    rs.close();
                    return(1);
                }                           
            }                                            
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            pstmt.close();
            rs.close();
        }
        catch(Exception e){   
        }
        return(0);
    }
}
