package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.module1.Module1Class;
import org.example.module2.Module2Class;

public class Main {
    private static final Logger logger = LogManager.getLogger( Main.class);

//    private static final Logger logger1 = LogManager.getLogger("com.example.module1");
//    private static final Logger logger2 = LogManager.getLogger("com.example.module2");

    public static void main(String[] args) {
        // Ensure that the logs directory exists
        new java.io.File("logs").mkdirs();

        System.setProperty("log4j.configurationFile", "log4jProject/src/main/resources/log4j2-module1.xml");
        Module1Class module1 = new Module1Class();
        module1.performAction();

//        logger1.debug("Debug message for Module 1");
//        logger2.debug("Debug message for Module 2");
        System.out.println("Log configuration file: " + System.getProperty("log4j.configurationFile"));
        // Set up logging configuration for Module 2
        System.setProperty("log4j.configurationFile", "log4jProject/src/main/resources/log4j2-module2.xml");
        Module2Class module2 = new Module2Class();
        module2.performAction();

        logger.info("from main class");
        // Print out the absolute path for debugging purposes
        System.out.println("Log configuration file: " + System.getProperty("log4j.configurationFile"));
    }
}