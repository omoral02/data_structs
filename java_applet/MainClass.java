package java_applet;

import java.applet.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class MainClass extends Applet implements Runnable {
    Thread thread = new Thread(this);
    boolean running = true;

    public void init() {
        setSize(400, 400);
    }

    public void start() {
        thread.start();
    }

    public void destroy() {
        running = false;
    }

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) {

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println("Error has occured:" + e);
                // nothing happens here or else print error
            }
        }
    }

}
