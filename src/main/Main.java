package main;

public class Main {
    public static void main(String[] args) {
        MapDemo<Integer, String> myMapDemo = new MapDemo<Integer, String>();
        myMapDemo.put(1, "Xian");
        myMapDemo.put(3, "Wuhan");
        myMapDemo.put(5, "Guangxi");
        myMapDemo.put(12, "Guizhou");
        System.out.println(myMapDemo.get(1));
        System.out.println(myMapDemo.containsValue("Guangxi"));
        System.out.println(myMapDemo.replace(3, "Wuhan", "Jingzhou"));
        System.out.println(myMapDemo.get(3));
    }
}
