import core.Alert;

public class main {

    public static void main(String[] args) {

        Alert someAlert = new Alert("Alert1", "This is my first alarm");
        System.out.println(String.format("I have created an alert \"%s\" with the following description: %s", someAlert.getName(), someAlert.getDescription()));

    }
}
