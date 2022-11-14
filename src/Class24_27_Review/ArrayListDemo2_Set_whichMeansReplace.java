package Class24_27_Review;

import java.util.ArrayList;

public class ArrayListDemo2_Set_whichMeansReplace {
    public static void main(String[] args) {
        ArrayList<String> animals =new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");

        //replace animal with more than 4 letters that with Camel

        //1.)we should NOT sue Iterator bc we are not peforming any operation that can change the size of the list
        //2.) we should NOT use enchanced forLoop bc we are not printing the data ,we are updating the data
        //bc we need the index to update the data


        for (int i=0; i< animals.size(); i++){
            if(animals.get(i).length()>4){
                animals.set(i,"Camel");
            }
        }
        System.out.println(animals); //[Dog, Cat, Lion, Camel, Camel, Camel, Camel]

    }
}
