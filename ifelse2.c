#include <stdio.h>
main()
{
	int num;
	printf("Enter a number\n");
	scanf("%d",&num);
	if(num%2==0)
	{
		printf("%d is Even",num);
	}
	else{
		printf("%d is ODD",num);
	}
}
