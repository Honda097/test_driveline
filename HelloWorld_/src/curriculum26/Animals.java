package curriculum26;

import curriculum23.AnimalBeen;

public class Animals extends AnimalBeen {
	// フィールド変数を宣言
	private String scientificName;
	
	// getterを用意
	public String getScientificName() {
		return scientificName;
	}
	
	// setterを用意
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
}
