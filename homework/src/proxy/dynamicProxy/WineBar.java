package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WineBar implements InvocationHandler {

    private Object real;

    public WineBar(Object real) {
        this.real = real;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("酒吧: " + this.getClass().getName() + "开始营业···");
        method.invoke(real, args);
        System.out.println("酒吧打烊了···");
        return null;
    }
}
