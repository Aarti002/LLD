package CompositePattern.Core;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem {
    String dirName;
    List<IFileSystem> childFiles;

    public Directory(String name) {
        this.dirName = name;
        this.childFiles = new ArrayList<>();
    }

    public void addFile(IFileSystem newFile) {
        childFiles.add(newFile);
    }

    @Override
    public void ls() {
        for(IFileSystem f:childFiles) {
            f.ls();
        }
    }
}
