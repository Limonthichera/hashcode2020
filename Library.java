import java.util.List;
import java.util.ArrayList;

public class Library
{
  public int daysToRegister;
  public int bookCount;
  public int booksPerDay;
  public List<Integer> bookList = new ArrayList<>();

  public Library(int _bookCount, int _booksPerDay, int _daysToRegister) {
    bookCount = _bookCount;
    booksPerDay = _booksPerDay;
    daysToRegister = _daysToRegister;
  }

  public String toString() {
    return "\n\t{daysToRegister: " + daysToRegister + ", booksPerDay: " + booksPerDay + ", bookList: " + bookList + "}";
  }
}
