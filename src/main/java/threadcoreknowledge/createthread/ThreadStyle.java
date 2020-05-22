package threadcoreknowledge.createthread;

public class ThreadStyle extends Thread{

    @Override
    public void run() {
        System.out.println("extend Thread 创建线程");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
