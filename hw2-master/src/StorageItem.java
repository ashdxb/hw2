import java.sql.Timestamp;

abstract class StorageItem {
    private Timestamp date;
    private String name;

    public StorageItem(String nameToSet){
    this.name = nameToSet;
    Timestamp firstDate = Timestamp.valueOf("2017-01-01 00:00:00");
    Timestamp secondDate = Timestamp.valueOf("2021-12-31 23:59:59");
    long dateDifference = secondDate.getTime()-firstDate.getTime();
    long randomLong = Main.rnd.nextLong();
    if (randomLong < 0)
        randomLong = -(randomLong);
    long temp = randomLong % dateDifference;
    this.date = new Timestamp(temp + firstDate.getTime());
    }

    public Timestamp getDate() {
        return this.date;
    }

    abstract public int getSize();

    void printTree(SortingField field) {
        //need to implement
    }
}
