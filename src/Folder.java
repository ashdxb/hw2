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
        int size = 0;
        for (int i = 0 ; i < this.folderContents.size() ; i++){
            size += folderContents.get(i).getSize();
        }
        return size;
    }

    public boolean addItem(StorageItem fi1) {
        for (StorageItem item : folderContents){
            if (item.getName().equals(fi1.getName())){
                return false;
            }
        }
        folderContents.add(fi1);
        return true;
    }

    public File findFile(String path) {
        return new File("hi","there");
    }

    public void printTree(SortingField name) {
    }
}
