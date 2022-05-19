#include <stdio.h>

int main() {
	int quantidade_minima, quantidade_maxima;
	float estoque_medio;

	printf("Quantidade mínima: ");
	scanf("%d", &quantidade_minima);

	printf("Quantidade máxima: ");
	scanf("%d", &quantidade_maxima);

	estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

	printf("O estoque médio é %.2f", estoque_medio);
}
