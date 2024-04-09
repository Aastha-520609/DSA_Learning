package revision;
public class recursionPractice {
	public static int[] displayArr(int[] arr, int val, int idx, int fsf)
	{
		if(idx == arr.length)
		{
			return new int[fsf];
		}
		
		if(arr[idx] == val)
		{
			int[] faith = displayArr(arr, val, idx+1, fsf+1);
			faith[fsf] = idx;
			return faith;
		}
		else
		{
			int[] faith = displayArr(arr, val, idx+1, fsf);
			return faith;
		}
	}
	public static void main(String[] args)
	{
	  int[] arr = {1,2,5,4,3,5,8,9,5};
	  int val = 5;
	  int[] iarr = displayArr(arr, val, 0, 0); 
	  
	  if(iarr.length == 0)
	  {
		  System.out.println();
		  return;
	  }
	  
	  for(int i=0; i<iarr.length; i++)
	  {
		  System.out.println(iarr[i]);
	  }
	}

}
