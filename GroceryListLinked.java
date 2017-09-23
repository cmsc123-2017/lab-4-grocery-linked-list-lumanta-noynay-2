class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  public boolean add(GroceryItem item) {
    GroceryNode newItem = new GroceryNode(item, head);
    head = newItem;
    size++;
    return true;
  }
  
  public boolean remove(String name) {
    return false;
  }
  
  public boolean markAsBought(String name) {
  }
  
  public void display() {
    GroceryNode current = head;
    while(current != null) {
      System.out.println(current.data);
      data = data.next;
      
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}
