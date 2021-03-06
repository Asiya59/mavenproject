package com.cybertek.unitilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static{

        //this the path to the location of the file
        String path = "configuration.properties";
        try {
            //jave cannot read the file directory, it needs inputdtream to read files
            //filestream then read the file
            FileInputStream fileInputStream = new FileInputStream(path);

            //properties read the spedificly proreties file
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String property){
        return properties.getProperty(property);
    }




}
