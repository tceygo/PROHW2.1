package reflection;

public class Sample {


    @Testa(ab=2, ba=5 )
    public void test1 (int a, int b){
        System.out.println(a + " " + b);

    }

    @Testa(ab=20, ba=500 )
    public void test2 (int a, int b){
        System.out.println(a + " " + b);

    }

    @Testa(ab=10, ba=55 )
    public void test3 (int a, int b){
        System.out.println(a + " " + b);

    }
}
