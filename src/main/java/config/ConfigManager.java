package config;

import enums.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigManager {

    //  Properties class from Java util to read properties file
    public static final Properties properties = new Properties();
    public static final Logger logger= LogManager.getLogger(ConfigManager.class);

     static {
         loadProperties();
     }

    private static void loadProperties() {
        try {

            FileInputStream baseConfigProperties = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(baseConfigProperties);
            baseConfigProperties.close();


            Environment env= Environment.valueOf(properties.getProperty("env").toUpperCase());

            FileInputStream envConfig= new FileInputStream("src/main/resources/config/"+ env.name().toLowerCase()+"-config.properties");
            properties.load(envConfig);
            baseConfigProperties.close();
            logger.info("CConfiguration load for environment{}", env);

        } catch (IOException e) {
            System.out.println("ERROR " + e);
            logger.error("Failed to load Configuration ", e);
            throw new RuntimeException("Configuration loaded failed");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }


    public static String getProperty(String key, String defaultValue){
        return properties.getProperty(key, defaultValue);
    }

    public static Environment getEnvironment(){
         return Environment.valueOf(properties.getProperty("env").toUpperCase());
    }


}