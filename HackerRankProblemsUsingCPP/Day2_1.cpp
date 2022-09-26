#include<iostream>
using namespace std;
/*Consider Aman is visiting Nehru Zoo. She has seen there are N elephants standing in a row.
She wants to remove the elephants having the same height standing in consecutive.Write a program for Aman so that she can get
the desired sequence of elephants.
Input Format
The first line will be containing one Integer representing a number of elephants N.
The second line will contain N integers representing the heights of the elephants.
Sample Input 0
12
4 7 9 9 8 5 7 7 6 5 5 5
Sample Output 0
4 7 9 8 5 7 6 5 */
int main() {
    int n;
    cin>>n;
    int arr[n];
    
        for(int i=0;i<n;i++){
        arr[i]=-1;
        cin>>arr[i];
    }
    if(arr[n-1]==-1){
        cout<<"Invalid Input";
        return 0;
    }
    
    
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
            for(int j=i;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            n--;
            i--;
        }
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
/*int main()
{
	int N;
	cin>>N;
	int i,j;
	int array[N];
		for(i=0; i<N; i++)
	    {
		   cin>>array[i];
	    }
	    for(i=0; i<N; i++)
	    {
			  if(array[i] == array[i+1])
			   {
			   	for(j=i; j<N; j++)
			   	 {
			   	  array[j] = array[j+1];	
				 } 
				 N--;
			     i--;
			   } 
	    }
	    for(i=0; i<N; i++)
	    {
	    	cout<<array[i]<<" ";
		}
	}
}*/
