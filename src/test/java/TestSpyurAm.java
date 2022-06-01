import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

public class TestSpyurAm extends BaseTest{

    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @BeforeMethod
    public void initPages(){
        homePage = new HomePage();
        searchResultPage = new SearchResultPage();
    }

    @Test
    public void testHomePage(){
        homePage.get();
        homePage.doASearch("Ծրագրավորում");

//        int count = searchResultPage.numberOfResult();
//        Assert.assertTrue(count > 0);

//        Assert.assertTrue(homePage.getDriverCurrentUrl().contains("https://www.spyur.am/am/home/search/?"));

        searchResultPage.getAllSearchResults();
    }
}
