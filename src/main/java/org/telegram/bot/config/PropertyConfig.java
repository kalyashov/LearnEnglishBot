package org.telegram.bot.config;

import java.util.ResourceBundle;

/**
 * Created by kalyashov-ga on 2020-01-21.
 */
public class PropertyConfig {

    private final ResourceBundle resourceBundle;

    public PropertyConfig(String filename) {
        resourceBundle = ResourceBundle.getBundle(filename);
    }

    public String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
