package main.lazyinitialization;

public class SingletonLazy {

    private static SingletonLazy singletonLazyObj;

    private SingletonLazy(){}

    public static SingletonLazy getSingletonLazyInstance(){
        if(singletonLazyObj==null){
            singletonLazyObj = new SingletonLazy();
        }
        return singletonLazyObj;
    }

}

/*
* Lazy initialization solves the drawback of eager initialization.
* But drawback of eager initialization is that when 2 threads T1 and T2 access the
* getSingletonLazyInstance() method at the same time and both read singletonLazyObj==null
* then 2 instances of this class would be created.
* So this approach is not thread safe.
* So to overcome this drawback the “thread safe lazy initialization method comes into the picture.”
* */