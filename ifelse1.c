#include <stdio.h>
main()
{
	int mark;
	printf("Enter a mark\n");
	scanf("%d",&mark);
	if(mark>=50)
	{
		printf("PASS");
	}
	else{
		printf("FAIL");
	}
}
