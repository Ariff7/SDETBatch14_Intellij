package Class23_Absrtraction_AND_Interfaces;

public abstract class Database {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends Database{

    @Override
    void openDatabase() {
        System.out.println("Opening the dataBase");
    }

    @Override
    void readData() {
        System.out.println("Reading the DataBase");
    }

    @Override
    void writeData() {
        System.out.println("Writing the DataBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the DataBase");
    }
}

class Oracle extends Database{

    @Override
    void openDatabase() {
        System.out.println("Reading");
    }

    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }

    @Override
    void closeDatabase() {

    }
}
