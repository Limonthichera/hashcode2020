import java.util.Scanner;
import java.io.File;

public class FileRead
{
  private static Data read(String fileName) {
    File file = new File(fileName);
    Scanner sc = null;

    try {
      sc = new Scanner(file);
    } catch(Exception e) {
      System.out.println("'tis ded lol");
      return null;
    }

    Data myData = new Data();

    myData.numberOfBooks = sc.nextInt();
    myData.numberOfLibraries = sc.nextInt();
    myData.numberOfDays = sc.nextInt();

    for (int i = 0; i < myData.numberOfBooks; i++) {
      myData.bookValues.add(sc.nextInt());
    }

    int bookCount, booksPerDay, daysToRegister;
    Library lib;

    for (int libIdx = 0; libIdx < myData.numberOfLibraries; libIdx++) {
      bookCount = sc.nextInt();
      daysToRegister = sc.nextInt();
      booksPerDay = sc.nextInt();
      lib = new Library(bookCount, daysToRegister, booksPerDay);

      for (int bkIdx = 0; bkIdx < bookCount; bkIdx++) {
        lib.bookList.add(sc.nextInt());
      }

      myData.libraryList.add(lib);
    }
    return myData;
  }

  public static void main(String[] args) {
    Data myData = read(args[0]);
    System.out.println(myData);
  }
}
