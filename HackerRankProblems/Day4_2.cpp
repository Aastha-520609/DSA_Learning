#include<iostream>
using namespace std;
/*Consider the numeric linear array NUMBER[],using the linear search approach ,how many comparisons are used to locate element
 X in array
Input Format
you have to take two input lines: first line takes the array element second line takes the value of x
Sample Input 1: 10 20 80 30 60 50 110 100 130 170 110
Sample Output 1: 7*/
int main()
{
	int array[10];
	int index = 0;
	for(int i=0; i<10; i++)
	{
		cin>>array[i];
	}
	int ele;
	cin>>ele;
    for(int i=0; i<10; i++)
	{
		if(array[i] == ele)
		{
		  index = i + 1;	
		}
	}
	if(index != 0)
    {
        cout<<index;
    }
    else
    {
        cout<<"ELEMENT NOT FOUND";
    }
}

