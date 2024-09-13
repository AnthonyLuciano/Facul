import threading
import time
import random
from queue import Queue

buffer = Queue(maxsize=5)

buffer_cheio=threading.Semaphore(5)
buffer_vazio=threading.Semaphore(0)
#produtor
def produtor():
    for i in range(10):
        buffer_cheio.acquire()
        buffer.put(i)
        if buffer.qsize() == 5:
            print(f"buffer esta cheio. produtor aguardando...")
        elif buffer.qsize == 1:
            print(f"buffer não esta vazio, consumidor pode consumir")
        print(f"produtor produziou o item {i}. o buffer atual: {buffer.qsize()} itens")
        buffer_vazio.release()
        time.sleep(1)
#consumidor
def consumidor():
    for _ in range(10):
        buffer_vazio.acquire()
        item = buffer.get()
        if buffer.qsize() == 0:
            print(f"buffer esta vazio. consumidor aguardando...")
        elif buffer.qsize == 4: 
            print(f"buffer nao esta mais cheio, Produtor pode produzir")
        print(f"consumidor consumiu o item {item}. o buffer atual: {buffer.qsize()} itens")
        buffer_cheio.release()
        time.sleep(6)

#criando as threads ára simular o produtor e o consumidor
produtor_thread = threading.Thread(target=produtor)
consumidor_thread = threading.Thread(target=consumidor)

produtor_thread.start()
consumidor_thread.start()

produtor_thread.join()
consumidor_thread.join()

print("execucao finalizada")