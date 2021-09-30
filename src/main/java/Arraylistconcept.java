import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistconcept {

//    ArrayList <Object> al = new ArrayList<Object>();
//    al.add("Heelo");
//    al.add('j');
//    al.add(90);
//    al.add(8.8);
public static void main(String[] args) {
 ArrayList<String> students = new ArrayList<String>();
    students.add("Stve");
    students.add("Meve");
    students.add("Bhav");
    students.add("Lio");
   for (int i =0;i<students.size()-1;i++){
       System.out.println("data is "+ students.get(i));
    }
System.out.println("*****************");
    for(String s : students){
        System.out.println("data is "+s);
    }
    System.out.println("*****************");
   Iterator<String> it = students.iterator();
    while (it.hasNext()){
        System.out.println("data is "+it.next());
    }
}

}
