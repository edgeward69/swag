#include <stdio.h>

int main(void) {
    //lab1-6

    float f;
    float m;

    printf("Enter a value for feet:");
    scanf("%f", &f);

    m = f * 0.305;

    printf("%g feet is %g meters",f, m);


    return 0;
}
