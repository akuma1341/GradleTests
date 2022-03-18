import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;

public class CloneGitTask extends DefaultTask {
    private String url;

    @Input
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @TaskAction
    public void cloneGit() {
        String command = "git clone " + url;

        String currentDirectory = System.getProperty("user.dir");
        String gitCloneDirectory = currentDirectory + "/gitClone";

        File directory = new File(gitCloneDirectory);

        try {
            Runtime.getRuntime().exec(command, new String[0], directory);
        } catch (IOException e) {
            System.out.println("Clone failed: " + e.getMessage());
        }
    }
}
