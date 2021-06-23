import java.sql.Timestamp;

abstract class StorageItem{

    private Timestamp date;
    private String name;
    protected int size;

    public StorageItem(String nameToSet)
    {
        this.name = nameToSet;

        /**
           * Algorithm to get a random date
           * between the two given
           * use "%" expression between a random long
           * and the difference in milliseconds between
           * the two given dates and add the result
           * to the first date
           */
        Timestamp firstDate = Timestamp.valueOf("2017-01-01 00:00:00");
        Timestamp secondDate = Timestamp.valueOf("2021-12-31 23:59:59");
        long dateDifference = secondDate.getTime()-firstDate.getTime();
        long randomLong = Main.rnd.nextLong();
        if (randomLong < 0)
            randomLong = -(randomLong);
        long temp = randomLong % dateDifference;
        this.date = new Timestamp(temp + firstDate.getTime());
    }

    public String getName(){
        return this.name;
    }

    public Timestamp getDate() {
        return this.date;
    }

    /**
     * getSize is implemented both in Folder and
     * in File
     */
    abstract public int getSize();

    /**
     * printTree is implemented both in Folder and
     * in File
     */
    abstract void printTree(SortingField name);

    /**
     * printer function is called inside of "printTree and
     * is implemented differently in "Folder" and in "File"
     */
    abstract void printer(SortingField name, int depth);
}
