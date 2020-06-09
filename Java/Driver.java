package Java;

public class Driver extends Account{
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Driver(Integer id, String name, String document, String email, String password){
        super(id, name, document, email, password);
    }
}