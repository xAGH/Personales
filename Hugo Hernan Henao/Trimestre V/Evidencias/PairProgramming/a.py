n = [4,3,5,2,1]
n_sort = []
menor = n[0]
while len(n_sort) != 5:
    for i in range(len(n)):
        if n[i] < menor: 
            menor = n[i]
    n_sort.append(menor)

print(n_sort)