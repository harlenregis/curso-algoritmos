e = 0

c = int(input("Código: "))
n = float(input("Horas trabalhadas: "))

if n > 50:
    e = (n - 50) * 20.00
    salario = (50 * 10.00) + e
    print("Salário total: {0:.2f}".format(salario))
    print("Salário excedente: {0:.2f}".format(e))

else:
    salario = (n * 10.00)
    print("Salário total: {0:.2f}".format(salario))
    print("Salário excedente: {0:.2f}".format(e))