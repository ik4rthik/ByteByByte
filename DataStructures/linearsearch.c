//LINEAR SEARCH
//KARTHIK S
//ROLL NO:35
#include<stdio.h>
void main()
{
	int a[50],search=0,n,i,count=0;
	printf("enter the limit of array");
	scanf("%d",&n);
	printf("enter the elemnts of array");
  for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the search element");
	scanf("%d",&search);
	for(i=0;i<n;i++)
	{
		if(search==a[i])
		{
			
			count=1;
			break;
		}
	}
	if(count==1)
	{
	printf("serach element found at %d",i+1);
	}
	else
	{
		printf("serach element not found ");
	}
}
