/**
 * @description 多线程
 * @author GongchuangSu
 * @since 2016.08.12
 * @explain 有4个线程和1个公共的字符数组。线程1的功能就是向数组输出A，线程2的功能就是向字符输出B，
 *          线程3的功能就是向数组输出C，线程4的功能就是向数组输出D。要求按顺序向数组赋值ABCDABCDABCD，
 *          ABCD的个数由线程函数1的参数指定。
 *          输入：输入一个int整数
 *          输出：输出多个ABCD
 *          样例：
 *              输入：10
 *              输出：ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD
 * @知识点 多线程
 */
import java.util.*;

class WriteThread implements Runnable {  
    private char[] content;  
  
    private int num;  
  
    private int count;  
  
    boolean success = false;  
  
    public WriteThread(int num) {  
        this.num = num * 4;  
        this.count = 0;  
        this.content = new char[this.num];  
    }  
  
    @Override  
    public void run() {  
        synchronized (this) {  
            while (count < num) {  
                String threadName = Thread.currentThread().getName();  
                char cont = 0;  
                int flag = -1;  
                if ("A".equals(threadName)) {  
                    flag = 0;  
                    cont = 'A';  
                } else if ("B".equals(threadName)) {  
                    flag = 1;  
                    cont = 'B';  
                } else if ("C".equals(threadName)) {  
                    flag = 2;  
                    cont = 'C';  
                } else if ("D".equals(threadName)) {  
                    flag = 3;  
                    cont = 'D';  
                }  
                if (count % 4 == flag) {  
                    // 如果是当前线程处理，则在当前线程处理之后，唤醒所有等待的线程，程序继续执行  
                    content[count] = cont;  
                    count++;  
                    super.notifyAll();  
                } else {  
                    try {  
                        // 如果目前不符合当前线程的执行条件，则将其置于等待状态，让其他非等待状态的线程来执行  
                        super.wait();  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
            }  
            success = true;  
        }  
    }  
  
    public char[] getContent() {  
        return content;  
    }  
} 

public class Main {

    public static String multiThreadWrite(int times) {  
        WriteThread wt = new WriteThread(times);  
        Thread t1 = new Thread(wt, "A");  
        Thread t2 = new Thread(wt, "B");  
        Thread t3 = new Thread(wt, "C");  
        Thread t4 = new Thread(wt, "D");  
        t1.start();  
        t2.start();  
        t3.start();  
        t4.start();  
        while (!wt.success) {  
  
        }  
        return new String(wt.getContent());   
    } 
	
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);      
        String str=multiThreadWrite(scan.nextInt());  
        System.out.println(str);
        scan.close();
    }
}