package users;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void saludar() {
        System.out.println(this.name + " saludando...");
    }
}