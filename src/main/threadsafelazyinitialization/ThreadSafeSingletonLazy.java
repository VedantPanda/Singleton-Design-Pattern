package main.threadsafelazyinitialization;

public class ThreadSafeSingletonLazy {

    private static ThreadSafeSingletonLazy threadSafeSingletonLazyObj;

    private ThreadSafeSingletonLazy(){}

    public static synchronized ThreadSafeSingletonLazy getThreadSafeSingletonLazyInstance(){
        if(threadSafeSingletonLazyObj==null){
            threadSafeSingletonLazyObj = new ThreadSafeSingletonLazy();
        }
        return threadSafeSingletonLazyObj;
    }

}

/*
 * Making the method getThreadSafeSingletonLazyInstance() synchronized makes it thread safe, now we are sure that
 * only one instance of this class will be created even if multiple threads try to access it simultaneously.
 * Drawback of this is that it is too slow, suppose 50 different classes or threads are invoking this method then
 * in that case again and again there would be locking and unlocking because of the synchronized keyword hence this
 * makes the application very slow.
 * So to overcome this drawback the “double check locking method comes into the picture.”
* */
