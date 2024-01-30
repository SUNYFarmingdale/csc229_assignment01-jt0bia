/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.csc229_assignment01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author JaredTobias
 */
public class CourseTest {
    
    Course crs;
    public CourseTest() {
        crs = new Course();
    }

    //Testing Getters and Setters
    @Test
    public void testSomeMethod1() {
        crs.setName("Jared");
        assertEquals("Jared", crs.getName());
    }
    
    @Test
    public void testSomeMethod2() {
        crs.setCode("CSC229");
        assertEquals("CSC229", crs.getCode());
    }
    
    @Test
    public void testSomeMethod3() {
        crs.setID(101);
        assertEquals(101, crs.getID());
    }
    
    @Test
    public void testSomeMethod4() {
        Course cr2 = new Course(101, "Jared", "CSC229");
        assertNotNull(cr2);
    }

}
