package revision;
import java.util.*;
import java.io.*;
public class test {
	public static void main(String args[]) {
		String[][] routes = {
				{"Delhi", "Jalandhar"},
				{"Jalandhar", "Chandigarh"},
				{"Chandigarh", "Phagwara"}
			};
		
		HashSet<String> sources = new HashSet<>();
		HashSet<String> destinations = new HashSet<>();
		
		for(String[] route: routes) {
			sources.add(route[0]);
			destinations.add(route[1]);
		}
		
		for(String des: destinations) {
			if(!sources.contains(des)) {
				System.out.println(des);
				break;
			}
		}
	}
}
