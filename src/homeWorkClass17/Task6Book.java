package homeWorkClass17;

public class Task6Book {

    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed


    String book;
    String author;

    int pages;

    Task6Book(String bookTitle,String authorName, int noOfPages){
        book=bookTitle;
        author=authorName;
        pages=noOfPages;

    }

    Task6Book(String author2Name, int no2OfPages, String book2Title){
        author=author2Name;
        pages=no2OfPages;
        book=book2Title;
    }
    void bookDetails(){
        System.out.println("The book "+book+ " was written by "+author+" and it's number of pages is "+pages);
    }
}
