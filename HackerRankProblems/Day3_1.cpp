#include<iostream>
using namespace std;
/*Let There are 20 students in the Class. Accept the Marks of N Students and insert the next student mark after the highest 
mark in the list.
For Example
if 5 Students Mark are 50 70 55 85 35 62 , then the highest mark is 85 ,So the next student mark(let 40) will be
inserted after 85. final array will be 50 70 55 85 40 35 62*/
int main()
{
	int i;
	int N;
	cin>>N;
	int marks[N];
	for(i=0; i<N; i++)
	{
		cin>>marks[i];
	}
	int ele;
	cin>>ele;
	int index = 0;
	int pos = marks[0];
	for(i=1; i<N; i++)
	{
		if(marks[i] > pos)
		{
			index = i;
		}
	}
	for(i=N-1; i>=index; i--)
	{
		marks[i+1] = marks[i];
	}
	marks[index + 1] = ele;
	for(i=0; i<N+1; i++)
	{
		cout<<marks[i]<<" ";
	}
}
