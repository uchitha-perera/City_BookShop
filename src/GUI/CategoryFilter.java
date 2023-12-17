/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


 public class CategoryFilter implements Filter {
    
   @Override
    public String getSQLQuery(String searchText) {
        return "SELECT book_number, book_name, author, " +
                "category, price, quantity " +
                "FROM tblbooks WHERE category LIKE '%" + searchText + "%';";
    }
}
