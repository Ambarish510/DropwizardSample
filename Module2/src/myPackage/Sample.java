package myPackage;

//import myPackage.ApiResouces;
//import myPackage.sampleConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
//import io.dropwizard.views.ViewBundle;



public class Sample extends Application<sampleConfig> {

    public static void main(String[] args) throws Exception {
        System.out.println("helo world");
        new Sample().run(args);
    }

    @Override
    public void initialize(Bootstrap<sampleConfig> bootstrap) {
        super.initialize(bootstrap);
        //bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(sampleConfig configuration, Environment environment) throws Exception {

        environment.jersey(); // gives access to Jersey
        environment.getObjectMapper(); //gives access to Jackson

        environment.jersey().register(new ApiResouces(configuration));

    }

}