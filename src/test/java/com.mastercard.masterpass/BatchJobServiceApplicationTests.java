package com.mastercard.masterpass;

/**
 * Created by e058811 on 7/23/2015.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BatchJobServiceApplication.class)
@WebAppConfiguration
public class BatchJobServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

}
