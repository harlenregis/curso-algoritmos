#include <stdio.h>

int main() {
	float valor_por_hora, salario;
	int horas_trabalhadas;

	printf("Salário por hora: ");
	scanf("%f", &valor_por_hora);

	printf("Horas trabalhadas: ");
	scanf("%d", &horas_trabalhadas);

	salario = (horas_trabalhadas * valor_por_hora);

	printf("Salário mensal R$ %.2f", salario);
}
