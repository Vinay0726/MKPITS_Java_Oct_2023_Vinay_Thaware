#include <stdio.h>
main()
{
	int num1,num2,num3;
	printf("Enter a First number\n");
	scanf("%d",&num1);
	printf("Enter a Second number\n");
	scanf("%d",&num2);
		printf("Enter a Third number\n");
	    scanf("%d",&num3);
	
	if(num1>=num2 && num1>=num2)
	{
		printf("%d is Greater",num1);
	
	}
	if(num2>=num1 && num2>=num3)
	{
		printf("%d is Greater",num2);
	
	}
	if(num3>=num1 && num3>=num2)
	{
		printf("%d is Greater",num3);
	
	}
	
}



