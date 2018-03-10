public class Queue {

    private int _count;
    private int[] _members = new int[5];
    private int _head;
    private int _tail;

    boolean isEmpty(){
        return true;
    }

    public int count() {
        return _count;
    }

    public void enqueue(int item) {
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
