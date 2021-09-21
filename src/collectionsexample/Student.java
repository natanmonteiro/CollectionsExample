/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexample;

/**
 *
 * @author Ken
 */
public class Student {
    
    private String firstname;
    private String surname;
    
    private int studentID;
    
    private static int lastIDUsed = 2021000;
    
    public Student(){
        //create a random student
        
        //ID number
        this.studentID = lastIDUsed+1;
        lastIDUsed++;
        
        //firstname and surname
        NameGenerator NG = new NameGenerator();
        String[] wholeName = NG.getRandomName().split(" ");
        
        this.firstname = wholeName[0];
        this.surname = wholeName[1];
        
    }
    
    public Student(String firstname, String surname, int ID){
        
        this.firstname = firstname;
        this.surname = surname;
        this.studentID = ID;
    }
  
  
    @Override
    public String toString(){
        
        return ("\n\nStudent ID: " + this.studentID + "\nFirst name: " + this.firstname + "\nSurname: " + this.surname);
    }
    
    public int getID(){
        
        return this.studentID;
    }
}
