import threading
import time

CA = False
CB = False

def process_1():
    global CB, CA
    for i in range(5):
        CA = True
        while CB:
            pass
        print("Processo 1 esta na regiao critica")
        time.sleep(1)
        print("processo 1 saiu da regiao critica")
        CA = False