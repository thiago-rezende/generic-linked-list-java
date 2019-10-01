package GenericLinkedList;

/**
 *
 * @author Thiago Rezende
 */
public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push_back(0);
        list.push_back(1);
        list.push_back(2);
        list.push_back(3);
        list.push_back(4);
        
        System.out.println(list);
    }
}
