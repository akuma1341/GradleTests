import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;

public class CopyFilesTask extends DefaultTask{
    private String sourceDirectory;
    private String destinationDirectory;

    @Input
    public String getSourceDirectory() {
        return sourceDirectory;
    }

    public void setSourceDirectory(String sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
    }

    @Input
    public String getDestinationDirectory() {
        return destinationDirectory;
    }

    public void setDestinationDirectory(String destinationDirectory) {
        this.destinationDirectory = destinationDirectory;
    }

    @TaskAction
    public void copyFiles() {
        File source = new File(sourceDirectory);
        File destination = new File(destinationDirectory);

        try {
            FileUtils.copyDirectory(source, destination);
        } catch (IOException e) {
            System.out.println("Copy failed: " + e.getMessage());
        }
    }
}
