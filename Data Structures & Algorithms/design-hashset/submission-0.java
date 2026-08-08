class MyHashSet {
    boolean[] set;
  //  HashSet<integer> set = new HashSet<>();

    public MyHashSet() {
        set = new boolean[1000001];
        
        
    }
    
    public void add(int key) {
    //    set.add(key);
      set[key] = true;  
    }
    
    public void remove(int key) {
        //set.remove(key);
        //if(! set.contains()){
          //  return 
        //}
        set[key] = false;
        
    }
    
    public boolean contains(int key) {
        return set[key];
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */