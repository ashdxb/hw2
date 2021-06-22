import java.util.ArrayList;

public class Folder extends StorageItem {

    private ArrayList<StorageItem> folderContents;
    private String folderName;

    public Folder(String folderName) {
        super(folderName);
        this.folderContents = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return 0;
    }

    public void addItem(StorageItem fi1) {
        folderContents.add(fi1);
    }

    public File findFile(String path) {
        if (path == null) return null;
        StringBuilder file_name = new StringBuilder();
        char curr = path.charAt(0);
        int i;
        int len = path.length();
        for (i = 0; curr != '/' && i < len; i++, curr = path.charAt(i)) file_name.append(path.charAt(i));
        if (i == len) {
            for (StorageItem c : this.folderContents) {
                if (c instanceof File && c.getName().equals(file_name.toString())) return (File) c;
            }
            return null;
        } else {
            StringBuilder new_path = new StringBuilder();
            i++;
            for (; i < len; i++) new_path.append(path.charAt(i));
            for (StorageItem c : this.folderContents) {
                File keep;
                if (c instanceof Folder) {
                    keep = ((Folder) c).findFile(new_path.toString());
                    if (keep != null) return keep;
                }
            }
            return null;
        }
    }

    public void printTree(SortingField name) {
    }
}
