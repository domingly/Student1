/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student1;

/**
 *
 * @author Lyn
 */
public class PartTimeStudent extends Student1 {
    private int numOfCourses;

    public PartTimeStudent(String studentId, String studentName) {
        super(studentId, studentName);
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
}
