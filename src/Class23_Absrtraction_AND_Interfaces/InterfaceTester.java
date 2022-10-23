package Class23_Absrtraction_AND_Interfaces;

public class InterfaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase=new IBM();
        iDataBase.openDatabase();
        iDataBase.readData();
        iDataBase.writeData();



    }
}
