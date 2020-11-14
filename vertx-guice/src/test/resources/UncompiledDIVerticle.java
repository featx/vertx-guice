import static org.junit.Assert.assertNotNull;
import io.vertx.core.AbstractVerticle;
import javax.inject.Inject;
import org.featx.vertx.guice.MyDependency;

public class UncompiledDIVerticle extends AbstractVerticle {

    private final MyDependency myDependency;

    @Inject
    public UncompiledDIVerticle(MyDependency myDependency) {
        this.myDependency = myDependency;
        assertNotNull(myDependency);
    }
}