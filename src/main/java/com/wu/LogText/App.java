package com.wu.LogText;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	 logger.trace("Trace Level.");
         logger.info("Info Level.");
         logger.warn("Warn Level.");
         logger.error("Error Level.");
    }
}
