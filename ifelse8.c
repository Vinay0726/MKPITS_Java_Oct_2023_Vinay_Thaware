#include <stdio.h>
main()
{
	int mark;
	printf("Enter a marks\n");
	scanf("%d", &mark);
	
	if(mark<50)
	{
		printf("Grade is E");
	
	}
	else if(mark>=50 && mark<60)
	{
		printf("Grade is D");
	
	}
		else if(mark>=60 && mark<70)
	{
		printf("Grade is C");
	
	}
		else if(mark>=70 && mark<80)
	{
		printf("Grade is B");
	
	}
		else if(mark>80)
	{
		printf("Grade is A");
	
	}
	
}

