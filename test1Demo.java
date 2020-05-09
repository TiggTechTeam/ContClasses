import java.util.ArrayList;
import java.util.HashMap;

public class test1Demo {

	public static void main(String[] args) {
		
		 Example ex = new Example();
		
		 ex.addName("TigerWoods");
		 ex.addTime("Tigerwoods", 1.2);
		// double d= ex.getAverage("Tigerwoods");
		
		 System.out.println(ex.toString());
		 //System.out.println(d);

	     HashMap<String, ArrayList<Double>> hm = ex.getHashmap();
	     
	     hm.put("Max", new ArrayList());
	     hm.get("Max").add(10.9);
	     hm.get("Max").add(2.4);
	     hm.get("Max").add(3.3);
	     hm.get("Max").add(2.2);
	     hm.get("Max").add(1.2);
	     
	     System.out.println( hm.toString() );
	     
	     HashMap<String, ArrayList<Double>> hm1 = ex.getHashmap();
	     hm1.put("Felix", new ArrayList());
	     hm1.get("Felix").add(10.3);
	     hm1.get("Felix").add(2.4);
	     hm1.get("Felix").add(3.3);
	     hm1.get("Felix").add(2.4);
	     hm1.get("Felix").add(1.4);
	     System.out.println("Name: " + hm1.toString() + "\n");

	}

}
