public class Main {

    public static void main(String[] args) {

        Author dostoevsky = new Author("Фёдор ", "Достоевский");
        Book prestuplenie = new Book("Преступление и наказание", dostoevsky.getAuthorName() + dostoevsky.getAuthorSurname(), 1866);
        System.out.println("prestuplenie.bookName = " + prestuplenie.getBookName());
        System.out.println("prestuplenie.bookAuthor = " + prestuplenie.getBookAuthor());
        System.out.println("prestuplenie.bookYear = " + prestuplenie.getBookYear());

//        System.out.println("dostoevsky.surname = " + dostoevsky.authorSurname);
//        System.out.println("dostoevsky.name = " + dostoevsky.authorName);
//        prestuplenie.bookName = "Преступление и наказание";
//        prestuplenie.bookAuthor = dostoevsky.authorName + dostoevsky.authorSurname;
//        prestuplenie.bookYear = 1866;

        System.out.println();
        Author ostrovsky = new Author("Александр ", "Островский");
        Book groza = new Book("Гроза", ostrovsky.getAuthorName() + ostrovsky.getAuthorSurname(), 1859);
        System.out.println("groza.bookName = " + groza.getBookName());
        System.out.println("groza.bookAuthor = " + groza.getBookAuthor());
        System.out.println("groza.bookYear = " + groza.getBookYear());
        groza.setBookYear(1861);
        System.out.println("groza.getBookYear = " + groza.getBookYear());




    }
}