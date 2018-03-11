public class Queue {

    private int _count;
    private int _capacity = 5;
    private int[] _members = new int[_capacity];
    private int _head;
    private int _tail;

    private void resizeMembersArray(){
        int increasedCapacity = _capacity + 5;
        int [] largerArray = new int[increasedCapacity];
        int oldCount = _count;
        for (int i = 0; i < oldCount; i++){
            largerArray[i] = dequeue();
        }
        _members = largerArray;
        _capacity = increasedCapacity;
        _head = 0;
        _count = oldCount;
        _tail = oldCount;
    }

    boolean isEmpty(){
        return true;
    }

    public int count() {
        return _count;
    }

    public void enqueue(int item) {
        if ((_count > 0) && ((_tail % _capacity) == (_head % _capacity))){
         resizeMembersArray();
        }
        _members[_tail % _capacity] = item;
        _count++;
        _tail++;
    }

    public int dequeue() {
        _head++;
        _count--;
        return _members[(_head - 1) % _capacity];
    }
}
