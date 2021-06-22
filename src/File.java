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

    public int getSize() {
        return content.length();
    }

    public String getName() {
        return this.fileName + "." + suffix;
    }

    public void printContent() {
        System.out.println(getName() + " Size: " + getSize() + "MB Created:" + getDate());
    }

    public void addContent(String contentToAdd) {
        this.content = this.content + contentToAdd;
    }
}
