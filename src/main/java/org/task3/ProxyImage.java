package org.task3;

public class ProxyImage implements MyImage {
    private String filename;
    private MyImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.display();
    }
}
