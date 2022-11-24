package com.testNG.utils;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;
    // this method will read any property file
    //this method will give you all your data in your config.properties
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop= new Properties();
            prop.load(fis);
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
    // this method retrieves single value based on the specified key
    // sometimes we don't need all our data from our config.properties we may need one or more
    // so by using this method we can get it based on key
    public static String getPropertyValue(String key){
        return prop.getProperty(key);

    }
}
