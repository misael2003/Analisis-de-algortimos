# Realizamos la busqueda de un elemento usando el método secuencial

def lineal(data,valor):
    tamaño = 1 # T(n) = 1
    for x in data: # T(n) = n
        if valor == x:
            print("valor encontrado")
            break
        if tamaño == len(data):
            print("valor no encontrado")
            break
        tamaño +=1

# T(n) = 1 + n => n
# O(?) => O(n) Es la complejidad del algoritmo 

def main():
    datos = [12,30,4,7,5,35,40,25,126]
    lineal(datos,35)

if __name__ == '__main__':
    main()
