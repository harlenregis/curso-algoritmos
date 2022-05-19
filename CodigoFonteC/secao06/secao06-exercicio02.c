#include <stdio.h>

int main(){
	int numero, a, b;

	printf("Informe um número: ");
	scanf("%d", &numero);

	if (numero > 0) {
		a = numero;
		printf("O número %d é positivo.", numero);
	}
	else {
		b = numero;
		printf("O número %d é negativo.", numero);
	}
}
