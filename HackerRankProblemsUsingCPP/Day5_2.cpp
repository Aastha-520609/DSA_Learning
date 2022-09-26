#include<iostream>
using namespace std;
/*A data structure competition has been conducted and the marks of all students are stored in random order in an array. 
Suppose the scored marks by the students in non-increasing order is K1, K2,….KN. Write to program to find the third highest 
scored marks by the student. The size of array should be greater than 0 and less than equal to 20. If size is not in the mention
range than program should display “Invalid array size” without asking for the other inputs.
Input Format
Your program should take the three types of inputs. First will represent size of array, second will represent elements of array 
and third will be the 3rd largest element.
Sample Input 0: 5 4 8 3 2 1
Sample Output 0: 3*/
int main()
{
    int i,j;
	int N;
	cin>>N;
	int array[N];
	for(i=0; i<N; i++)
	{
		cin>>array[i];
	}
    if(!(N>0 && N<=20))
    {
    	cout<<"Invalid Array Size";
	}
	else if(N<3)
	{
		cout<<"Not Sufficient Element";
	}
	else
	{
	int temp;	
	for(i=0; i<N; i++)
	{
	  for(j=i+1; j<N; j++)
	  {
	    if(array[j] > array[i])
		{
		  temp = array[j];
		  array[j] = array[i];
		  array[i] = temp; 	
		}	
	  }	
	}
	cout<<array[2];
	}	
}
