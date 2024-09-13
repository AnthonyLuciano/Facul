import threading
import time
#variave de bloqueio
bloqueio = 1
#regi
def process_1():
    global bloqueio
    for i in range(5):
        while bloqueio != 1:
            pass

        print("processo 1 esta na refiao critica")
        time.sleep(1)
        print("o processo 1 saiu da regiao critica")

        bloqueio= 2

def process_2():
    global bloqueio
    for i in range(5):
        while bloqueio != 2:
            pass

        print("processo 2 esta na refiao critica")
        time.sleep(1)
        print("o processo 2 saiu da regiao critica")


thread1 =threading.Thread(target=process_1)
thread2 =threading.Thread(target=process_2)

thread1.start()
thread2.start()

thread1.join()
thread2.join()