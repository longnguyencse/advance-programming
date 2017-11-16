package com.aca.shop;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nqlong on 16-Nov-17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("api/hello")
    public String greet() {
        return "Hello from the other side!!!";
    }
    @RequestMapping("api/long")
    public String helloLong() {
        return "lomh";
    }

}
