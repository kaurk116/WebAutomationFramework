package com.thetestingacademy.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import static java.lang.System.*;


public class PropertyReader {

    public PropertyReader() {

    }

    public static String readKey(String key) throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        Properties p = null;
        try {
            fileInputStream = new FileInputStream(getProperty("user.dir") + "/src/main/resources/Data.properties");
            p = new Properties();
            p.load(fileInputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return p.getProperty(key);
    }
}
