import java.util.ArrayList;

public class TodoFunction {
	ArrayList<String> todolist = new ArrayList<String>();

	// add item to todolist

	public void additem(String item) {
		todolist.add(item);
	}
	// remove item in todolist

	public void removeitem(int index) {
		todolist.remove(index);
	}

	// print the entire todolist

	public void printlist() {
		System.out.println("Todo List consists of  "  +  todolist.size() + " items ");
		for (int i = 0; i < todolist.size(); i++) {
			System.out.println("Item at position " + (i+1 ) + " is " + todolist.get(i));
		}
	}

	public void updatelist(int index, String item) {
		todolist.set(index, item);
		System.out.println("Updation completed at position " );
	}

	public String finditem(String searchitem) {
		int index = todolist.indexOf(searchitem);
		if (index == -1) {
			return null;
		} else {
			return todolist.get(index);
		}
	}
}
