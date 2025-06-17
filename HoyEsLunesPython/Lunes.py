import tkinter as tk
import datetime

def lunes():
    today = datetime.datetime.today()
    if today.weekday() == 0:
        si.place(y=250,anchor="center",relx=0.5)
    else:
        no.place(y=250,anchor="center",relx=0.5)

def main():
    window = tk.Tk()
    window.geometry("400x400")
    window.resizable(False,False)
    window.configure(background="white")
    window.title("¿Hoy es lunes?")
    global si, no
    si = tk.Label(window,
                  text="Sí",
                  font=("Arial", 30, "bold"),
                  fg="green",
                  bg="white")

    no = tk.Label(window,
                  text="No",
                  font=("Arial", 30, "bold"),
                  fg="red",
                  bg="white")

    button = tk.Button(window,
                       text="¿Hoy es lunes?",
                       font=("Arial", 30, "bold"),
                       fg="black",
                       command=lunes)


    button.place(y=100,anchor="center",relx=0.5)

    window.mainloop()

if __name__ == "__main__":
    main()