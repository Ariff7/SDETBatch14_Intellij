package Class14_Methods;

public class MethodsDemo1 {

    void printManyTimes(int times){
            for(int i=0; i<times; i++){
                System.out.println("Hello Java");
            }
        }

      void printCustomWordManyTimes(String word, int times){
        for(int i=0; i<=times; i++){
            System.out.println(word);
        }
      }

    public static void main(String[] args) {
        MethodsDemo1 variable=new MethodsDemo1();

        variable.printManyTimes(2);
        variable.printCustomWordManyTimes("Syntax is easy",3);
    }

    }
