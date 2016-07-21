package myPackage;

import io.dropwizard.Configuration;

public class sampleConfig extends Configuration{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}