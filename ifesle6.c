#include <stdio.h>
main()
{
	int marks,interview;
	printf("Enter written test marks\n");
	scanf("%d", &marks);
	printf("Enter interview marks\n");
	scanf("%d", &interview);
	
	if(marks,interview>=50)
	{
		printf("SELECTED");
	}
	else
	{
		printf("REJECTED");
	}
}
