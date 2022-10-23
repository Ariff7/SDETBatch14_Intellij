package Class23_Absrtraction_AND_Interfaces;

public class DatBaseTester {
    public static void main(String[] args) {
        Database dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
