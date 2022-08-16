package collectionFramework;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LearnSet {
	public static void main(String args[])
	{
		//No duplicate element is allowed in set;
		//Set<Integer> set = new HashSet<>();// order is not maintained in this hashset
		//Set<Integer> set = new LinkedHashSet<>(); // maintains order as we add in the set
		Set<Integer> set = new TreeSet<>(); // it adds elements in sorted order
		
		set.add(32);
		set.add(56);
		set.add(12);
		set.add(80);
		System.out.println(set);
		set.remove(80);
		System.out.println(set);
		System.out.println(!set.contains(100));
		//is empty checks if the set is empty or not
		System.out.println(set.isEmpty());
		//set.clear();
		//System.out.println(set.isEmpty());
		//size provides the size of set
		System.out.println(set.size());
	}

}
