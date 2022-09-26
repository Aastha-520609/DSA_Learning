#include<iostream>
using namespace std;
/*In a conference hall some persons are sitting on the chairs on the front row from left to right. Suddenly a person wants to 
sit near his friend. He requested other persons who are sitting on that position and the right side of that position to shift 
on right side so that he can sit at specified position.Persons are represented by alphabets like A, B, C, D, etc
If in the beginning A, B, C, and D are sitting on 1st , 2nd ,3rd and 4th chair and a new person E wants to sit at 2nd chair, then 
the new array should be A, E, B, C, D will be your output.In this program you have to take input n for number of elements at 
beginning, then read all person names as Alphabets, read the chair number for insertion, and read the alphabet representing new 
person. If invalid position is there then print message of “Invalid Position” .*/
int main()
{
  int N;
  cin>>N;
  char array[N];
  for(int i=0; i<N; i++)
  {
    cin>>array[i];
  }
  int pos;
  cin>>pos;
  char elem;
  cin>>elem;
  if(pos>0)
  {
  	 for(int i=N; i>=pos; i--)
      {
  	    array[i] = array[i-1];
      }
      array[pos - 1] = elem;
     for(int i=0; i<N+1; i++)
     {
        cout<<array[i]<<"\t";
     }	
  }
  else
  {
  	cout<<"Invalid Position";
  }

}
