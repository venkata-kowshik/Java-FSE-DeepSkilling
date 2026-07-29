package kowshik;
interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
class SimplePrinter implements Printer {

    public void print() {
        System.out.println("Printing...");
    }
}
class MultiFunctionMachine implements Printer, Scanner {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}
public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        SimplePrinter p = new SimplePrinter();
        p.print();

        MultiFunctionMachine m = new MultiFunctionMachine();
        m.print();
        m.scan();

		
	}

}
