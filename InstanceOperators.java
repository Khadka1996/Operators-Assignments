public class InstanceOperators {
    public static void main (String[] args){
         Thread t= new Thread();
         System.out.println(t instanceof Thread);
         System.out.println(t instanceof Object);
         System.out.println(t instanceof Runnable);
         System.out.println(null instanceof Runnable);
         System.out.println(null instanceof Object);
         System.out.println(null instanceof Thread);
    }
}
