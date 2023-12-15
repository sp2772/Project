from plyer import notification

def send_notification(title, message):
    notification.notify(
        title=title,
        message=message,
        app_name='Your App Name',  # Replace with your app name
        app_icon=None,  # You can provide a path to an icon if you have one
        timeout=15 # The notification will disappear after this many seconds
    )

# Example usage:
send_notification("Hello", "This is a notification from your Python script!")
n=9
a=7
r=5
if n>0 and a!=0 and r>1:
    s=a*(((r**n)-1)/(r-1))
elif n>0 and a!=0 and r==1:
    s=n*a
elif n>o and a!=0 and r<1:
    s=a*(((1-(r**n))/(1-r)))
else:
    s="invalid input"
print('sum of terms of G.P is', ' ',s)    