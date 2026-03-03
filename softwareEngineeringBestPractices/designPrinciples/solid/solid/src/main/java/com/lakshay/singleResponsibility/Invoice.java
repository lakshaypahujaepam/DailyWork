package com.lakshay.singleResponsibility;

//1️⃣ Single Responsibility Principle (SRP)


//✅ Correct – Separate responsibilities
//____________________________________________________
class Invoice {
    void calculateTotal() { /* calculation logic */ }
}

class InvoicePrinter {
    void print(Invoice invoice) { /* printing logic */ }
}

class InvoiceRepository {
    void save(Invoice invoice) { /* DB logic */ }
}
//____________________________________________________



//❌ Wrong – One class doing multiple jobs
//____________________________________________________
//public class Invoice {
//
//    public void calculateTotal(){}
//    public void printInvoice(){}
//    public void saveToDB(){}
//
//}
//____________________________________________________