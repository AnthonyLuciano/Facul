import threading
import time 

def contagem_1_a_5():
    for i in range(1,6):
        print(f"contagem 1 a 5: {i}")
        time.sleep(1)


def contagem_10_a_50():
    for i in range(10,51,10):
        print(f"contagem 1 a 50: {i}")
        time.sleep(0.5)

thread1 = threading.Thread(target=contagem_1_a_5)
thread2 = threading.Thread(target=contagem_10_a_50)

thread1.start()
thread2.start()

thread1.join()
thread2.join()

print("fim da execução")