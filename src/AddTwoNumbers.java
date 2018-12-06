import java.util.*;

/* You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
 */

public class AddTwoNumbers {

    public static void main(String[] args) {
        LinkedList<Integer> num1 = new LinkedList<>();
        LinkedList<Integer> num2 = new LinkedList<>();
        num1.add(2);
        num1.add(4);
        num1.add(3);
        num2.add(0);
        num2.add(5);
        num2.add(6);
        num2.add(4);
        ListIterator<Integer> list1 = num1.listIterator();
        ListIterator<Integer> list2 = num2.listIterator();
        while (list1.hasNext())
            System.out.print(list1.next());
        System.out.println();
        while (list2.hasNext())
            System.out.print(list2.next());
        LinkedList<Integer> finalNum = add(num1, num2);
        ListIterator<Integer> fN = finalNum.listIterator();
        System.out.println();
        while (fN.hasNext())
            System.out.print(fN.next());
    }

    public static LinkedList<Integer> add(LinkedList l1, LinkedList l2) {
        String num1 = "";
        String num2 = "";
        ListIterator<Integer> list1 = l1.listIterator();
        while (list1.hasNext()) {
            num1 = list1.next() + num1;
        }
        ListIterator<Integer> list2 = l2.listIterator();
        while (list2.hasNext()) {
            num2 = list2.next() + num2;
        }
        String numAdd = String.valueOf(Integer.valueOf(num1) + Integer.valueOf(num2));
        LinkedList<Integer> ln = new LinkedList<>();
        for (int i = numAdd.length() - 1, j = 0; i >= 0; i--, j++) {
            ln.add(j, numAdd.charAt(i) - '0');
        }
        return ln;
    }

}
