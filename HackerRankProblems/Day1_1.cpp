#include<iostream>
#include<bits/stdc++.h>
#include <cctype>
using namespace std;
/*nsert lower case characters just after only upper case characters of the same alphanumeric symbol. The size of array(N) 
should be greater than 0 and less than equal to 20. If the size of array is not in the mention range then program should 
display “Invalid size of array”. And if no upper case character is present then display same array.
Input Format
First line will represent size of array and second line will represent elements of array.
20
H e L L O 2
Sample Output 0
H h e L l L l O o */
int main()
{
	int N;
	cin>>N;
	char array[6];
	if(N<=20)
	{
	  	for(int i=0; i<N; i++)
	    {
		    cin>>array[i];
	    }
	    for(int i=0; i<N; i++)
	    {
		 cout<<array[i];
		 if(array[i]>='A' && array[i]<='Z')
		 {
		 	array[i] = array[i] + 32;
		 	cout<<array[i];
		 }
	    }	
	}
	else
	{
		cout<<"Invalid Input";
	}
	return 0;
}
