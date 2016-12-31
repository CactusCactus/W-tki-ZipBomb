package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Comarch on 2016-12-31.
 */
public class Bomb {

    private int fileIndex = 0;
    private String createString() {
        char[] chars = new char[1000000];
        Random random = new Random();
        int num = random.nextInt(33) + 93;
        Arrays.fill(chars, (char) num);
        return new String(chars);
    }
    private void writeFile() {
        try{
            PrintWriter writer = new PrintWriter("file" + fileIndex, "UTF-8");
            writer.println(createString());
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
    public void detonate() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread9 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        Thread thread10 = new Thread(new Runnable() {
            @Override
            public void run() {
                writeFile();
                fileIndex ++;
            }
        });
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
        thread6.run();
        thread7.run();
        thread8.run();
        thread9.run();
        thread10.run();
    }
}
