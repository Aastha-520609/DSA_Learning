package gfgPrograms;
import java.util.*;
public class queuePushPop {
	public static Queue<Integer> push(int arr[], int n)
    {
        //push all the elements of the array arr in the queue and return the queue
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            q.add(arr[i]);
        }
        return q;
    }
    
    public static void _pop(Queue<Integer> q)
    {
        //dequeue the elements and print them
    	//Queue<Integer> q = new LinkedList<>();
        while(!q.isEmpty())
        {
            int ele = q.peek();
            System.out.print(ele+" ");
            q.remove();
        }
    }
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
		int arr[] = {1,2,3,4,5};
		int n = 5;
		push(arr,n);
		_pop(q);
	}
}
