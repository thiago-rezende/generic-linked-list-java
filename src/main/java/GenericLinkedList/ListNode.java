package GenericLinkedList;

/**
 *
 * @author Thiago Rezende
 * @param <_Type> 
 */
public class ListNode<_Type>
{
    private _Type m_data;
    private ListNode<_Type> m_next;

    public ListNode(_Type data)
    {
        m_data = data;
        m_next = null;
    }

    // Get
    public _Type data() { return m_data; }
    public ListNode<_Type> next() { return m_next; }
    // Set
    public void set_data(_Type data) { m_data = data; }
    public void set_next(ListNode<_Type> next) { m_next = next; }

    @Override
    public String toString()
    {
        return m_data.toString();
    }
}