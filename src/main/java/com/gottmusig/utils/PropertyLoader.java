package com.gottmusig.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lgottschick on 30.09.2016.
 */
public class PropertyLoader {

    private static Properties properties = new Properties();

    public static Properties loadProperties(String pathToPropertyFile) {
        InputStream propertiesInput = null;
        try {
            propertiesInput = new FileInputStream(pathToPropertyFile);
            properties.load(propertiesInput);
            //TODO what to do when necessary properties empty, e.g password
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static Properties getProperties() {
        return properties;
    }
}
