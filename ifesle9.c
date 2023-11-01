#include<stdio.h>
#include<conio.h>

main()
{
	float unit;
	printf("Enter the Electric Unit :-");
	scanf("%f",&unit);
	
	if(unit<100)
	printf("Total Bill :-%f ",unit*1.0);
	else if(unit>=100 && unit<200)
	printf("Total Bill :-%f ",unit*1.25);
	else if(unit>=200 && unit<300)
	printf("Total Bill :-%f ",unit*1.50);
	else if(unit>=300 && unit<400)
	printf("Total Bill :-%f ",unit*1.75);
	else
	printf("Total Bill :-%f ",unit*2);
	
	getch();
}