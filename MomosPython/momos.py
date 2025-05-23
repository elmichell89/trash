from tkinter import *


ventana = Tk()
ventana.geometry("640x480")
ventana.title("python momos")
ventana.configure(background="white")


texto1 = Label(ventana,
               text="texto de arriba",
               font=("Arial", 25, "bold"),
               fg="black",
               bg="white")


texto2 = Label(ventana,
               text="texto de abajo",
               font=("Arial", 18, "bold"),
               fg="black",
               bg="white")


imagen = PhotoImage(file="") #ruta de la imagen
imagen = imagen.subsample(5) #zoom si es necesario


imagen1 = Label(image= imagen)


imagen1.place(y=300,anchor="center",relx=0.5)
texto1.place(y=55,anchor="center",relx=0.5)
texto2.place(y=410,anchor="center",relx=0.5)
texto2.tkraise() #pone el texto sobre la imagen




ventana.mainloop()