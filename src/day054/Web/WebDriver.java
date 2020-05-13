package day054.Web;

public interface WebDriver {
//WebDriver is general guide Line
    //WebDriver is contract
    public abstract void openBrowser();//void openBrowser(); are same
    public abstract void maximize();//void maximize(); is abstract automatically
    public abstract void closeBrowser();
    public abstract void navigateTo(String url);
}
