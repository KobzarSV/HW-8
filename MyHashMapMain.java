package ua.goit.HomeWork8;

public class MyHashMapMain {
    public static void main(String[] args) {
        MyHashMap<String, String> capitals = new MyHashMap<>(5);

        capitals.put("Ukraine", "Kiev");
        capitals.put("USA", "New-York");
        capitals.put("England", "London");
        capitals.put("Russia", "Moscow");
        capitals.put("France", "Paris");

        System.out.println(capitals);

        System.out.println("My HashMap size: " + capitals.size());

        System.out.println("Value key 'USA' = " + capitals.get("USA"));

        capitals.remove("France");
        System.out.println("After remove 'France': " + capitals);

        capitals.clear();
        System.out.println("My HashMap after clear: " + capitals);
    }
}
