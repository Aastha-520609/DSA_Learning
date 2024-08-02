package revision;
import java.util.*;
public class IntersectionOfArray {
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for(int val : nums1){
            set1.add(val);
        }

        for(int val : nums2){
            if(set1.contains(val)){
                intersect.add(val);
            }
        }

        int[] ans = new int[intersect.size()];
        int idx = 0;
        for(int val: intersect){
            ans[idx] = val;
            idx++;
        }
        return ans;
    }
	public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums1){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> intersect = new ArrayList<>();
        for(int num : nums2){
            if(hmap.containsKey(num) && hmap.get(num) > 0){
                intersect.add(num);
                hmap.put(num, hmap.get(num) - 1);
            }
        }

        int[] arr = new int[intersect.size()];
        for(int i=0; i<intersect.size(); i++){
            arr[i] = intersect.get(i);
        }
        
        return arr;
    }
	public static void main(String args[]) {
		int[]  nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] ans = intersection(nums1, nums2);
		for(int num : ans) {
			System.out.print(num + " ");
		}
		System.out.println("NEXT");
		int[] ans1 = intersect(nums1, nums2);
		for(int num : ans1) {
			System.out.print(num + " ");
		}
	}
}
