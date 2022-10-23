package Class21_MethodOverRiding;

public class Car {

    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}

class BMW extends Car{

    void start(){  //method OverRiding
        System.out.println("Use the Push-To-Start to start me");
    }
    void stop(){
        super.stop();
        System.out.println("You can also use auto-breaking to stop me");
    }
}

class Toyota extends Car{

    void start() {
        System.out.println("Push me to start");
    }
}

class Tesla extends Car{
       void start(){
           System.out.println("Use the App to start me");
       }
       void stop(){
           System.out.println("Use AI and AutoBreaking to stop me");
       }
       void park(){
           System.out.println("I can auto park myself");
       }
}

