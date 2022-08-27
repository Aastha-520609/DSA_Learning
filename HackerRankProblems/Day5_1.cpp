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
Sample Output 1: 4 1 3 6
Sample Input 2: 6 7 4 5 3 1 4
Sample Output 2: 7 4 3 1 4
Sample Input 3: 4 2 5 3 4
Sample Output 3: 2 5 3 4 */
int main()
{
  int N;
  cin>>N;
  int array[20];
  for(int i=0; i<N; i++)
  {
    cin>>array[i];	
  }
  int count=0;
  for(int j=0; j<N; j++)
  {
  	for(int i=0; i<N; i++)
  {
  	if(array[i] %2 != 0 && array[i+1] %2 != 0 && array[i+2] %2 !=0)
  	 {
  	   for(int k=i; k<N; k++)
		 {
		 	//Shifting elements
		   array[k] = array[k+1];
		 }	
		 count= count + 1;	
	 }
  }	
  }
  for (int j = 0;  j<N-count; j++)
  {
  	cout<<array[j]<<" ";
  }
  
}


