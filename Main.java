import java .util.*;
class Main{
public static void main(String[] args){
System.out.println("This is java program");
System.out.println("Output from java program");
System.out.println(new Date());

List<Integer> al = new ArrayList<Integer>();
al.add(15);
al.add(44);
al.add(32);
al.add(51);

al.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
al.stream().map(x->x*2).forEach(n->System.out.println("-------"+n));

System.out.println("Welcome again");

Student s=new Student();
s.Hello();
}
}