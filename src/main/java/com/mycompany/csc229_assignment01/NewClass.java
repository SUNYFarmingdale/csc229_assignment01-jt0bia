
package com.mycompany.csc229_assignment01;

/**
 *
 * @author JaredTobias
 */
public class NewClass {
    
     public static void main(String[] args) {

         // Instantiating Course class
         Course crs = new Course(101, "Jared", "CSC229");

         // Printing ID, name and code
         System.out.println(crs.getID());
         System.out.println(crs.getName());
         System.out.println(crs.getCode());
    }
    
}
