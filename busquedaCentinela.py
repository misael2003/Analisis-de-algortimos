# aplicamos el algoritmo secuencial con centinela

def Centinela(data,valor):
    data.append(valor) # T(n) = 1
    indice = 0 # T(n) = 1
    while indice < len(data): # T(n) = n
        if data[indice] == valor: 
            break;
        indice +=1 #
    if indice <= len(data) - 2: #T(n) = 1
        print(indice)
        return "Valor encontrado"
    if indice ==len(data) -1: # T(n) = 1
        print(indice)
        return "Valor no encontrado"

    # T(n) = 1 + 1 + n + 1 + 1 => n + 4 => n
    # O(?) => O(n) es la complejidad del algoritmo 

def main():
    datos = [23,40,12,11,34,10,1,2,98,6]
    print(Centinela(datos,11))

if __name__ == '__main__':
    main()
