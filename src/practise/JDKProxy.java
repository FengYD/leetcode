package practise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fengyadong001
 * @date 2020/7/7 3:54 PM
 * @description
 */
public class JDKProxy {

    interface HelloService{
        void hello();
    }

    static class HelloServiceImpl implements HelloService {
        @Override
        public void hello() {
            System.out.println("Hello World!");
        }

        public void test() {
            System.out.println("test!");
        }
    }

    static class HelloProxy implements InvocationHandler{
        private Object target;

        HelloProxy(Object target) {
            this.target = target;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("start hello");
            Object result = method.invoke(target, args);
            System.out.println("end hello");
            //这里返回了void
            return result;
        }
    }

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloProxy helloProxy = new HelloProxy(helloService);
        //构造代理类使用的是实现类class[
        HelloService helloServiceProxy = (HelloService) Proxy.newProxyInstance(helloService.getClass().getClassLoader(), new Class[]{HelloService.class}, helloProxy);
        HelloService helloServiceProxy2 = (HelloService) Proxy.newProxyInstance(HelloServiceImpl.class.getClassLoader(), HelloServiceImpl.class.getInterfaces(), helloProxy);
        helloServiceProxy.hello();
        helloServiceProxy2.hello();
        //这里报错
        //HelloServiceImpl helloServiceProxy3 = (HelloServiceImpl) Proxy.newProxyInstance(helloService.getClass().getClassLoader(), helloService.getClass().getInterfaces(), helloProxy);
        //helloServiceProxy3.test();
    }

}