package le;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Phuc Hong Le
 */
public class HashSetPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"Alibaba", "Cow", "BatMan", "DogMan", "Eggs"};
        HashSet<String> s = new HashSet<>();
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < names.length; i++) {
            s.add(names[i]);
            ls.add(names[i]);
            ts.add(names[i]);
        }
        Iterator<String> itrS = s.iterator();
        Iterator<String> itrLS = ls.iterator();
        Iterator<String> itrTS = ts.iterator();
        System.out.println("Hash Set List-----------------");
        for (String p : s) {
            System.out.print(itrS.next() + " ");
        }
        System.out.println("\nLinked Hash Set List----------");
        for (String p : ls) {
            System.out.print(itrLS.next() + " ");
        }
        System.out.println("\nTree Set List-----------------");
        for (String p : ts) {
            System.out.print(itrTS.next() + " ");
        }
        System.out.println();
    }

}
