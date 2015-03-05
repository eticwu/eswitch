package com.kuaidadi.demo.web.service;

import com.kuaidadi.app.common.eswitch.item.DefaultSwitchEngine;
import com.kuaidadi.app.common.eswitch.threshold.Threshold;

@Threshold(item = "test.hello", defaultValue = 10)
public class HelloService {
    private DefaultSwitchEngine switchEngine;

    public void hello() {
        if (switchEngine.isOn("test.switch.hello", false)) {
            System.out.println("hello service !");
        } else {
            System.out.println("bad service !");
        }
    }

    public void setSwitchEngine(DefaultSwitchEngine switchEngine) {
        this.switchEngine = switchEngine;
    }

}
