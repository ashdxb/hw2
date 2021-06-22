import java.util.ArrayList;

public class Folder extends StorageItem {

    private ArrayList<StorageItem> folderContents;
    private String folderName;

    public Folder(String folderName) {
        super(folderName);
        this.folderContents = new ArrayList<StorageItem>();
    }

    @Override
    public int getSize() {
        return 0;
    }

    public void addItem(StorageItem fi1) {
        folderContents.add(fi1);
    }

    public File findFile(String path) {
        return new File("hi","there");
    }

    public void printTree(SortingField name) {
    }
}
