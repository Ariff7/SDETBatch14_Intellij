package Class18_This_AND_Inhertance;

public class BookHW {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String title;
    String author;
    String type;
    int page;

   public BookHW(String title, String author){
        this.title=title;
        this.author=author;
        System.out.println("Name of book :" +title+","+ "Author is : "+author);
    }

    BookHW(String type, int page){
        this.type=type;
        this.page=page;
        System.out.println("Type of genre is "+ type+", and there are "+page+"pages");
    }

    public static void main(String[] args) {
        BookHW book1= new BookHW("Hamlet", "Shakespeare");
        BookHW book2=new BookHW("Drama ",76);
    }


}
