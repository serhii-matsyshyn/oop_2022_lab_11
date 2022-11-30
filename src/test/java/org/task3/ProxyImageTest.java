package org.task3;

import junit.framework.TestCase;

public class ProxyImageTest extends TestCase {

    public void testDisplay() {
        // generate test jpeg file
        String filename = "data/img.png";
        MyImage image = new ProxyImage(filename);
        image.display();
    }
}