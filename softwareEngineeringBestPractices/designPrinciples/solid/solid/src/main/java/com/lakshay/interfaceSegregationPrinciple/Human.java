package com.lakshay.interfaceSegregationPrinciple;

//4️⃣ Interface Segregation Principle (ISP)

//✅ Correct – Split interfaces
//✔ No class forced to implement unnecessary methods.

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human Working.");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating.");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot Working.");
    }
}





//❌ Wrong – Fat interface
//____________________________________________________
//interface Worker {
//    void work();
//    void eat();
//}

//class Robot implements Worker {
//    public void work() { }
//    public void eat() { throw new UnsupportedOperationException(); }
//}
//____________________________________________________