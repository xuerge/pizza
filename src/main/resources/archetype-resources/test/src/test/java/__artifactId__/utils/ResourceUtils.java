package ${package}.${artifactId}.utils;



import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ResourceUtils {

    public static String loadClassResource(String name)  {
        InputStream in = null;
        try {
            in = ResourceUtils.class.getClassLoader().getResourceAsStream(name);
//            return IOUtils.toString(in, String.valueOf(StandardCharsets.UTF_8));
            return "";
        } finally {
//            IOUtils.closeQuietly(in);
        }
    }
}
