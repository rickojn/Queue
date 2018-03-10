public class Queue {

    private int _count;

    boolean isEmpty(){
        return true;
    }

    public int count() {
        return _count;
    }

    public void enqueue(int item) {
        _count++;
    }
}
