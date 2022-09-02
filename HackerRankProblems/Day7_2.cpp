#include<iostream>
using namespace std;
/*Akash got a new coin game. In the coin game, Akash will only win the game if the total count is 56. Each coin will have value 
inscribed. Write a programming solution, to help Akash in counting total value of coins at the end of the game. Coin Game is 
played N times.
Constraints:N>0 & N<=5,K=7
Sample Input 0
2
10 12 5 7 8 9 5
5 7 6 9 6 3 4
Sample Output 0
1
0*/
int main()
{
	int N;
	cin>>N;

	while(N--)
	{
	   int k = 7;
	   int array[k];
	   int sum = 0;
	   for(int j=0; j<k; j++)
	    {
		    int x;
			cin>>x;
			array[j] = x;
	    }
		for(int j=0; j<k; j++)
		{
			sum += array[j];
		}
		if(sum == 56)
	      {
		   cout<<1<<endl;
	     }  
	    else
	     {
		   cout<<0<<endl;
	     }
	}
}
