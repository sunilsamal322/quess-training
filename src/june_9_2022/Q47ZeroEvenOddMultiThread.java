package june_9_2022;

import java.util.Scanner;
import java.util.function.IntConsumer;

class ZeroEvenOdd{

    private int n;
    public ZeroEvenOdd(int n) {
        this.n = n;
    }
    int number =1;
    int countLength=0;
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException
    {
       for(int zeroCount=1;zeroCount<=n;)
       {
           if(countLength%2==0)
           {
               printNumber.accept(0);
               countLength++;
               zeroCount++;
               notifyAll();
           }
           else {
               wait();
           }
       }
    }
    public synchronized void even(IntConsumer printNumber) throws InterruptedException
    {
       while (number <=n)
       {
           if(number %2==0)
           {
               printNumber.accept(number);
               number++;
               countLength++;
               notifyAll();
           }
           else {
               wait();
           }
       }
    }
    public synchronized void odd(IntConsumer printNumber) throws InterruptedException
    {
        while (number <=n)
        {
            if(number %2!=0)
            {
                printNumber.accept(number);
                number++;
                countLength++;
                notifyAll();
            }
            else
            {
                wait();
            }
        }
    }
}

public class Q47ZeroEvenOddMultiThread {

    public static void main(String[] args) {

        IntConsumer printNumber=(number)-> System.out.print(number);

        System.out.println("Enter n value");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        ZeroEvenOdd zeroEvenOdd=new ZeroEvenOdd(n);

        Thread A=new Thread(){
            @Override
            public void run() {
                try {
                    zeroEvenOdd.zero(printNumber);
                }
                catch (InterruptedException exception)
                {
                    System.out.println(exception);
                }
            }
        };
        Thread B=new Thread(){
            @Override
            public void run() {
                try {
                    zeroEvenOdd.even(printNumber);
                }
                catch (InterruptedException exception)
                {
                    System.out.println(exception);
                }
            }
        };
        Thread C=new Thread()
        {
            public void run()
            {
                try {
                    zeroEvenOdd.odd(printNumber);
                }
                catch (InterruptedException exception)
                {
                    System.out.println(exception);
                }
            }
        };
        A.start();
        B.start();
        C.start();
    }

}
