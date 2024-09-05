def sumaLista(data):
	
	tamaño = len(data)
	suma = 0
	
	if tamaño == 0:
		return suma
	
	if tamaño >= 1:
		
		#dividimos la lista en segmentos de dos 
		elementos = data[:2]
		
		for x in range(len(elementos)):
			data.remove(elementos[x])
	 	
	 	# sumamos los elementos usando dos pares o mas
		
		if len(elementos) != 1:
			for y in range(len(elementos)):
				suma += elementos[y]
		else:
			suma = elementos[0]
		return suma + sumaLista(data)
numeros = [2,4,6,8,10,12,15,20]
print(sumaLista(numeros))