#include<iostream>
using namespace std;
/*Write a program to remove element from the specific or provided location and after removing , print all the remaining other 
 elements.
Input Format
In first line, it will take the total number of elements in array In second line, pollute the values in array In third Line,
it will ask for the index number , from where you want to delete the element
Input: 5
1 2 3 4 5
0
output: 2345*/
int main()
{
	int N ,i;
	cin>>N;
	int array[N];
	for(int i=0; i<N; i++)
	{
		cin>>array[i];
	}
	int index;
	cin>>index;
	for(i=0; i<N; i++)
	{
		if(array[i] == index)
		{
			break;
		}
	}
	for(i=index; i<N-1; i++)
	{
	  array[i] = array[i+1];
	}
	N = N - 1;
	for(int i=0; i<N; i++)
	{
		cout<<array[i]<<" ";
	}	
}
