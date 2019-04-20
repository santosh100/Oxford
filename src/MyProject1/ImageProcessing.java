/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTOSH
 */
public class ImageProcessing {
    private static final int IMG_WIDTH=413;
    private static final int IMG_HEIGHT=531;
    
    public static Image myResize(Image img, int width, int height)
    {
	BufferedImage resizedImage=null;
        resizedImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
	Graphics2D g=null;
        g=resizedImage.createGraphics();
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.drawImage(img,0,0,width,height,null);
	g.dispose();
	return resizedImage;
    }
  /**
     * @param originalImage* 
     * @param type* 
     * @return ************************************************************************/ 
    public static BufferedImage myresizeImage(BufferedImage originalImage,int type){
            BufferedImage resizedImage = new BufferedImage(IMG_WIDTH,IMG_HEIGHT,type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage,0,0,IMG_WIDTH,IMG_HEIGHT,null);
            g.dispose();  
         
            return resizedImage;
    }
/**
     * @param sname*    
     * @param formno*    
     * @param sid*************************************************************************/    
    public  static void  saveImage(String sname,String formno,String sid)
    {
    try{                     
            BufferedImage originalImage=ImageIO.read(Admission.file);    // to read image do this
            int type= originalImage.getType()== 0?
            BufferedImage.TYPE_INT_ARGB : originalImage.getType();                             
            
            BufferedImage resizeImageJpg = ImageProcessing.myresizeImage(originalImage,type);   // will call res
   //         ImageIO.write(resizeImageJpg,"jpg",new File("c:\\New Folder\\"+sname+""+formno+".jpg")); // to write an image do this
           if((formno.equalsIgnoreCase("0"))==false)
               ImageIO.write(resizeImageJpg,"jpg",new File(".\\test\\Record\\Student_Images\\Admission\\"+sname+""+formno+".jpg")); // to write an image do this
           else
               ImageIO.write(resizeImageJpg,"jpg",new File(".\\test\\Record\\Student_Images\\Registered\\"+sname+""+sid+".jpg")); // for update image
     
      //      System.out.println("Photo uploaded successfully");
            JOptionPane.showMessageDialog(null,"Photo uploaded successfully");
        }catch(IOException e){
            System.out.println(e.getMessage());
       //     System.out.println("there is problem in uploading photo");
            JOptionPane.showMessageDialog(null,"there is problem in uploading photo");
        }
        catch(Exception em){
            System.out.println(em.getMessage());
            System.out.println("there is problem in uploading photo");
        }    
    }
/**
     * @param formno*
     * @param name*
     * @param sid************************************************************************************/
    public static void myRenameAndMove(String formno,String name,String sid)
    {
      File oldName = new File(".\\test\\Record\\Student_Images\\Admission\\"+name+""+formno+".jpg");
      File newName = new File(".\\test\\Record\\Student_Images\\Registered\\"+name+""+sid+".jpg");  //It moves image, not copy
         
      if(oldName.renameTo(newName)) {
         System.out.println("image renamed successfully");
      } else {
         System.out.println("Error: renameng problem(path mismatch)");
      }
    }
    /**
     * @param pre
     * @param ans
     * @param lstname
     * @param sid*************************************************************************************/
    public static void myRenameAndMove2(String pre,String ans,String lstname,String sid)
    {
      File oldName = new File(".\\test\\Record\\Student_Images\\Registered\\"+pre+" "+lstname+""+sid+".jpg");
      File newName = new File(".\\test\\Record\\Student_Images\\Registered\\"+ans+" "+lstname+""+sid+".jpg");  //It moves image, not copy
         
      if(oldName.renameTo(newName)) {
         System.out.println("image renamed successfully");
      } else {
         System.out.println("Error: renameng problem(path mismatch)");
      }
    }
    /**
     * @param pre*
     * @param ans*
     * @param fstname*
     * @param sid*************************************************************************************/
    public static void myRenameAndMove3(String pre,String ans,String fstname,String sid)
    {
      File oldName = new File(".\\test\\Record\\Student_Images\\Registered\\"+fstname+" "+pre+""+sid+".jpg");
      File newName = new File(".\\test\\Record\\Student_Images\\Registered\\"+fstname+" "+ans+""+sid+".jpg");  //It moves image, not copy
         
      if(oldName.renameTo(newName)) {
         System.out.println("image renamed successfully");
      } else {
         System.out.println("Error: renameng problem(path mismatch)");
      }
    }
    
/**
     * @param name*    
     * @param oldsid*    
     * @param newsid*****************************************************************************/    
    public static void myRenameAndMove4(String name,String oldsid,String newsid)
    {
      File oldName = new File(".\\test\\Record\\Student_Images\\Registered\\"+name+""+oldsid+".jpg");
      File newName = new File(".\\test\\Record\\Student_Images\\Registered\\"+name+""+newsid+".jpg");  //It moves image, not copy
         
      if(oldName.renameTo(newName)) {
         System.out.println("image renamed successfully");
      } else {
         System.out.println("Error: renameng problem(path mismatch)");
      }
    }        
 /**
     * @param tid*******************************************************************************/
    public  static void  saveTeacherImage(String tid)
    {
    try{                     
            BufferedImage originalImage=ImageIO.read(StaffDetail.file);    // to read image do this
            int type= originalImage.getType()== 0?
            BufferedImage.TYPE_INT_ARGB : originalImage.getType();                             
            
            BufferedImage resizeImageJpg = ImageProcessing.myresizeImage(originalImage,type);   // will call res
   //         ImageIO.write(resizeImageJpg,"jpg",new File("c:\\New Folder\\"+sname+""+formno+".jpg")); // to write an image do this           
               ImageIO.write(resizeImageJpg,"jpg",new File(".\\test\\Record\\Teacher_Images\\"+tid+".jpg")); // to write an image do this          
      //         ImageIO.write(resizeImageJpg,"jpg",new File(".\\test\\Record\\Student_Images\\Registered\\"+sname+""+sid+".jpg")); // for update image           
            JOptionPane.showMessageDialog(null,"Photo uploaded successfully");
        }catch(IOException e){
            System.out.println(e.getMessage());
       //     System.out.println("there is problem in uploading photo");
            JOptionPane.showMessageDialog(null,"there is problem in uploading photo");
        }
        catch(Exception em){
            System.out.println(em.getMessage());
            System.out.println("there is problem in uploading photo");
        }    
    }
}
