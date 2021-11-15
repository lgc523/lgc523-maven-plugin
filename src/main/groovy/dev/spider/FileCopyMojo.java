package dev.spider;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

/**
 * @author lgc
 */
@Mojo(name = "fileCp", defaultPhase = LifecyclePhase.PACKAGE)
public class FileCopyMojo extends AbstractMojo {

    Log mLog = getLog();

    @Parameter(name = "dir", defaultValue = "${project.baseDir}")
    private String dir;

    public void execute() throws MojoExecutionException, MojoFailureException {
        mLog.info("*****Start execute FileCp plugin*****");
        File file = new File(dir);
        if (!file.exists()) {
            getLog().error("input dir is not exist");
        }

    }
}
