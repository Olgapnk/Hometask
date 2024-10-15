public class TestClass {

    private static TestClass instance;

    private TestClass(){}

    public static TestClass getInstance(){
        if (instance==null){
            instance = new TestClass();
        }
        return instance;
    }
}
