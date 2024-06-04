package SOLID;

public class Dependency {
}

// dependencies to depend on interfaces instead of
// concrete classes.
// Our PersistenceManager class
// depends on InvoicePersistence
// instead of the classes that implement
// that interface.

interface BookPersistence {
    public void save(Invoice invoice);
}

interface InvoicePersistence {
    public void save(Invoice invoice);
}

class PersistenceManager {
    InvoicePersistence invoicePersistence;
    BookPersistence bookPersistence;

    public PersistenceManager(InvoicePersistence invoicePersistence,
            BookPersistence bookPersistence) {
        this.invoicePersistence = invoicePersistence;
        this.bookPersistence = bookPersistence;
    }
}