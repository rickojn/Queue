public class Queue {

    private int _count;
    private int _capacity = 5;
    private int[] _members = new int[_capacity];
    private int _head;
    private int _tail;

    private void resizeMembersArray(){
        int increasedCapacity = _capacity + 5;
        int [] largerArray = new int[increasedCapacity];
        for (int i = 0; i < _members.length; i++){
            largerArray[i] = dequeue();
        }
        _count = _members.length;
        _tail = _members.length;
        _members = largerArray;
        _capacity = increasedCapacity;
        _head = 0;

    }

    boolean isEmpty(){
        return _count == 0;
    }

    public int count() {
        return _count;
    }

    public void enqueue(int item) {
        if (_count == _capacity){
         resizeMembersArray();
        }
        _members[_tail] = item;
        _count++;
        _tail = (_tail + 1)% _capacity;
    }

    public int dequeue() {
        int dequeuedItem = _members[_head];
        _head = (_head + 1) % _capacity;
        _count--;
        return dequeuedItem;
    }
}
