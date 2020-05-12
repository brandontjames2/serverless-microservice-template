package lambda;

import javax.enterprise.context.ApplicationScoped;
import java.sql.Timestamp;

@ApplicationScoped
public class ProcessingService {

    public OutputObject process(InputObject input) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String result = timestamp + " " + input.getGreeting() + " " + input.getName() + "!";
        OutputObject out = new OutputObject();
        out.setResult(result);
        return out;
    }
}