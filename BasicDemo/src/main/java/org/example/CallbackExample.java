package org.example;

public class CallbackExample {

    // 定义一个回调接口
    interface Callback {
        void call(String message);
    }

    // 外部类
    public void performAction(Callback callback) {
        System.out.println("Action performed.");
        // 调用回调函数
        callback.call("Hello from Callback!");
        System.out.println("Action completed.");
    }

    // 主函数
    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();

        // 创建外部类的实例
        CallbackExample outer = new CallbackExample();

        // 创建内部类的实例，实现回调接口
        Callback callback = outer.new InnerCallback();

        // 执行操作并传递回调
        outer.performAction(callback);
    }

    // 内部类实现回调接口
    class InnerCallback implements Callback {
        @Override
        public void call(String message) {
            System.out.println("Callback received: " + message);
        }
    }
}