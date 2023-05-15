import org.testng.annotations.Test;

public class TestNG {
    @Test (groups = {"Group A"})
    public void test1 () {
        System.out.println("test1");
    }
    @Test (groups = {"Group B"})
    public void test2 () {
        System.out.println("test2");
    }
    @Test (groups = {"Group A","Group B"})
    public void test3 () {
        System.out.println("test3");
    }
    @Test (groups = {"Group C"})
    public void test4 () {
        System.out.println("test4");
    }
}
