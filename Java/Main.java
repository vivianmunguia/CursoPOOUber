package Java;
public class Main { //El nombre de la clase debe tener el mismo nombre del archivo
    public static void main(String[] args) {
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "QWE567"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}