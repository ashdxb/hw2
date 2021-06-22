import java.util.ArrayList;

public class Folder extends File {

    private ArrayList<Folder> folderContents;
    private String folderName

    public Folder(String folderName) {
        super();
        this.folderName = folderName
        this.folderContents = new ArrayList<Folder>();
    }

    public void addItem(File fi1) {
    }

    public void addItem(Folder fo1) {
    }

    public File findFile(String path) {
        return new File("hi","there");
    }

    public void printTree(SortingField name) {
    }
}
