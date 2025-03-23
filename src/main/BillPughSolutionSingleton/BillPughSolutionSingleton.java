package main.BillPughSolutionSingleton;

public class BillPughSolutionSingleton {

    private BillPughSolutionSingleton(){}

    private static class Singleton{
        private static final BillPughSolutionSingleton INSTANCE_OBJECT = new BillPughSolutionSingleton();
    }

    public static BillPughSolutionSingleton getBillPughSolutionSingletonInstance(){
        return Singleton.INSTANCE_OBJECT;
    }

}

/*
* Bill Pugh's solution solves the problem of eager initialisation as well as thread safety.
* Inner classes are not loaded into the memory when the application starts.
* Inner classes are only loaded into the memory when they are referred.
* Also, java's class loader guarantees that the class is initialized only once in a thread safe manner.
* So this is one of the best ways to create a singleton class i.e. thread safe as well as fast.
* */