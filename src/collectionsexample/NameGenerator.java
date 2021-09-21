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
import java.util.Random;

public class NameGenerator {

	protected String[] firstNames = {"ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia", "Willyan"};
	
	protected String[] surnames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst", "Calderon"};
	
	public NameGenerator() {
		
		//nothing here - deliberate
		
	}
	
	public String getRandomName() {
		//return a random name
		
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = this.firstNames[r.nextInt(firstNames.length)];
		String sname = this.surnames[r.nextInt(surnames.length)];
		
		return ( fname + " " + sname);
		
	}
}
