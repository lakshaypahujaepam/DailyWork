package com.lakshay.liskovSubstitutionPrinciple;

//3️⃣ Liskov Substitution Principle (LSP)

//✅ Correct – Proper abstraction
//✔ Subclasses don’t break parent behavior.

abstract class Bird { }

interface Flyable{
    void fly();
}

class Sparrow extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Sparrow Flying.");
    }
}

class Ostrich extends Bird{
//    not flyable because Ostrich's can't fly
}


//❌ Wrong – Violates LSP

//____________________________________________________
//class Bird {
//    void fly() { }
//}
//
//class Ostrich extends Bird {
//    void fly() {
//        throw new UnsupportedOperationException();
//    }
//}
//____________________________________________________
