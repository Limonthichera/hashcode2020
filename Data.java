import java.util.List;
import java.util.ArrayList;

public class Data
{
  public int numberOfBooks;
  public int numberOfLibraries;
  public int numberOfDays;
  public List<Library> libraryList = new ArrayList<>();
  public List<Integer> bookValues = new ArrayList<>();

  public String toString() {
    String myString = "numberOfBooks: " + numberOfBooks;
    myString += "\nnumberOfLibraries: " + numberOfLibraries;
    myString += "\nnumberOfDays: " + numberOfDays;

    myString += "\nbookValues: " + bookValues;
    myString += "\nlibraryList: " + libraryList;

    return myString;
  }
}
