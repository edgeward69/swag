#include <stdio.h>

int main(void) {
    //lab1-3

    float pound;
    float kilo;

    printf("Enter a number in pounds:");
    scanf("%f", &pound);

    kilo = pound * 0.454;

    printf("%g pounds is %g kilograms",pound, kilo);


    return 0;
}
