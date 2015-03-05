package com.kuaidadi.app.common.eswitch.example;

import com.kuaidadi.app.common.eswitch.threshold.Threshold;

/**
 * @author chenke
 */
@Threshold(item = "profile.api", defaultValue = 200)
public class ProfileApi {

    public void test1() {
        // sleep();
    }

    public void test2() {
        // sleep();
    }

    protected void sleep() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
    }

}
