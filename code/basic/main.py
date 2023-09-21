import itertools as it
arr=[2]
res=[]
target= 80
flag=1
for i in range(1,target//min(arr)+1):
    for j in list(it.combinations_with_replacement(arr,i)):
        print(j)
        if sum(j)==target:
            print(i)
            flag=0
            break
    if not flag:
        break
if flag:
    print(-1)