package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat - BBC");
        int seconds=0;
        while (seconds<=117){
            System.out.println(" Watching at second:" + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching video");
        System.out.println("Lets start another one !");
    }
}
