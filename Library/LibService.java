package Library;

public class LibService {

}
class LibraryCard{
    public String cardNumber;
    public String barcode;
    public String issuedAt;
    boolean active;
}

class BookLending{
    public String creationDate;
    public String dueData;
    private int issueDate ;
    private int returnDate;
}

class Library{
    private String name;
    private String address;
}



class Librarian {
    boolean addBookItem() {
        return false;
    }

    boolean blockMember() {
        return false;
    }

    boolean unblockMember() {
        return false;

    }
}

class Member {
    public void dateOfMembership() {

    }

    public void totalBooksCheckout() {

    }
}
