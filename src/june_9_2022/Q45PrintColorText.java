package june_9_2022;

class ColorThread extends Thread{

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_RESET = "\u001B[0m";

    public void textColourYellow()
    {
        System.out.println(ANSI_YELLOW + " This text is for text yellow"+ANSI_RESET );
    }
    public void textColourGreen()
    {
        System.out.println(ANSI_GREEN + " This text is for text green"+ANSI_RESET );
    }
    public void textColourRed()
    {
        System.out.println(ANSI_RED + " This text is for text red"+ANSI_RESET);
    }

    public void run()
    {
       textColourGreen();;
       textColourYellow();
       textColourRed();
    }
}

public class Q45PrintColorText {
    public static void main(String[] args) {
        ColorThread thread1=new ColorThread();
        ColorThread thread2=new ColorThread();
        ColorThread thread3=new ColorThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
