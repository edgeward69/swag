#include <stdio.h>

int main(void) {
    //lab 1-7

    float st, gr, t;

    printf("Enter the subtotal and gratuity rate:");
    scanf("%f%f", &st, &gr);

    t = st + (gr/st);

    printf("The gratuity is $%.2f and the subtotal is %.2f", gr/st, t);


    return 0;
}