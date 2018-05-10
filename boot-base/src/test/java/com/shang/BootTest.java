package com.shang;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = HelloController.class)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class BootTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void testHome(){
        TestCase.assertEquals("hello world",helloController.home());
    }
}
