package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {   logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
        assertTrue( true );
    }
}
