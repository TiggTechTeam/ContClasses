import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.*;


public class Example {
	//https://stackoverflow.com/questions/8722822/how-to-call-a-hashmap-its-values-from-other-class-in-java
	 private HashMap<String, ArrayList <Double>> hashmap = new HashMap<String, ArrayList <Double>>();
	 private String name;
	 private ArrayList<Double> workingHours;
	 
	    public HashMap<String, ArrayList<Double>> getHashmap() {
	        return hashmap;
	    }

	   
	  //adds only a name without any working time
	    public void addName (String name) {
	    	hashmap.put(name, null);
	    }
	    
	  //adds a working time for the given name; 
	  //adds also the name when it is not existent
	  public void addTime (String name, double time) {
		  hashmap.put(name, workingHours);
	  }
	//returns a list of all working times of the given name 
	  public List<Double> getTimeList (String name){//<----- here we have Problem with the List and Arraylist connection
		    	return workingHours;
		    
 
	  }

	  //returns the average of all working times for the given name;
	  //returns 0 if no working time is available for the given name;
	  //returns null if name does not exist
	  public Double getAverage (String name) {
		  double avarageScore = 0.0;
			int counter = 0;
			for(int i = 0; i < workingHours.size();i++) {
				avarageScore += workingHours.get(i);
				counter ++;
			}
			return (avarageScore/counter);
	  }
	//returns the sum of all working times for the given name;
	//returns 0 if no working time is available for the given name;
	//returns null if name does not exist
	public Double getTimeSum (String name) {
		double sum = 0.0;

		if(name == null && workingHours == null) {
			return null;
		}else {
			for(int i = 0; i < workingHours.size();i++) {
				sum += workingHours.get(i);
			}
		}
		return sum;
		
	}

	//returns the overall sum of all working times of all names
	public Double getTotalTime () {
		double sum = 0.0;
		for(int i = 0; i < workingHours.size(); i++ ) {
			sum += workingHours.get(i);

		}
		return sum;
		//returns the number of all registered names
		
	}
	 
	//returns the number of all registered names
	public int size () {
		return hashmap.size();
	}

	//returns a compact String-representation of all names with their
	// working times
	public String toString () {
		   Set<String> keys = hashmap.keySet(); //all keys of the map in a set
		    for (String k: keys)                  //iterating over all keys
		      System.out.println("This thing is in the Loop: "+k + " - " + hashmap.get(k));
		// return hashmap.toString()
			
		    
		    return "XNames: " +name + " XHours: " +workingHours;
			
		
	}
	  

}
