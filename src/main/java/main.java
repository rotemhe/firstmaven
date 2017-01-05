import org.openspaces.core.GigaSpace;
import org.openspaces.core.GigaSpaceConfigurer;
import org.openspaces.core.space.EmbeddedSpaceConfigurer;

/**
 * Created by rotemh-pcu on 1/4/17.
 */
public class main {

    GigaSpace gigaSpace = new GigaSpaceConfigurer(new EmbeddedSpaceConfigurer("mySpace")).gigaSpace();
}

//