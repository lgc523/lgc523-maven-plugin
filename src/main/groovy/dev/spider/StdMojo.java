package dev.spider;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lgc
 */
@Mojo(name = "stdMojo",
        defaultPhase = LifecyclePhase.GENERATE_RESOURCES,
        threadSafe = true)
public class StdMojo extends AbstractMojo {

    Log log = getLog();
    Map<String, String> StdM = new HashMap();

    @Parameter(name = "val", defaultValue = "")
    String arg;


    public void execute() throws MojoExecutionException, MojoFailureException {
        log.info("Extends AbstractMojo to definition StdMojo, wait trigger");
        StdM.put("GoalClassName", ROLE);
        log.info("ContextEnable allow mojos share data each other");
        this.setPluginContext(StdM);
    }
}
