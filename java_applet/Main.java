package java_applet;

import java.applet.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Main extends Applet implements Runnable {
    Thread thread = new Thread(this);
    boolean running = true;

    public void init() {
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

            } catch (InterruptedException e) {
                System.out.println("Error has occured:" + e);
                // nothing happens here or else print error
            }
        }
    }

}
