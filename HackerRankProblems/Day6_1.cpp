#include<iostream>
using namespace std;
/*Alice added 5 items to his shopping cart and is now prepared to checkout at the mall. Write a program code to assist him in 
finding the total money he needs to pay considering that every element costing more than 100 is being sold at 20% discount.
Input Format
Input format: 100,100,200,10,10.50
Output Format
Output format: 380.50*/
int main()
{
	float N = 5;
	float array[5];
	for(int i=0; i<N; i++)
	{
		cin>>array[i];
	}
	int temp;
	float sum = 0;
	for(int i=0; i<N; i++)
	{
		if(array[i] > 100)
		{
			int element = array[i];
			temp = (20* element)/100;
			array[i] = (element - temp);
		}
		sum = sum + array[i];
	}
	if(sum-((int)sum)>0)
	{
	 printf("%.2f",sum);	
	}
	else
	{
		cout<<sum;
	}
}
