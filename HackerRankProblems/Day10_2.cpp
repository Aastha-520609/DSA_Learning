#include<iostream>
using namespace std;
/*You are given two integers representing the size of two different sized arrays. Take the elements of the arrays from the user 
in the non-decreasing order. If the elements are not in sorted order in any array, display the message “Incorrect Array Elements”.
 Merge the elements of the given arrays in sorted order and display them. The size of the array should be greater than 0 and less
than equal to 20. If array will not be in the given range then display the message “Invalid Array”.
Constraints
Size of the arrays should be 0 < n1 <= 20 and 0 < n2 <= 20. If the size will not be in the range, then it should not take the 
further inputs and display the message “Invalid Array”.
If the elements of the array will not be in the required order, it should not take the further inputs and display the message 
“Incorrect Array Elements”.
If the size of two arrays will be same, then do not take further inputs and display the message “Invalid Array”
Sample Input 0
4
10
20
30
40
5
1
5
7
11
15*/
void Sorting(int arr[], int n)
{
	int temp;
	for(int i=0; i<n-1; i++)
	{
	  for(int j=0; j<n-i-1; j++)
	  {
	    if(arr[j] > arr[j+1])
		{
		   temp = arr[j];
		   arr[j] = arr[j+1];
		   arr[j+1] = temp;	
		}	
	  }		
	}	
}
void mergeArray(int arr1[], int arr2[], int n1, int n2)
{
	int n3 = n1 + n2;
	int arr3[n3];
	for(int i=0; i<n1; i++)
	{
		arr3[i] = arr1[i];
	}
	for(int i=0,j=n1; j<n3 && i<n2; i++, j++)
	{
		arr3[j] = arr2[i];
	}
	Sorting(arr3,n3);
	for(int i=0; i<n3; i++)
	{
		cout<<arr3[i]<<endl;
	}
}
int main()
{
  int n1,n2;
  cin>>n1;
  int i;
  int arr1[n1];
  if(n1>0 && n1 <=20)
  {
  	for(i=0; i<n1; i++)
      {
  	    cin>>arr1[i];
	    if(i!=0)
	    {
	     if(arr1[i] < arr1[i-1])
	     {
	   	   cout<<"Incorrect Array Elements";
	   	   return 0;
	     }	
	    }
	  }
	  cin>>n2;
	  if(n1!=n2)
	  {
	  	int arr2[n2];
	  	if(n2>0 && n2<=20)
	  	{
	  	  for(i=0; i<n2; i++)
			{
			   cin>>arr2[i];	
			   if(i!=0)
			    {
			      if(arr2[i] < arr2[i-1])
			       {
			         cout<<"Incorrect Array Elements";
				     return 0;	
			       } 	
			    }
		    }
	    }
	    else
	    {
	    	cout<<"Invalid Array";
	    	return 0;
		}
		mergeArray(arr1,arr2,n1,n2);
	  }	
	  else
	  {
	  	cout<<"Invalid Array";
	  	return 0;
	  }
  }
  else
	{
	  cout<<"Invalid Array";
	  return 0;	
	}
	return 0;
}
