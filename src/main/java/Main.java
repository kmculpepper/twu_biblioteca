/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Main {

    public static void main (String [] args){
        Application application = new Application(System.out);
        Library library = new Library();
        application.start();
        application.printBooks(library);
    }
}
