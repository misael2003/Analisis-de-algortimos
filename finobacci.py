def fino(n):
	
	if n == 0 or n == 1:
		return 1

	else:
		return fino(n -1) + fino(n-2)

fn = int(input("introduce un rango: "))

x = 0
while x <= fn:
	print(fino(x))
	x += 1