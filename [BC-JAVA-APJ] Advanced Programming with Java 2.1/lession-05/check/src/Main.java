abstract class oldMain{
   abstract void oldMain();
}
public class Main extends oldMain {
    Main(){
        System.out.println("abc") ;
    }
    public static void main(String args[]) {
        oldMain d = new Main();
        System.out.println(d instanceof Main);// false
    }
}