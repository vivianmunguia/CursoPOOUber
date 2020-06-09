package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){ //Atributos que son obligación para el objeto
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passenger != null){
        System.out.println("License: " + license + " Name driver: " + driver.name + " Passengers: " + getPassenger());
        } 
    }
    
    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
        this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}