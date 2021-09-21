/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Ken
 */
public class CollectionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //test - make 10 random students and print them out
        
        
        
        //CHALLENGE -- Create an array of 10 students and add the students to the array
        Student[] students = new Student[10];
        
        for(int i= 0; i<students.length; i++){
            
            Student s = new Student(); //create a student with a random name
            students[i] = s;
            
        }
        
        System.out.println("********ARRAY*******");
                
        for(int i= 0; i<students.length; i++){
            
            
            System.out.println(students[i]);
        }
        
        /**** Same loop below using the "shorthand " version
        for (Student s: students){
            
            System.out.println(s);
                    
        }
        * ********************/
        
        // end of array recap
        
        //Array list example
        List<Student> myStudentList = new ArrayList<Student>();
        
                
        for(int i= 0; i<10; i++){
            
            Student s = new Student();
            myStudentList.add(s);
            
        }
        
        System.out.println("******ARRAY LIST**********");
        //general loop to process a whole arraylist
        for( Student s: myStudentList) {
            
            System.out.println(s);
        }
        
        // *********************************
        
        
        //declare a set
        System.out.println("*** SET ***");
        Set<Student> myClassroom = new HashSet<Student>();
        
         myClassroom.addAll(myStudentList);
        
        Student s1 = new Student("Ken", "Healy", 34);
        
        
       myClassroom.add(s1);
        
        
       // s1 = new Student("Gabriel", "Mendonca", 34);
        
       myClassroom.add(s1);
        
       s1 = new Student ("Alida", "Ciqueira", 809);
        
       myClassroom.add(s1);
        System.out.println(myClassroom);
        
        // *******************************************************
        
        // Map example
        
        //declare map
        Map<Integer, Student> allStudents = new HashMap<Integer, Student>();
        
        // note - Integer will be the "key" and Student is the "value"
        // so Integer needs to be unique
        // most sensible candidate is to use student ID number (should be unique in real life)
        
        //random students as an example
        System.out.println("*****MAP ***********");
        for (int i=0; i<10; i++){
            
            Student s = new Student();
            int id =  s.getID();
            
            allStudents.put(id, s);
        }
        
        for (Integer key: allStudents.keySet()){
            
            System.out.println(allStudents.get(key));
        }
        
        System.out.println("The student with ID num 2021015 is..." + allStudents.get(2021015));
        
        System.out.println("The student with ID num 2021022 is..." + allStudents.get(2021022));
        
        //// LINKED LIST EXAMPLE 
        
        System.out.println("\n\n\n******** LINKED LIST ***********");
                
       
        List<Student> backupList = new LinkedList<Student>();
        
        for( Student s: myStudentList) {
            
           backupList.add(s);
           
        }
        
        for( Student s: backupList) {
            
            System.out.println(s);
        }
        

}
    
}
