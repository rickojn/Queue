public class Queue {

    private int _count;
    private int _capacity = 5;
    private int[] _members = new int[_capacity];
    private int _head;
    private int _tail;

    boolean isEmpty(){
        return true;
    }

    public int count() {
        return _count;
    }

    public void enqueue(int item) {
        if (_tail == _capacity){
            _capacity = _capacity + 5;
            int [] largerArray = new int[_capacity];
            for (int i = 0; i < _tail; i++){
                largerArray[i] = _members[i];
            }
            _members = largerArray;
        }
        _members[_tail] = item;
        _count++;
        _tail++;
    }

    public int dequeue() {
        _head++;
        _count--;
        return _members[_head - 1];
    }
}
