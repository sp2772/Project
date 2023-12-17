from datetime import date, datetime
from queue import PriorityQueue
import pyttsx3
from plyer import notification

def send_notification(title, message):
    notification.notify(
        title=title,
        message=message,
        app_name='Madhaesh and sp\'s calendar',  
        app_icon=None,  
        timeout=15 
    )



while True:
    date = datetime.now()
    print(date)
    c_date=str(date)[0:10]
    c_time=str(date)[11:16]
    print(c_date)
    print(c_time)
    with open("details.txt",'r') as f:
        f_string=f.read()
        print(f_string)
        L=f_string.split("&")
        print(L)
        for data in L:
            print(data)
            if(data==""):
                continue
            t=data.split("#")
            print(t)
            t_date=t[0]
            t_time=t[1]
            if t_date==c_date and t_time==c_time:
                print("Match Found")
                print(t[2])
                send_notification("Hello", t[2]+" "+t[3])
                engine = pyttsx3.init()
                engine.say(t[2])
                engine.runAndWait()
                continue

