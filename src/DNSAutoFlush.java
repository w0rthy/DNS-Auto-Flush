package dns.auto.flush;

import java.io.IOException;

public class DNSAutoFlush {

    public static void main(String[] args) throws IOException, InterruptedException {
        while(true)
            start();
    }
    
    public static void start() throws IOException, InterruptedException
    {
        Runtime.getRuntime().exec("cmd /c ipconfig /flushdns");
        yieldSleep(1000*30);
    }

    private static void yieldSleep(int i) throws InterruptedException {
        int b = i;
        while(b>0){
            Thread.sleep(100);
            Thread.yield();
            b-=100;
        }
    }
}
