import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("When queue is created it is empty")
    void isEmpty() {
        assertEquals(queue.isEmpty(),true);
    }

    @Test
    @DisplayName("When queue is created it has no members")
    void testQueueHasNoMembersWhenCreated() {
        assertEquals(queue.count(),0);
    }

    @Test
    @DisplayName("When 3 members are enqueued the count is 3")
    void testCountWhenMembersEnqueued() {
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        assertEquals(queue.count(),3);
    }
    @Test
    @DisplayName("Members dequeued in the order they were enqueued")
    void testFIFOdequeue() {
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        assertEquals(queue.dequeue(),100);
        assertEquals(queue.dequeue(),200);
        queue.enqueue(500);
        assertEquals(queue.dequeue(),300);
        assertEquals(queue.dequeue(),500);
        assertEquals(queue.count(),0);
    }

}