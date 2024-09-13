import threading
import time

def funcao():
    print("executando thread")

thread = threading.Thread(target=funcao)
thread.start()
thread.join() #espera a thread terminar
# veridica se as threads estão ativas
while thread.is_alive():
    print("a thread ainda esta ativa...")
    time.sleep(0.5)