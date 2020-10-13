package com.cjl.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //创建真实对象
        Lenovo lenovo = new Lenovo();

//        String computer = lenovo.sale(8000);
//        System.out.println(computer);


        //动态代理增强Lenovo对象
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(),
                lenovo.getClass().getInterfaces(), new InvocationHandler() {


                    /**
                     * 代理逻辑编写的方法：代理对象调用的所有方法都是触发该方法
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("该方法执行了...");

                        //增强方法体
                        if (method.getName().equals("sale")) {

                            //增强参数
                            double money = (double) args[0];
                            money = money * 0.9;

                            //增强返回值
                            String str = (String) method.invoke(lenovo, money);
                            return str + "_鼠标垫";
                        } else {
                            return method.invoke(lenovo, args);
                        }

                    }
                });


//        String computer_2 = proxy_lenovo.sale(8000);
//        System.out.println(computer_2);
        String computer = proxy_lenovo.sale(1000);
        System.out.println(computer);
    }
}
