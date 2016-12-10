package com.gottmusig.rest.blizzard.utils;

import com.gottmusig.utils.PropertyLoader;

import java.util.Properties;

/**
 * Created by lgottschick on 30.09.2016.
 */
public class UrlBuilder {

    public static String buildUrl(String requestPath) {
        Properties properties = PropertyLoader.getProperties();

        return properties.getProperty("api.path") +
                requestPath +
                "?locale=en_GB" +
                "&apikey=" + properties.getProperty("api.key");
    }

}
