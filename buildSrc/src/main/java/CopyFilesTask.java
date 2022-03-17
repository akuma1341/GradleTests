import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;

public class CopyFilesTask extends DefaultTask{

    @TaskAction
    public void copyFiles() {
        String currentDirectory = System.getProperty("user.dir");
        String sourceDirectoryLocation = currentDirectory + "/copyFrom";
        String destinationDirectoryLocation = currentDirectory + "/copyTo";

        File sourceDirectory = new File(sourceDirectoryLocation);
        File destinationDirectory = new File(destinationDirectoryLocation);

        try {
            FileUtils.copyDirectory(sourceDirectory, destinationDirectory);
        } catch (IOException e) {
            System.out.println("Copy failed: " + e.getMessage());
        }
    }
}
