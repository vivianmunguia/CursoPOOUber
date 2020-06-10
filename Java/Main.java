package Java;
public class Main { //El nombre de la clase debe tener el mismo nombre del archivo
    public static void main(String[] args) {
        
        UberX uberX = new UberX("AMQ123", new Account(1, "Andres Herrera", "AND123", "andres.herrera@gmail.com", "123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        /*UberVan uberVan = new UberVan("FGH345", new Account(1, "Andres Herrera", "AND123", "andres.herrera@gmail.com", "123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();*/

        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "QWE567"));
        //car2.passenger = 3;
        car2.printDataCar();*/
    }
}