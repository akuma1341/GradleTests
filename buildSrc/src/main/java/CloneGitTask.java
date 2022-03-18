import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;

public class CloneGitTask extends DefaultTask {
    private String uri;
    private String directory;

    @Input
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Input
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @TaskAction
    public void cloneGit() {
        String command = "git clone " + uri;
        File cloneDirectory = new File(directory);

        try {
            Runtime.getRuntime().exec(command, new String[0], cloneDirectory);
        } catch (IOException e) {
            System.out.println("Clone failed: " + e.getMessage());
        }
    }
}
