package org.task3;

public class Main {
    public static void main(String[] args) {
        String filename = "data/img.png";
//        MyImage image = new RealImage(filename);
//        image.display();

        MyImage image2 = new ProxyImage(filename);
        image2.display();
    }
}
