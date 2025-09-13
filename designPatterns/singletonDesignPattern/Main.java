// package designPatterns.singletonDesignPattern;

// public class Main {
//     public static void main(String[] args) {
//         Singleton instance1 = new Singleton();
//         Singleton instance2 = new Singleton();
//         System.out.println(instance1 == instance2); 
//     }
// }



package designPatterns.singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.createInstance();
        Singleton instance2 = Singleton.createInstance();
        System.out.println(instance1 == instance2); 
    }
}