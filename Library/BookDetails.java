package Library;

public class BookDetails {
    private String title;
    private String subject;
    public String publisher;
    public String language;
    public int numberOfPages;
    public String genre;

    public BookDetails(String title, String subject, String publisher, String language, String genre, int numberOfPages) {
    }
    public String getTitle () {
        return title;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getSubject () {
        return subject;
    }

    public void setSubject (String subject){
        this.subject = subject;
    }

    public String getPublisher () {
        return publisher;
    }

    public void setPublisher (String publisher){
        this.publisher = publisher;
    }

    public String getLanguage () {
        return language;
    }

    public void setLanguage (String language){
        this.language = language;
    }

    public int getNumberOfPages () {
        return numberOfPages;
    }

    public void setNumberOfPages ( int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public String getGenre () {
        return genre;
    }

    public void setGenre (String genre){
        this.genre = genre;
    }
}
class Author{
    private String authorName;
    private String description;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
class BookItem {
    public String barcode;
    boolean isReferenceOnly;
    public String borrowed;
    public String dueDate;
    public double price;
    public String format;
    public String status;
    public String dateOfPurchase;
    public String publicationDate;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public void setReferenceOnly(boolean referenceOnly) {
        isReferenceOnly = referenceOnly;
    }

    public String getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

}
