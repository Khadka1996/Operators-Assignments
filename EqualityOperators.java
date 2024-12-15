public class EqualityOperators {
    public static void main(String[] args) {

       Thread T1=new Thread();
       Thread T2=new Thread();
       Thread T3 = T1;
       System.out.println(T1==T2);  // false because both objects are different instances of Thread class.
       System.out.println(T1==T3);

       System.out.println("******************************");
       
        System.out.println(10==20);
        System.out.println('c'=='c');
        System.out.println('a'=='b');
        System.out.println(10==10);
        System.out.println('a'==97); // value of a changes from String to number and value of a is 97.
        System.out.println(false==true);
    }
}
