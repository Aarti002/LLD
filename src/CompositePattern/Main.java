package CompositePattern;

import CompositePattern.Core.Directory;
import CompositePattern.Core.File;
import CompositePattern.Core.IFileSystem;

public class Main {
    public static void main(String[] args) {
        IFileSystem f1 = new File("do_not_open.exe");
        IFileSystem f2 = new File("ukw_open_it.exe");

        Directory dir = new Directory("stay_away");
        dir.addFile(f1);
        dir.addFile(f2);

        dir.ls();
    }
}
