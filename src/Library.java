import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Library extends Book {

    Set<Book> books = new HashSet<>();

    public Library(String title, String author, String publishDate, String category, int quantity) {
        super(title, author, publishDate, category, quantity);
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void searchForBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi alapján keresel? Írd be a megfelelő számot ! 1.író\n2.cím\n3.műfaj");
        int choosedNumber = scanner.nextInt();
        if (choosedNumber == 1) {
            System.out.println("Írd be az író nevét");
            Scanner searchedAuthor = new Scanner(System.in);
            for (Book book : books) {
                if (book.getAuthor().equals(searchedAuthor)&& book.getQuantity()>0) {
                    System.out.println("Az író által írt, a könyvtárban elérhető könyv: " + book.toString());
                }
                System.out.println();
            }

        }
        if (choosedNumber == 2) {
            System.out.println("Írd be a könyv címét");
            Scanner searchedTitle = new Scanner(System.in);
            for (Book book : books) {
                if (book.getTitle().equals(searchedTitle) && book.) {
                    System.out.println(" A kért cím alapján a könyvtárban elérhető könyv: " + book.toString());
                }
                System.out.println();

            }

        } else {
            System.out.println();
        }
        if (choosedNumber == 3) {
            System.out.println("Írd be a keresett műfajt");
            Scanner searchedCategory = new Scanner(System.in);
            for (Book book : books) {
                if (book.getCategory().equals(searchedCategory)) {
                    System.out.println(" A kért műfaj alapján a könyvtárban elérhető könyv: " + book.toString());
                }
                System.out.println();
            }

        }


    }

    public void borrowBook() {

    }


}
