package com.gowri.tech.object;

/*
 * @author NaveenWodeyar
 * @date 25-01-2025
 */

public class DeepCloneExample {

    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield");
        PersonDeepClone person1 = new PersonDeepClone("John Doe", address);

        // Cloning the person
        PersonDeepClone person2 = person1.clone();

        System.out.println("Original Person: " + person1);
        System.out.println("Cloned Person: " + person2);

        // Modify the address of the cloned person
        person2.address.street = "456 Elm St";
        person2.address.city = "Shelbyville";

        System.out.println("\nAfter modifying the cloned person's address:");
        System.out.println("Original Person: " + person1); // Original person remains unchanged due to deep cloning
        System.out.println("Cloned Person: " + person2);
    }
}

class PersonDeepClone implements Cloneable {
    String name;
    Address address;  // Reference type

    PersonDeepClone(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding the clone method to implement deep cloning
    @Override
    public PersonDeepClone clone() {
        try {
            // Perform shallow cloning
            PersonDeepClone cloned = (PersonDeepClone) super.clone();

            // Manually clone the Address object to achieve deep cloning
            cloned.address = new Address(this.address.street, this.address.city);

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