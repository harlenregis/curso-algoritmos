#include <stdio.h>

int main() {
	int numero;

	printf("Informe um número: ");
	scanf("%d", &numero);

	if (numero % 2 == 0) {
		if (numero > 0) {
			printf("O número %d é par e positivo", numero);
		} else {
			printf("O número %d é par e negativo", numero);
		}
	}else {
		if (numero > 0) {
			printf("O número %d é ímpar e positivo", numero);
		} else {
			printf("O número %d é ímpar e negativo", numero);
		}
	}
}
