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

    public void printer(SortingField name , int counter) {
        System.out.println(this.getName());
        for (StorageItem item:this.folderContents){
            for (int i = 0 ; i < counter ; i++) {
                System.out.print("    |");
            }
            printer(name , counter+1);
        }
    }

}



