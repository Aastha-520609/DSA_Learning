#include<iostream>
using namespace std;
/*Lewis is working on a game designing project called as Ball Blast and he is facing issue in implementing the logic 
for the same. There are N number of balls having a number written on each ball. All the balls are arranged in a row and 
as per the rules of the game, if there are 3 balls in a row having ODD number on them then the first ball of the set will 
be removed. The same process is to be repeated for all the balls from left to right. At the end of the game, the numbers on 
the remaining balls is to be printed.
First line will be the number of Balls N. Second Line will be the numbers written on Balls.
Sample Input 1: 5 4 3 1 3 6
Output should be the numbers on the Remaining Balls after the Blast
Sample Output 1: 4 1 3 6*/
/*int main()
{
  int N;
  cin>>N;
  int array[N];
  for(int i=0; i<N; i++)
  {
    cin>>array[i];	
  }
  int count=0;
  for(int i=0; i<N; i++)
  {
  	for(int j=0; j<N; j++)
  	{
  			if(array[i] %2 != 0 && array[i+1] %2 != 0 && array[i+2] %2 !=0)
  	{
  	  for(int k=i; k<N; k++)
		{
		 count= count + 1;	
		}	
	}
  		
    }
  }
  for (int i = 0; i < N-count; i++)
  {
  	cout<<array[i]<<" ";
  }
  
}*/
int main()
{
int a[20], n, count = 0;
cin >> n;
for (int i = 0; i < n; i++)
{
cin >> a[i];
}

for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{

if (a[j] % 2 != 0 && a[j + 1] % 2 != 0 && a[j + 2] % 2 != 0)
{
for (int k = j; k < n; k++)
{
a[k] = a[k + 1];
}
count += 1;
}
}
}

for (int i = 0; i < n - count; i++)
{
cout << a[i] << " ";
}

return 0;
}
