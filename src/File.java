public class File extends StorageItem {
    private String fileName;
    private String suffix;
    private String content;

    public File(String fileName, String suffix) {
        super(fileName);
        this.suffix = suffix;
        this.content = "";
        this.fileName = fileName;
    }

    @Override
    public int getSize() {
        return content.length();
    }

    @Override
    public String getName() {
        return this.fileName + "." + suffix;
    }

    public void printContent() {
        System.out.println(getName() + " Size: " + getSize() + "MB Created:" + getDate());
    }

    public void addContent(String contentToAdd) {
        this.content = this.content + contentToAdd;
    }

    public void printTree(SortingField type) { System.out.println(this.getName() + "." + this.suffix); }
}
