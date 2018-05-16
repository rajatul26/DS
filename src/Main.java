public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        boolean markInactive=false;
        try {
            System.out.println(5/0);
        }catch (Exception ex){
             markInactive=true;
            throw new IllegalArgumentException("Argument 'divisor' is 0");

        }
        finally {
            if(markInactive)
            System.out.println("exiting ");
        }
    }

}
