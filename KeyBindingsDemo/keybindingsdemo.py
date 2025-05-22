from tkinter import *
import random

window = Tk()

window.geometry("600x600")
window.resizable(False,False)

canvas = Canvas(window,height=600,width=600,background="white",highlightthickness=0)
canvas.pack()

randomX = random.randint(0,580)
randomY = random.randint(0,580)

square = canvas.create_rectangle(randomX,randomY,randomX+20,randomY+20,fill="black")

def left(event):
    x = -10
    y = 0
    canvas.move(square,x,y)

def right(event):
    x = 10
    y = 0
    canvas.move(square,x,y)

def up(event):
    x = 0
    y = -10
    canvas.move(square,x,y)

def down(event):
    x = 0
    y = 10
    canvas.move(square,x,y)

window.bind("<Left>", left)
window.bind("<Right>", right)
window.bind("<Up>", up)
window.bind("<Down>", down)


window.mainloop()