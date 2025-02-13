#include <stdio.h>

int main(void) {

//whenever you see pattern you are able to figure out particualr logic and later you are able to code that logic

int n;
scanf("%d",&n);

int i=1;

while(i<=n)
{
	int space=1;
	while(space<=n-i)
	{
		printf(" ");
		space++;
	}
	
	int k=1;
	while(k<=i)
	{
		printf("*");
		
		
		if(k==i)
		{
			k++;
			continue;
		}
	       printf(" ");	
		k++;
	}
	printf("\n");
	
	
	i++;
	
	
}













	return 0;
}
