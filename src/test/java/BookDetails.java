import org.openqa.selenium.WebElement;

import java.util.List;

public class BookDetails extends Base
{
    public static void fillArr(List<WebElement> list)
    {
        for (int i = 0; i < books.length; i++) {
            books[i].setTitle(list.get(i).);

        }
    }


}
