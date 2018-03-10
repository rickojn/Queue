import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Queue queue = new Queue();
        assertEquals(queue.isEmpty(),true);
    }
}