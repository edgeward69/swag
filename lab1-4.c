#include <stdio.h>

int main(void) {
    //lab 1-4

    float c;
    float f;

    printf("Enter a degree in Celsius:");
    scanf("%f", &c);

    f = c * (9.0/5) + 32;

    printf("%g Celsius is %g Fahrenheit", c, f);


    return 0;
}