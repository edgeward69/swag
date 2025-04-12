#include <stdio.h>
#include <math.h>

int main(void) {
    //lab 1-2

    double radius = 5.5;
    double area = radius * radius * M_PI;
    double perimeter = 2 * M_PI * radius;

    printf("radius = %.1f\narea = %f\nperimeter = %f", radius, area, perimeter);


    return 0;
}
