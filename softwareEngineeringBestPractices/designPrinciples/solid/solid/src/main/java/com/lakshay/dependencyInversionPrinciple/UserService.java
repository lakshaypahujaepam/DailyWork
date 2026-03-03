package com.lakshay.dependencyInversionPrinciple;

//5️⃣ Dependency Inversion Principle (DIP)
//✅ Correct – Depend on abstraction
//✔ Now you can switch DB without modifying UserService.

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("saved to MySQL");
    }
}

class PostgreSQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("saved to PostgreSQL");
    }
}

public class UserService {
    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    void saveUser(String user) {
        database.save(user);
    }
}




//❌ Wrong – High-level depends on low-level
//-------------------------------------------------
//class MySQLDatabase {
//    void save(String data) { }
//}
//
//class UserService {
//    private MySQLDatabase db = new MySQLDatabase();
//    void saveUser(String user) {
//        db.save(user);
//    }
//}
//-------------------------------------------------