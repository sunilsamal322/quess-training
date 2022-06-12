package june_10_2022;

import java.util.Scanner;

class OxygenHydrogenGenerator {

    private String water;

    private int H=0;
    private int O=0;

    private int totalH=0;
    private int totalO=0;

    public OxygenHydrogenGenerator(String water)
    {
        this.water=water;
        for(int i=0;i<water.length();i++) {
            if (water.charAt(i) == 'H')
            {
                totalH++;
            }
            else{
                totalO++;
            }
        }
    }
    public synchronized void releaseHydrogen(Runnable printHydrogen) throws InterruptedException
    {
      x: while(totalH!=0 || totalO!=0)
       {
           while(this.H ==2)
           {
               this.wait();
           }
           this.H++;
           printHydrogen.run();
           if(this.H ==2 && this.O ==1)
           {
               H =0;
               O =0;
               totalH-=2;
               totalO-=1;
           }
           else if(this.H ==1) {
               continue x;
           }
           else {
               notify();
           }
       }
    }
    public synchronized void releaseOxygen(Runnable printOxygen) throws InterruptedException
    {
          while (totalH!=0 || totalO!=0)
          {
              while (this.O ==1)
              {
                  wait();
              }
              this.O++;
              printOxygen.run();
              if(this.H ==2 && this.O ==1)
              {
                  H =0;
                  O =0;
                  totalH-=2;
                  totalO-=1;
              }
              else {
                  notify();
              }
          }
    }

}

public class Q48BuildingH2OMultiThread {

    public static void main(String[] args) {

        Runnable printHydrogen=()-> System.out.print('H');
        Runnable printOxygen=()-> System.out.print('O');

        System.out.println("Enter String for water only 'H' and 'O' are allowed");
        Scanner scan=new Scanner(System.in);
        String water= scan.next();
        int totalH=0,totalO=0;
        for(int i=0;i<water.length();i++)
        {
            if(water.charAt(i)=='H')
            {
                totalH++;
            }
            else if(water.charAt(i)=='O')
            {
                totalO++;
            }
            else {
                System.out.println("only 'H' and 'O' are allowed ");
                return;
            }
        }
        if(totalH!=totalO*2)
        {
            System.out.println("There should be exactly double 'H' present comparing to 'O'");
            return;
        }

        System.out.println("Formed water molecules are - ");
        OxygenHydrogenGenerator oxygenHydrogen=new OxygenHydrogenGenerator(water);


        Thread oxygenThread=new Thread(){
            public void run()
            {
               try
               {
                   oxygenHydrogen.releaseOxygen(printOxygen);
               }
               catch (InterruptedException exception)
               {
                   System.out.println(exception);
               }
            }
        };
        Thread hydrogenThread=new Thread(){
            public void run()
            {
                try
                {
                    oxygenHydrogen.releaseHydrogen(printHydrogen);
                }
                catch (InterruptedException exception)
                {
                    System.out.println(exception);
                }
            }
        };
        oxygenThread.start();
        hydrogenThread.start();
    }
}
