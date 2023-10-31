#include <stdio.h>
main()
{
	float unit,bill;
	printf("Enter a units consume\n");
	scanf("%f", &unit);
	
	if(unit<100)
	{
		bill=unit*1;
		printf("Electricity bill : %f",bill);
	
	}
	else if(unit>100 && unit<200)
	{
		bill=100*1+(unit-100)*1.25;
		printf("Electricity bill : %f",bill);
	}
		else if(unit>200 && unit<300)
	{
	    bill=100*1+100*1.25+(unit-200)*1.50;
	    printf("Electricity bill : %f",bill);
	}
		else if(unit>300 && unit<400)
	{
	     bill=unit*1+100*1.25+100*1.50+(unit-300)*1.75;
	     printf("Electricity bill : %f",bill);
	
	}
		else if(unit>=400)
	{
		bill=unit*1+100*1.25+100*1.50+100*1.75+(unit-100)*2;
		printf("Electricity bill : %f",bill);
	
	}
	
}

