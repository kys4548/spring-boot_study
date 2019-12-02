import org.junit.*;

import static org.junit.Assert.*;

public class JunitTestTest {
    public static JunitTest junitTest;

    @BeforeClass
    public static void makeInstance()throws Exception {
        System.out.println("BEFORE CLASS");
        junitTest = new JunitTest("홍길동",20,180);
    }

    @Before
    public void beforeTest()throws Exception {
        System.out.println("before!!");
    }

    @Test
    public void getName() throws Exception {
        assertEquals("홍길동",junitTest.getName());
    }

    @Test
    public void getAge()throws Exception {
        assertEquals(20,junitTest.getAge());
    }

    @Test
    public void getTall() throws Exception{
        assertEquals(180, junitTest.getTall());
    }

    @After
    public void printAfter()throws Exception {
        System.out.println("After!!");
    }

    @AfterClass
    public static void printAfterClass()throws Exception {
        System.out.println("AFTER CLASS");
    }
}
