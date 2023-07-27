package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    @Test
    public void hashSetAddTest() {
        HashSet<String> people = new HashSet<>();

        people.add("John");

        Assert.assertEquals(1, people.size());
    }

    @Test
    public void hashSetRemoveTest() {
        HashSet<String> people = new HashSet<>();

        people.add("John");
        people.add("Mary");
        people.remove("Mary");


        Assert.assertEquals(1, people.size());
    }

    @Test
    public void hashSetSizeTest() {
        HashSet<String> people = new HashSet<>();

        Assert.assertEquals(0, people.size());
    }

    @Test
    public void hashSetContainsTest() {
        HashSet<String> people = new HashSet<>();

        people.add("John");
        people.add("Mary");


        Assert.assertTrue(people.contains("Mary"));
    }

    @Test
    public void hashSetClearTest() {
        HashSet<String> people = new HashSet<>();

        people.add("John");
        people.add("Mary");
        people.clear();

        Assert.assertEquals(0, people.size());
    }

    @Test
    public void arrayListAddTest() {
        ArrayList<String> people = new ArrayList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");

        Assert.assertEquals(4, people.size());
    }

    @Test
    public void arrayListRemoveTest() {
        ArrayList<String> people = new ArrayList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.remove(2);

        Assert.assertEquals(3, people.size());
    }

    @Test
    public void arrayListSetTest() {
        ArrayList<String> people = new ArrayList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.set(1, "Juan");

        Assert.assertEquals("Juan", people.get(1));
    }

    @Test
    public void arrayListClearTest() {
        ArrayList<String> people = new ArrayList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.clear();

        Assert.assertEquals(0, people.size());
    }

    @Test
    public void hashMapAddTest() {
        HashMap<Integer, String> people = new HashMap<>();

        people.put(0, "John");
        people.put(1, "Mary");
        people.put(2, "Kyle");
        people.put(3, "Lauren");

        Assert.assertEquals(4, people.size());
    }

    @Test
    public void hashMapGetTest() {
        HashMap<Integer, String> people = new HashMap<>();

        people.put(0, "John");
        people.put(1, "Mary");
        people.put(2, "Kyle");
        people.put(3, "Lauren");

        Assert.assertEquals("Kyle", people.get(2));
    }

    @Test
    public void hashMapRemoveTest() {
        HashMap<Integer, String> people = new HashMap<>();

        people.put(0, "John");
        people.put(1, "Mary");
        people.put(2, "Kyle");
        people.put(3, "Lauren");
        people.remove(3);

        Assert.assertEquals(3, people.size());
    }

    @Test
    public void hashMapClearTest() {
        HashMap<Integer, String> people = new HashMap<>();

        people.put(0, "John");
        people.put(1, "Mary");
        people.put(2, "Kyle");
        people.put(3, "Lauren");
        people.clear();

        Assert.assertEquals(0, people.size());
    }

    @Test
    public void linkedListAddTest() {
        LinkedList<String> people = new LinkedList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");

        Assert.assertEquals(4, people.size());
    }

    @Test
    public void linkedListAddFirstTest() {
        LinkedList<String> people = new LinkedList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.addFirst("Tyler");

        Assert.assertEquals("Tyler", people.getFirst());
    }

    @Test
    public void linkedListAddLastTest() {
        LinkedList<String> people = new LinkedList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.addLast("Tyler");

        Assert.assertEquals("Tyler", people.getLast());
    }

    @Test
    public void linkedListRemoveFirstTest() {
        LinkedList<String> people = new LinkedList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.removeFirst();

        Assert.assertEquals("Mary", people.getFirst());
    }

    @Test
    public void linkedListRemoveLastTest() {
        LinkedList<String> people = new LinkedList<>();

        people.add(0, "John");
        people.add(1, "Mary");
        people.add(2, "Kyle");
        people.add(3, "Lauren");
        people.removeLast();

        Assert.assertEquals("Kyle", people.getLast());
    }

    @Test
    public void arrayDequeAddTest() {
        ArrayDeque<String> people = new ArrayDeque<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");

        Assert.assertEquals(4, people.size());
    }

    @Test
    public void arrayDequeAddFirstTest() {
        ArrayDeque<String> people = new ArrayDeque<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.addFirst("Tyler");

        Assert.assertEquals("Tyler", people.getFirst());
    }

    @Test
    public void arrayDequeAddLastTest() {
        ArrayDeque<String> people = new ArrayDeque<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.addLast("Tyler");

        Assert.assertEquals("Tyler", people.getLast());
    }

    @Test
    public void arrayDequeRemoveFirstTest() {
        ArrayDeque<String> people = new ArrayDeque<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.removeFirst();

        Assert.assertEquals("Mary", people.getFirst());
    }

    @Test
    public void arrayDequeRemoveLastTest() {
        ArrayDeque<String> people = new ArrayDeque<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.removeLast();

        Assert.assertEquals("Kyle", people.getLast());
    }

    @Test
    public void arrayDequeClearTest() {
        ArrayDeque<String> people = new ArrayDeque<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.clear();

        Assert.assertEquals(0, people.size());
    }

    @Test
    public void stackIsEmptyTest() {
        Stack<String> people = new Stack<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");

        Assert.assertFalse(people.isEmpty());
    }

    @Test
    public void stackPushTest() {
        Stack<String> people = new Stack<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.push("Tyler");

        Assert.assertEquals("Tyler", people.peek());
    }

    @Test
    public void stackPopTest() {
        Stack<String> people = new Stack<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");
        people.pop();

        Assert.assertEquals("Kyle", people.peek());
    }

    @Test
    public void stackPeekTest() {
        Stack<String> people = new Stack<>();

        people.add("John");
        people.add("Mary");
        people.add("Kyle");
        people.add("Lauren");

        Assert.assertEquals("Lauren", people.peek());
    }



}
