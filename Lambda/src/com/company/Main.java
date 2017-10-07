package com.company;

public class Main {

    public void doItTheOldWay(){
        MyFunctionalInterface objImplementation = new MyFunctionalInterface(){
            @Override
            public void doSomething(String txt){
                System.out.println(txt);
            }
        };
        objImplementation.doSomething("Hello in the old way");
    }

    public void doItWhitLambdas(){
        MyFunctionalInterface objImplementationOne = (String x) -> System.out.println(x);
        objImplementationOne.doSomething("Hello from lambda fashion");

        MyFunctionalInterface objImplementationTwo = x -> System.out.println(x);
        objImplementationTwo.doSomething("Hello from short syntax");

        MyFunctionalInterface objImplementationThree = objImplementationThree = x -> {
            System.out.println("Hello from complex syntax");
            System.out.println(x);
            System.out.println("Bye from complez syntax");
        };
        objImplementationThree.doSomething("Regular code in the complex syntax");

        doSomethingHighOrder(objImplementationThree);
    }
    /**
     * function that receives behaviour as parameter(high order)
     * @param behaviour
     */
    public void doSomethingHighOrder(MyFunctionalInterface behaviour){
        behaviour.doSomething("in high order way");
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();

        mainInstance.doItTheOldWay();
        mainInstance.doItWhitLambdas();

        MyFunctionalInterface aBehaviour = System.out::println;

        MyFunctionalInterface bBehaviour = x -> {
            x = "Doing something ".concat(x);
            System.out.println(x);
            System.out.println("Making Java great again");
        };
        mainInstance.doSomethingHighOrder(bBehaviour);
    }
}
