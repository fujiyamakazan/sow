import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class App extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        //return (Class<? extends Page>)HomePage.class;
        return null;
    }
}