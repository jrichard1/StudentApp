/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemonstration;

import java.util.Scanner;

/**
 *
 * @author jason
 */
public class StudentDemonstration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input your first name");
        String firstName = input.next();
        
        System.out.println("Please input your last name");
        String lastName = input.next();
        
        System.out.println("Please input your GPA");
        double gpa = input.nextDouble();
        
        System.out.println("Please input your total credits");
        int totalCredits = input.nextInt();
        
        Student student = new Student(firstName, lastName, gpa, totalCredits);
        
        System.out.println(student.toString());
    }
    
}
