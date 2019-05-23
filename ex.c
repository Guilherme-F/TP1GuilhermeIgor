#include <stdio.h>
int main () {
    int hm, ok;
    printf ("Escolha 1 ou 2");
    scanf("%i", &ok);
    if (ok == 1){
        hm= 200;
}else if(ok == 2){
hm=100;
} else {
printf("Numero invalido");
}
for (ok = 1;ok<hm;ok=ok+2){
printf("%d\n", ok);
}
return 0;
}    
    

