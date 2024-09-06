# Aplicamos el QuikSort para ordenar los datos

def quickSort(data):

	if data is None:
		return 0
	if len(data) <= 1:
		return data
	else:
		pivote = data[-1]
		izquierda = []
		derecha = []
		for x in data[:-1]:
			if x > pivote:
				derecha.append(x)
			else:
				izquierda.append(x)
		resultado = quickSort(izquierda) + [pivote] + quickSort(derecha)
		return resultado

data = [10,1,12,5,8,4,3,11,2,6,80]
quickSort(print(quickSort(data)))