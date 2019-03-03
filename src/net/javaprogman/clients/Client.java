package net.javaprogman.clients;

// задумка была глобальнейшая ....
public class Client extends Person {

    private Integer  purse;

    public Client(String name, Integer purse) {
        super(name);
        this.purse = purse;
    }

    public Integer getPurse() {
        return purse;
    }

    public void setPurse(Integer purse) {
        this.purse = purse;
    }
}
