/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClases;

import javax.swing.JOptionPane;
import java.sql.*;

public class Manager extends User {

    
    
    Connection conn;
    PreparedStatement ps;

    public Manager() {
         try{
            String url = "jdbc:mysql://localhost/citybook";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            
        }catch (Exception ex){
          JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }
    }
    
    
    
    public void addBook(int Books,String BookName,String Author,String Category, String Price, String Quantity){
        
        if (Books == 0 || BookName.isEmpty() || Author.isEmpty() || Category.isEmpty() || Price.isEmpty() || Quantity.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter all the required information");
        return;
    }
        
        String sql ="INSERT INTO tblbooks VALUE(?,?,?,?,?,?)";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1,Books);
            ps.setString(2, BookName);
            ps.setString(3, Author);
            ps.setString(4, Category);
            ps.setString(5, Price);
            ps.setString(6, Quantity);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Book Record Inserted Successfully");
            }else {
            JOptionPane.showMessageDialog(null, "No records were inserted");
        }
            
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());  
        }
    }
    public void updateBook(String BookName,String Author,String Category,String Price, String Quantity, int Books) {
        
        if (Books == 0 || BookName.isEmpty() || Author.isEmpty() || Category.isEmpty() || Price.isEmpty() || Quantity.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please Find a Book To Update");
        return;
    }
        
       try{
          
            
            String sql = "UPDATE tblbooks SET book_name=?, author=?, category=?, price=?, quantity=? WHERE book_number=?";
            
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, BookName);
            ps.setString(2, Author);
            ps.setString(3, Category);
            ps.setString(4, Price);
            ps.setString(5, Quantity);
            ps.setInt(6, Books);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Book Record Updated!");
            }else {
            JOptionPane.showMessageDialog(null, "No records were Updated");
        }
            
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());  
        }finally{

        }
    } 
    
    public void DeleteBook(int Books,String BookName,String Author,String Category, String Price, String Quantity){
        
        
        if (Books == 0 || BookName.isEmpty() || Author.isEmpty() || Category.isEmpty() || Price.isEmpty() || Quantity.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please Find a Book To Delete");
        return;
        }
        try{
           
            
            String sql = "DELETE FROM tblbooks WHERE book_number=?";
            
            ps = conn.prepareStatement(sql);
            
            
            ps.setInt(1, Books);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Books Record Deleted!");
            }
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());  
        }finally{
            
        }
    }
    
}


