#include<iostream>
using namespace std;
/*To insert the element to specific location. The specific location will be calculate based on given following condition 1. 
if the newly inserted element is less than the size of array then the location/ index of element is size_of_array mod(%) 
element 2. else the location/ index of element is element mod(%) size_of_array 3. After inserting the new element number of
element should be increase by one.
Input Format
Sapnple Input 1: Line 1: Enter the size of Array : 10
Line 2: How many element do you want in insert in to array :5
Line 3: 11 22 33 44 55
Line 4(Display): 11 22 33 44 55 0 0 0 0 0
Line 5: Enter the number you want to insert : 78
Line 6: The Element 78 inserted at the location : 8
Line 7: 11 22 33 44 55 0 0 78 0 0*/
int main()
{
	int i;
	int size;
	cin>>size;
	int elements;
	cin>>elements;
	int array[size];
	for(i=0; i<size; i++)
	{
		array[i] = 0;
	}
	for(i=0; i<elements; i++)
	{
		cin>>array[i];
	}
	int ele;
	cin>>ele;
	int pos = 0;
	if(elements < size)
	{
		if( pos = ele % 2)
		{
			array[pos] = ele;
		}	
	}
	for(i=0; i<size; i++)
	{
		cout<<array[i]<<" ";
	}
	
}
