class LRUCache {
    class Node
    {
        int key,val;
        Node prev,next;
        Node(int key,int val)
        {
            this.key=key;
            this.val=val;

        }

    }
    private int capacity;
    private HashMap<Integer,Node> map;
    Node head,tail;
    

    public LRUCache(int capacity) {
      head=new Node(0,0);
       tail=new Node(0,0);
       this.capacity=capacity;
       map=new HashMap<>();
       head.next=tail;
       tail.prev=head;

        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        remove(node);
        insertFirst(node);
        return node.val;
        
    }
    public void insertFirst(Node node)
    {
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }
    public void remove(Node node)
    {
         node.prev.next=node.next;
         node.next.prev=node.prev;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key))
        {
            Node node=map.get(key);
            remove(node);
            node.val=value;
            insertFirst(node);
        }
        else
        {
            if(map.size()==capacity)
            {
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);

            }
            Node newnode=new Node(key, value);
            insertFirst(newnode);
            map.put(key,newnode);

        }

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */