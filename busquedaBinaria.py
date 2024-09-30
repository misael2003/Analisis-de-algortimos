# Aplicamos el algoritmo  de busqueda binaria para encontrar un elemento de una lista
import quickSort

def busqueda(data,valor):
    # ordenamos la lista si esta desordenada
    data = quickSort.quickSort(data)    
    if len(data) > 2:
        central = len(data) // 2 #T(n) = 1
        if valor == data[central]: #T(n) = 1
            return data[central]
        else:
            if valor > data[central]: # T(n) = log n 
                izquierdo = data[central+1:]
                return busqueda(izquierdo,valor)
            else:#T(n) = log n 
                derecha = data[:central+1]
                return busqueda(derecha,valor)
    if len(data) == 2: # T(n) = 2
        if valor == data[0]:
            return data[0]#T(n) = 1 
        if valor == data[1]:
            return data[1] # T(n) = 1
    if len(data) == 1: # T(n) = 1
        if data[0] == valor:
           return data[0] 

# T(n) => 1 + 1 + log n + log n + 2 => log n + 4
# O(?) => log n + 4 => O(n) = log n => Es la complejidad del algoritmo

def  main():
    datos = [10,1,12,5,8,4,3,11,2,6,80]
    print(busqueda(datos,7))

if __name__ == '__main__':
    main()