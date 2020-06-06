from car import Car                             #car es el nombre del archivo #Car es el nombre de la clase
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))       #no se necesita ni el tipo de dato ni la palabra new
    print(vars(car))
    print(vars(car.driver))
    