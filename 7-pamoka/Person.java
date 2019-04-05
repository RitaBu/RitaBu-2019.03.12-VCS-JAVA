package pamoka.pirma;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if(!address.isEmpty()) {
            this.address = address;
        }
    }

    public String toString() {
        return "name = " + this.name
                + ", address = " + this.address;
    }
}
