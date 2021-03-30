package com.app.resteasyjackson;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {

    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        //System.out.println("Do startup logic here");
        Quarkus.waitForExit();
        //System.out.println("Do stop logic here");
        return 0;
    }

}
