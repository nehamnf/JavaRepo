package org.example.module2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Module2Class {
    private static final Logger logger = LogManager.getLogger(Module2Class.class);

    public void performAction() {
        logger.debug("Debug message from Module 2");
        logger.info("Info message from Module 2");
    }
}
