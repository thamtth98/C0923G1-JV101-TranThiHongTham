package ss7_interface_abstract.practice;

import ss7_interface_abstract.practice.animal.Animal;
import ss7_interface_abstract.practice.animal.Chicken;
import ss7_interface_abstract.practice.animal.Tiger;



public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
