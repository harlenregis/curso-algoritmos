vetor1 = []
vetor2 = []
soma = []

for n in range(0, 5):
    
    num1 = int(input("Informe o valor do primeiro vetor: "))
    vetor1.append(num1)
    
    num2 = int(input("Informe o valor do segundo vetor: "))
    vetor2.append(num2)
    
    soma.append(num1 + num2)

for n in soma:
    print(n)  
