from car import Car                             #car es el nombre del archivo #Car es el nombre de la clase
if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()                                        #no se necesita ni el tipo de dato ni la palabra new
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Martha Pérez"
    print(vars(car2))

    