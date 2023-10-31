#include <stdio.h>
main()
{
	int marks,interview;
	printf("Enter written test marks\n");
	scanf("%d", &marks);
	
	if(marks>=50)
	{
		printf("Enter marks of interview marks\n");
		scanf("%d", &interview);
		
	}
	if(interview>=50)
	{
		printf("SELECTED");
	}
	else
	{
		printf("REJECTED");
	}
}

