#include <iostream>
using namespace std;
/*Today is such a beautiful evening after heavy rainfall and kids decided to play in playground, then at the same moment they are 
deligthed to see the colors of Rainbow in the sky. They observe seven colors like Violet, Indigo,Blue,Green,Yellow,Orange,Red i.e 
'V','I','B','G','Y','O','R'.Now your task is to remove a color which is mentioned above as input and display the remaining colors 
of Rainbow,if the color which you want to delete that is not comes under VIBGYOR then display message as "Color not available".
Sample Input 0:V
Sample Output 0: IBGYOR*/
int main() 
{
    int N=7;
    char arr[7]={'V','I','B','G','Y','O','R'};
    char a;
    cin>>a;
    int found=0;
    for(int i=0; i<N; i++)
    {
      if(arr[i] == a)
        {
          found=1;
          for(int j=i; j<N; j++)
           {
       	    arr[j] = arr[j+1];
           }
          N--;
       }
    }
    if(found==1)
	{
        for(int i=0;i<N;i++)
		{
            cout<<arr[i];
        }
    }
    else
    {
     cout<<"Color not available";	
	}
}
