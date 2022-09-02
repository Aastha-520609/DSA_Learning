#include<iostream>
using namespace std;
//Binary Search: provide input as sorted array
int binarySearch(int array[], int key, int low, int high)
{ 
	while(low<=high)
	{
		int mid = (low + high)/2;
		if(array[mid] == key)
		{
			return mid;
		}
		else if(array[mid] > key)
		{
			high = mid - 1;
		}
		else
		{
		   low = mid + 1;	
		}
	}
	return -1;	
}
int main()
{
	int N;
	cin>>N;
	int array[N];
	for(int i=0; i<N; i++)
	{
		cin>>array[i];
	}
	int key;
	cin>>key;
	int low = 0;
	int high = N - 1;
	int index = binarySearch(array,key,low,high);
	cout<<index;			
}
