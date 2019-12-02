public class JunitTest {
    private String name;
    private int age;
    private double tall;

    public JunitTest(String name) {
        this.name = name;
    }

    public JunitTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public JunitTest(String name, double tall) {
        this.name = name;
        this.tall = tall;
    }

    public JunitTest(String name, int age, double tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "JunitTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                '}';
    }
}
