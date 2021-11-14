package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.example.resources.SampleResource;

public class SampleApplication extends Application<SampleConfiguration> {
    public static void main(String[] args) throws Exception {
        //httpConfig();
        System.out.println("hi > "+args[0] + args[1]);
        new SampleApplication().run(args);
    }

//    private final static void httpConfig(){
//        String applicationPort = "9090";
//        String adminPort = "9091";
//        System.setProperty("dw.server.applicationConnectors[0].port", applicationPort);
//        System.setProperty("dw.server.adminConnectors[0].port", adminPort);
//    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment) throws Exception {
        System.out.println("hi");
        environment.jersey().register(new SampleResource());
    }
}
