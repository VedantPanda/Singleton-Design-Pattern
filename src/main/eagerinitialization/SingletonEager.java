package main.eagerinitialization;

public class SingletonEager {

    private static SingletonEager singletonEagerObj = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getSingletonEagerInstance(){
        return singletonEagerObj;
    }

}

/*
* Drawback of Eager Initialization
* When the application is loaded the object of this class will be created.
* Even when the object of this class is not required the object will still be created.
* So to overcome this drawback the “lazy initialization method comes into the picture.”
* */