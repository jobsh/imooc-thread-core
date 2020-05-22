package threadcoreknowledge.createthread;

public class RunnableStyle implements Runnable {
    public void run() {
        System.out.println("实现Runnable接口，实现run()方法");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
        // Runnable的另一种实现，代码中通常这样使用
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // 要执行的代码
                System.out.println("匿名内部类实现");
            }
        };
        runnable.run();

        // 将上面内容替换为lamda表达式
        Runnable runnable1 = (Runnable)() -> {
            System.out.println("lambda表达式实现");
        };
        runnable1.run();
    }
}
