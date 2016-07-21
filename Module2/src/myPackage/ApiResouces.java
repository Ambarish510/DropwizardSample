package myPackage;

//import myPackage.sampleConfig;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/greet")
public class ApiResouces {

    private final sampleConfig samConf;

    public ApiResouces(sampleConfig samConf) {
        this.samConf = samConf;
    }

    @GET
    public String welcome(@QueryParam("name") @DefaultValue("stranger") String name) {
        return "Hello " + name + ", Welcome to " + samConf.getName() + " Application";
    }
}
