package com.pathaks.camel.simpletimer.Routes;

import com.pathaks.camel.simpletimer.Beans.RandomNumberBean;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MainRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:dockerTimer?period={{timer.period}}&repeatCount={{timer.repeatCount}}")
        .bean(RandomNumberBean.class)
        .log("Random Number: ${body}")
        .to("file:{{file.to}}?fileName=dockerOut.txt&fileExist=Append")
        .to("log:dockerLog?showBody=true&showHeaders=true");
    }
    
}