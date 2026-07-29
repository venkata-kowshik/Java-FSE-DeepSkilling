package kowshik;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
public class LiskovSubsition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
	}

}
