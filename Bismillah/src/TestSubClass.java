public class TestSubClass extends TestClass {
    protected int chicken;

    public TestSubClass(int c) {
        super(c);
        chicken = c;
    }

    // protected int doSomething(int s) {
    //     return super.doSomething(s);
    // }

    protected int doSomething(String x) {
        return super.doSomething(10);
    }
}
