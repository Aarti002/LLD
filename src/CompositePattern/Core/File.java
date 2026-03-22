package CompositePattern.Core;

public class File implements IFileSystem {
    String fileName;

    public File(String name) {
        this.fileName = name;
    }
    @Override
    public void ls() {
        System.out.println("file name: "+this.fileName);
    }
}
