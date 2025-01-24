package com.gowri.tech.object;

/*
 * @author NaveenWodeyar
 * @date 25-01-2025
 */

public class ShallowCloneExample {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield");
        Person person1 = new Person("John Doe", address);

        // Cloning the person
        Person person2 = person1.clone();

        System.out.println("Original Person: " + person1);
        System.out.println("Cloned Person: " + person2);

        // Modify the address of the cloned person
        person2.address.street = "456 Elm St";
        person2.address.city = "Shelbyville";

        System.out.println("\nAfter modifying the cloned person's address:");
        System.out.println("Original Person: " + person1); // Original person will also reflect the changes due to shallow cloning
        System.out.println("Cloned Person: " + person2);
    }
}


class Address {
    String street;
    String city;

    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;  // Reference type

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding the clone method
    @Override
    public Person clone() {
        try {
            // Shallow copy: this creates a shallow copy of the object
            Person cloned = (Person) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address.street + ", " + address.city + "}";
    }
}
