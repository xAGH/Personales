import sys
sys.path.append("./")
from tests import Test

test = Test()

for i in range(1000):
    print(test.numeros(1))