package june_9_2022;

import java.util.Scanner;
import java.util.function.IntConsumer;

class FizzBuzz
{
    private int n;
    int number=1;
    public  FizzBuzz(int n)
    {
        this.n=n;
    }

    public synchronized void fizz(Runnable printFizz) throws InterruptedException
    {
        while (number<=n)
        {
            if(number%3==0 && number%5!=0)
            {
                printFizz.run();
                number++;
                notifyAll();
            }
            else {
                wait();
            }
        }
    }
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException
    {
        while (number<=n)
        {
            if(number%3!=0 && number%5==0)
            {
                printBuzz.run();
                number++;
                notifyAll();
            }
            else
            {
                wait();
            }
        }
    }
    public synchronized void fizzBuzz(Runnable printFizzBuzz) throws InterruptedException
    {
        while (number<=n)
        {
            if(number%5==0 && number%3==0)
            {
                printFizzBuzz.run();
                number++;
                notifyAll();
            }
            else
            {
                wait();
            }
        }
    }
    public synchronized void number(IntConsumer printNumber) throws InterruptedException
    {
        while (number<=n)
        {
            if(number%3!=0 && number%5!=0)
            {
                printNumber.accept(number);
                number++;
                notifyAll();
            }
            else
            {
                wait();
            }
        }
    }
}

public class Q46FizzBuzzMultiThread {

    public static void main(String[] args) {

        Runnable printFizz=()-> System.out.println("fizz");
        Runnable printBuzz=()-> System.out.println("buzz");
        Runnable printFizzBuzz=()-> System.out.println("fizzbuzz");
        IntConsumer printNumber=(number)-> System.out.println(number);

        System.out.println("Enter n value");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        FizzBuzz fizzBuzz=new FizzBuzz(n);

        Thread A=new Thread(){
          public void run()
          {
              try {
                  fizzBuzz.fizz(printFizz);
              }
              catch (InterruptedException exception)
              {
                  System.out.println(exception);
              }
          }
        };
        Thread B=new Thread(){
            public void run()
            {
                try {
                    fizzBuzz.buzz(printBuzz);
                }
                catch (InterruptedException exception)
                {
                    System.out.println(exception);
                }
            }
        };
        Thread C=new Thread(){
            public void run()
            {
                try {
                    fizzBuzz.fizzBuzz(printFizzBuzz);
                }
                catch (InterruptedException exception)
                {
                    System.out.println(exception);
                }
            }
        };
        Thread D=new Thread(){
            public void run()
            {
                try {
                    fizzBuzz.number(printNumber);
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
        D.start();
    }
}
