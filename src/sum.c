/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
#include <stdio.h>
#include<limits.h>


int main(void) {



//frequency of an array element


int n;
scanf("%d",&n);

int arr[1000];


for(int i=0;i<n;i++)
{
	scanf("%d",&arr[i]);
}



int sum;

scanf("%d",&sum);

int count=0;

for(int i=0;i<n-1;i++)
{ 
	
for(int j=i+1;j<n;j++)
{
	if(arr[i]+arr[j]==sum)
	{
		count++;
	}
}

}


printf("%d",count);


return 0;
}
