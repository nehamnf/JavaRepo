package org.example.module1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Module1Class {
    private static final Logger logger = LogManager.getLogger(Module1Class.class);

    public void performAction() {
        logger.debug("Debug message from Module 1");
        logger.info("Info message from Module 1");
        System.out.println("hello");
    }
}
