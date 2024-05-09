package Employee;

public class Address{
    private String city;
    private int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee.Employee.Address{" +
                "city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }
}