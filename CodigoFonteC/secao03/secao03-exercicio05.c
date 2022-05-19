#include <stdio.h>

int main() {
	int metros, centimetros;

	printf("Informe o valor em metros: ");
	scanf("%d", &metros);

	centimetros = metros * 100;

	printf("%d metros em centímetros é %d", metros, centimetros);
}
