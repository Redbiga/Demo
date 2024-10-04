package org.example;

/**
 * @author redA
 * @时间: 2024年09月15日 上午10:38
 */
interface Info<T> {
    T info(T var);
    void f(String s);
}
public class InfoClass implements Info<Integer>{
    @Override
    public Integer info(Integer var) {
        return var;
    }
    @Override
    public void f(String s) {
        System.out.println(s);
    }

}