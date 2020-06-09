package Java;

public class Paypal extends Payment{
    Integer id;
    String email;

    public Payment(Integer id, String email){
        super(id);
        this.email = email;
    }
}