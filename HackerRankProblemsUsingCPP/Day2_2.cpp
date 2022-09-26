#include<iostream>
using namespace std;
/*Let us assume that a child went to a shop to purchase N BROWN chocolates and while packing chocolates shopkeeper 
 might put M white chocolate instead of brown chocolate. Find out the location of white chocolate in the box and return 
 the location. (index of array begins from 0).In case if there is no white chocolate then print -1.Write a program for
 the same and implement all test cases.
 Input Format
 First Line will contain 1 integer value nn, where nn is total number of chocolates Second Line will contain nn characters
 (where B means brown chocolate and W means white chocolate)
 Sample Input 
 10
 BBBBBWBBBB
 Sample Output 0
 5
 1*/
 
int main()
{
	int i,j;
	int N;
	cin>>N;
	char array[N];
	for(i=0; i<N; i++)
	{
		cin>>array[i];
	}
	int count = 0;
	for(j=0; j<N; j++)
	{
		if(array[j] == 'W')
		{
			cout<<j<<" ";
			count++;	
		}
	}
	if(count == 0)
	{
		cout<<-1<<" "<<endl<<0;
	}	
	else
	{
		cout<<endl<<count;
	}
}
