/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student1;

/**
 *
 * @author Lyn
 */
public class StudentList {
    public static void main(String[] args){
        //Student1 s1=new Student("s1","Lyn");
        Student1[] studentList=new Student1[3];
        studentList[0]=new Student1("s1","Lyn");
        studentList[1]=new Student1("s2","Del");
        studentList[2]=new Student1("s3","Orly");
        
        for(int i=0; i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }
}
