class GroceryListLinked implements IGroceryList {

 GroceryNode head = null;
 GroceryNode previous = null;
 int size = 0;

 // CONSTRUCTOR
 GroceryListLinked() {
 }
 
 
 // TEMPLATE:
 /* Fields:
  * 
  * Methods:
  * add(GroceryItem item)      -- boolean
  * remove(String name)        -- boolean
  * markAsBought(String name)  -- boolean
  * display()                  -- void
  * isOnTheList(String name)   -- boolean
  * 
  * 
  * Methods of GroceryItem:
  * toString()       -- String
  * equals(Object o) -- boolean
  * 
  */
 
 // GroceryItem -> boolean
 // Returns true if the item is successfully added to the list.
 public boolean add(GroceryItem item) {
  GroceryNode newItem = new GroceryNode(item, head);
  head = newItem;
  size++;
  return true;
 }
 
 // Template
 /*  this.item
  *  newItem
  */

 // String -> boolean
 // Returns true,iff an item is successfully removed from the list.
 public boolean remove(String name) {
  if (isOnTheList(name) == null || size == 0) {
   return false;
  }
  if (isOnTheList(name) == head) {
   head = head.next;
  } else {
   GroceryNode newItem = isOnTheList(name).next;
   previous.next = newItem;
  }
  size--;
  return true;
 }

 // String -> GroceryNode
 // Returns true if the name of the item is on the list.
 public GroceryNode isOnTheList(String name) {
  GroceryNode current = head;
  while (!(current.data.equals(new GroceryItem(name, 0)))) {
   if (current.next == null) {
    System.out.println("Item not on the List");
    return null;
   }
   previous = current;
   current = head.next;
  }
  return current;
 }

 // String -> boolean
 // Returns true if an item is successfully bought and mark the box with an "x"
 public boolean markAsBought(String name) {
  if (isOnTheList(name) == null) {
   return false;
  }
  isOnTheList(name).data.isBought = true;
  return true;
 }

 // void -> void
 // Displays the information stored on the list.
 public void display() {
  GroceryNode current = head;
  while (current != null) {
   System.out.println(current.data);
   current = current.next;
  }
 }

}

// Class Node
class GroceryNode {
 GroceryItem data;
 GroceryNode next;

 GroceryNode(GroceryItem data, GroceryNode next) {
  this.data = data;
  this.next = next;
 }

 // void -> string
 // Displays the name of an item saved on the list.
 public String toString() {
  return this.data.toString();
 }
}
