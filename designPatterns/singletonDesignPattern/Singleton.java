// package designPatterns.singletonDesignPattern;

// public class Singleton {
//     public Singleton(){
//         System.out.println("Singleton Instance Created");
//     }
// }

//lets solve the problem of multiple instances by making the constructor private and providing a static method to get the instance

package designPatterns.singletonDesignPattern;

public class Singleton {

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    private static Singleton instance;

    public static Singleton createInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }

        return instance;

    }
}
