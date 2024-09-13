import threading
import time
import random
from queue import Queue

buffer = Queue(maxsize=5)
#produtor
def produtor():
    while True:
        #produz um item
        item = random.randint(1,100)
        #simula o tempo de producao
        time.sleep(random.randint(1,6))
        #adicionar o item ao buffer
        buffer.put(item)
        print(f"produtor gerou o item {item}. o buffer atual: {buffer.qsize()} itens")

def consumidor():
    while True:
        #simula tempo de consumo
        time.sleep(6)
        #consumir um item do byffer
        item = buffer.get()
        print(f"produtor consumiu o item {item}. o buffer atual: {buffer.qsize()} itens")

#criando as threads ára simular o produtor e o consumidor
produtor_thread = threading.Thread(target=produtor)
consumidor_thread = threading.Thread(target=consumidor)

produtor_thread.start()
consumidor_thread.start()

produtor_thread.join()
consumidor_thread.join()

print("execucao finalizada")