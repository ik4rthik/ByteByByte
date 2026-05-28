//REPRESENTATION OF POLYNOMIAL USING ARRAY
#include <stdio.h>

int main()

{

    int p1[3] = {6,2,5};

    for(int i=2;i>=0;i--){

        printf("%dx^%d+",p1[i],i);

    }

}
