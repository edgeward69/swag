#include <math.h>
#include <stdio.h>

int main(void) {
    //lab 1-5

    float r, l, a, v;


    printf("Please enter the radius and length of a cylinder:");
    scanf("%f%f", &r, &l);

    a = r * r * M_PI;
    v = a * l;

    printf("The area is %g\nThe volume is: %g\n", a, v);


    return 0;
}