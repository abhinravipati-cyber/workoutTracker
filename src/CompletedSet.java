
public class CompletedSet {

	int _repCount;
	int _weight;
	
	public CompletedSet(int repCount, int weight) {
		set_rep_count(repCount);
		set_weight(weight);
	}
	
	void set_rep_count(int repCount) {
		_repCount = repCount;
	}
	
	int get_rep_count() {
		return _repCount;
	}
	
	void set_weight(int weight) {
		_weight = weight;
	}
	
	int get_weight() {
		return _weight;
	}
	
	
	
}
