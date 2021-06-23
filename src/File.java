public class File extends StorageItem {
    private String fileName;
    private String suffix;
    private String content;

    public File(String fileName, String suffix){
        super(fileName);
        this.suffix = suffix;
        this.content = "";
        this.fileName = fileName;
    }

    /** size of file is defined as number of characters in a file's content*/
    @Override
    public int getSize() {
        return content.length();
    }

    /** name of file is name.suffix */
    @Override
    public String getName() {
        return this.fileName + "." + suffix;
    }

    public void printContent() {
        System.out.println(getName() + " Size: " + getSize() + "MB Created: " + getDate());
        System.out.println(this.content);
    }

    public void addContent(String contentToAdd) {
        this.content = this.content + contentToAdd;
    }

    /**
     * The tree of a file is just it's name
     * and it ends there
     */
    @Override
    public void printTree(SortingField type) { System.out.println(this.getName()); }

    @Override
    void printer(SortingField name, int depth) {
        System.out.println(this.getName());
    }
}
