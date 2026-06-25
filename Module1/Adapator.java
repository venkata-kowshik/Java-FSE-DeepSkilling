package kowshik;

interface USB {
    void connect();
}

class TypeCCharger {
    void charge() {
        System.out.println("Charging with Type-C");
    }
}

class Adapter implements USB {
    TypeCCharger charger = new TypeCCharger();

    public void connect() {
        charger.charge();
    }
}

public class Adapator {
    public static void main(String[] args) {
        USB usb = new Adapter();
        usb.connect();
    }
} 