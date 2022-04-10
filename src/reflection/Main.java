package reflection;

import java.lang.reflect.Method;
import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        Sample a = new Sample();
        final Class<?> cls = Sample.class;

        if(cls.isAnnotationPresent(Testa.class)){
            System.out.println("ok");
        }

        Method [] methods = cls.getMethods();
        for (Method method: methods){
            if(method.isAnnotationPresent(Testa.class)){
                Testa an = method.getAnnotation(Testa.class);
                a.test1( an.ab(), an.ba());

            }
        }

    }
}
