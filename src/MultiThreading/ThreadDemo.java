package MultiThreading;
class savingAcc
{
    public int c = 0;
    public  synchronized void withDraw(String name)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("LIII "+name);
            c++;
        }
    }
    public int getC()
    {
        return  c;
    }
}
class threadA extends Thread
{
    savingAcc s;
    String name;
    threadA(savingAcc s,String name)
    {
        this.s =s;
        this.name = name;
    }
    @Override
    public void run()
    {
        s.withDraw(name);
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        savingAcc s = new savingAcc();
        threadA t1 = new threadA(s,"mama");
        threadA t12 = new threadA(s,"me");
        t12.start();
        t1.start();

        t12.join();
        t1.join();
        System.out.println(t1.s.c);
    }
}
