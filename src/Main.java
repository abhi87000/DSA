//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    import java.util.*;

public class Main {

    public class LRU{
        Node head =new Node(-1,-1);
        Node tail=new Node(-1,-1);
        int capacity;

        HashMap<Integer,Node> hashMap=new HashMap<>();

        public LRU(int _capacity) {
            capacity = _capacity;
            head.next = tail;
            tail.prev = head;
        }
        void add(Integer key,Integer val)
        {
            if(hashMap.containsKey(key))
            {
                deletenode(hashMap.get(key));
            }
            if(hashMap.size()==100)
            {
                Node toDelete=tail.prev;
                deletenode(toDelete);
            }
            addNode(new Node(key,val));
        }

        private void deletenode(Node node) {
            hashMap.remove(node.key);
            Node next=node.next;
            Node prev=node.prev;

            prev.next=next;
            next.prev=prev;
        }

        private void addNode(Node node) {
            hashMap.put(node.key,node);
                Node temp=head.next;
                node.next=temp;
                head.next=node;
                node.prev=head;
                temp.prev=node;
        }

        void delete(Integer key)
        {
            Node toDelete=hashMap.get(key);
            deletenode(toDelete);
        }

        Integer get(Integer key)
        {
            if(hashMap.containsKey(key))
            {

                Node temp=hashMap.get(key);
                deletenode(temp);
                addNode(temp);
                return temp.val;

            }
            return -1;
        }
        class Node{
            int key;
            int val;
            Node next;
            Node prev;

            Node(int k,int val)
            {
                this.key=k;
                this.val=val;
            }
        }
    }
    public static void main(String[] args) {




    }
}