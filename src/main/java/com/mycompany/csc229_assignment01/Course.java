/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).
   https://github.com/SUNYFarmingdale/csc229_assignment01-jt0bia

 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author JaredTobias
 */
public class Course {
    private int ID;
    private String name;
    private String code;

    // Constructors
    public Course() {
        ID = 0;
        name = " ";
        code = " ";
    }

    public Course(int ID, String name, String code) {
        this.ID = ID;
        this.name = name;
        this.code = code;
    }

    // Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
