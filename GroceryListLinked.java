class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  GroceryNode previous;
  int size = 0;
  
  GroceryListLinked() {}
  
  public boolean add(GroceryItem item) {
    GroceryNode newItem = new GroceryNode(item, head);
    head = newItem;
    size++;
    return true;
  }
  
  public boolean remove(String name) {
    if (isNamed(name) == null || size == 0){
      return false;
    }
    if (isNamed(name) == head){
      head = head.next;
    } esle{
      GroceryNode newItem = isNamed(name).next;
      prev.next = newItem;
    }
    size--;
    return true;
  }
  
  public boolean markAsBought(String name) {
    if(isNamed(name) == null)
      return false;
    isNamed(name).data.bought();
      return true;
  }
  
  public void display() {
    GroceryNode newItem = head;
    while(newItem != null) {
      System.out.println(newItem.data);
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
  
  public String toString(){
    return this.data.toString();
  }
}
