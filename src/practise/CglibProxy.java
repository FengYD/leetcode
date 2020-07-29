package practise;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author fengyadong001
 * @date 2020/7/7 4:36 PM
 * @description
 */
public class CglibProxy {

    interface Hello{
        void hello();
    }

    static class HelloImpl implements Hello {
        @Override
        public void hello() {
            System.out.println("Hello World!");
        }

        public void test() {
            System.out.println("test!");
        }
    }

    static class HelloProxy implements MethodInterceptor {
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("before calling method:" + method.getName());
            proxy.invokeSuper(obj, args);
            System.out.println("after calling method:" + method.getName());
            return null;
        }
    }

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        HelloProxy helloProxy = new HelloProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(hello.getClass());
        enhancer.setCallback(helloProxy);
        Hello hello1 = (Hello) enhancer.create();
        hello1.hello();
        HelloImpl hello2 = (HelloImpl) enhancer.create();
        hello2.test();
    }

}