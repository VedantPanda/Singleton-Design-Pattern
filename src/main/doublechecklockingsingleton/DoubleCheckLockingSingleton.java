package main.doublechecklockingsingleton;

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton doubleCheckLockingSingletonObj;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getDoubleCheckLockingSingletonInstance(){
        if(doubleCheckLockingSingletonObj==null){
            synchronized(DoubleCheckLockingSingleton.class){
                if(doubleCheckLockingSingletonObj==null){
                    doubleCheckLockingSingletonObj = new DoubleCheckLockingSingleton();
                }
            }
        }
        return doubleCheckLockingSingletonObj;
    }

}

/*
* So now if multiple threads try to access the getDoubleCheckLockingSingletonInstance() method locking and unlocking
* will now not happen everytime hence we have optimised the drawback of thread safe singleton lazy method when the
* method was synchronized which returned the object's instance.
* Now here we are using volatile keyword so that data is read directly from the memory instead of the cache.
* Since data is not being read from the cache in this case hence this method is also a bit slow.
* So to overcome this drawback the "Bill Pugh Solution" comes into the picture.
* */