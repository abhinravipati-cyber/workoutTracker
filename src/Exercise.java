
public class Exercise {
	
	private String _name;
	private int _sets_quantity;
	
	public Exercise(String name, int sets_quantity) {
		set_name(name);
		set_sets_quantity(sets_quantity);
	}
	
	void set_sets_quantity(int sets_quantity) {
		_sets_quantity = sets_quantity;
	}
	
	int get_sets_quantity() {
		return _sets_quantity;
	}
	
	void set_name(String name) {
		_name = name;
	}
	
	String get_name() {
		return _name;
	}
}
