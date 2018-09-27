package demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.*;

public class LogDemo {
    public static void main(String[] args) {

        Log logger = LogFactory.getLog("ksjfkks");
        System.out.println(logger);
        logger.info("hello");




    }
}
