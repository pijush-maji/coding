package striver.greedy.LRUCaching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRU {

    class Node {
        int key;
        int value;
        Node prv;
        Node next;

        public Node(int key,int value){
            this.key=key;
            this.value=value;
            this.prv=null;
            this.next=null;
        }
    }

    Map<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;

    public LRU(int capacity) {
        this.capacity=capacity;
        this.map = new HashMap<>(capacity);
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        head.next=tail;
        tail.prv=head;

    }
    public void deleteNodeFromLast(){
        Node temp = tail.prv;
        temp.prv.next = tail;
        tail.prv = temp.prv;
    }

    public void deleteNode(Node node){
        node.prv.next = node.next;
        node.next.prv = node.prv;
    }

    public void addNoteAtStart(Node node){
        Node temp = head.next;
        head.next = node;
        node.prv = head;
        node.next = temp;
        temp.prv = node;
    }

    public void put(int key,int value){
        Node node = new Node(key,value);
        if(map.size()==0){
            head.next=node;
            node.next=tail;
            tail.prv=node;
            node.prv=head;
            map.put(key,node);
        }else{
            Node temp = map.get(key);
            if(map.get(key)!=null){
                deleteNode(temp);
                addNoteAtStart(temp);
                temp.value = value;
            }else{
                if(map.size()==capacity){
                    map.remove(tail.prv.key,tail.prv);
                    deleteNodeFromLast();
                    addNoteAtStart(node);
                    map.put(key,node);
                } else {
                    addNoteAtStart(node);
                    map.put(key, node);
                }
            }
        }
    }

    public int get(int key){
        Node node = map.get(key);
        if(node!=null){
            deleteNode(node);
            addNoteAtStart(node);
            return node.value;
        }
        return -1;
    }

    public static void main(String[] args) {
        LRU lru = new LRU(2);
        lru.put(1,1);
        lru.put(2,2);
        lru.get(1);
        lru.put(3,3);
        lru.get(2);
        lru.put(4,4);
        lru.get(1);
        lru.get(3);
        lru.get(4);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        res.stream().map(e->e.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
    }
}
