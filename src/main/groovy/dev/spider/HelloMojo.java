package dev.spider;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Mojo;

import java.util.Map;

/**
 * @author lgc
 */
@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    Log lg = getLog();
    Map ctx = getPluginContext();

    public void execute() {
        lg.info("Hello，definition use @goal at doc cause conflict");
        ctx.put("mojoName", this.getClass().getName());
        getLog().info("inject context over!");
    }
}
