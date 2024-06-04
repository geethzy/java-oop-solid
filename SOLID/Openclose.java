package SOLID;

public class Openclose {

}

class InvoicePersistenc {
    Invoice invoice;

    public InvoicePersistenc(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }
}

// **********************HOW TO CORRECT*********************
interface InvoicePersistence {
    public void save(Invoice invoice);
}

class DatabasePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}

class FilePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}