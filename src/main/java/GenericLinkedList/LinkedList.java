package GenericLinkedList;

/**
 *
 * @author Thiago Rezende
 * @param <_Type>
 */
public class LinkedList<_Type>
{
    private ListNode<_Type> m_start;
    private int m_size;

    public LinkedList()
    {
        m_start = null;
        m_size = 0;
    }

    // Get
    public ListNode<_Type> start() { return m_start; }
    public int size() { return m_size; }
    // Set
    public void set_start(ListNode<_Type> start) { m_start = start; }
    public void set_size(int size) { m_size = size; }

    public void push_back(_Type data)
    {
        if(m_start == null)
        {
            m_start = new ListNode<_Type>(data);
            m_size++;
            return;
        }

        ListNode<_Type> aux = m_start;

        while(aux.next() != null)
            aux = aux.next();
        
        aux.set_next(new ListNode<_Type>(data));
        m_size++;
    }

    @Override
    public String toString()
    {
        String out = "[";

        if(m_start == null)
            return out + "]";

        ListNode<_Type> aux = m_start;

        while(aux != null)
        {
            if(aux.next() == null)
                out += aux.toString() + "]";
            else
                out += aux.toString() + ", ";
            
            aux = aux.next();
        }
        return out;
    }
}