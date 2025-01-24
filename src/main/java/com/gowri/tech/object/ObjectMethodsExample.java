package com.gowri.tech.object;

/*
 * @author NaveenWodeyar
 * @date 24-01-2025
 */

public class ObjectMethodsExample {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 1. toString()
        System.out.println("toString() example: " + obj1.toString());

        // 2. hashCode()
        System.out.println("hashCode() example: " + obj1.hashCode());

        // 3. equals() (checking reference equality by default)
        boolean areEqual = obj1.equals(obj2);
        System.out.println("equals() example (obj1 equals obj2): " + areEqual);

        // 4. getClass()
        Class<?> objClass = obj1.getClass();
        System.out.println("getClass() example: " + objClass.getName());

        // 5. notify() (used for thread synchronization)
        synchronized (obj1) {
            obj1.notify(); // Will cause a runtime exception if not called in a synchronized block
        }

        // 6. wait() (used for thread synchronization)
        synchronized (obj1) {
            try {
                obj1.wait(1000); // Will cause a runtime exception if not called in a synchronized block
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 7. notifyAll() (used for thread synchronization)
        synchronized (obj1) {
            obj1.notifyAll(); // Will cause a runtime exception if not called in a synchronized block
        }
    }
}
