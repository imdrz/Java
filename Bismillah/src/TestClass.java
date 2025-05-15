public class TestClass {
    protected int var;
    // public TestClass() {
    //     var = 0;
    // }
    public TestClass(int v) {
        var = v;
    }

    public TestClass(String v) {
        var = Integer.valueOf(v);
        var a = 10;
    }

    protected int doSomething(int x) {
        return x * 2;
    }
}
