package classesWithAttributes;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this._description = description;
		this._id = id;
		this._name = name;
		this._price = price;
		this._stockAmount = stockAmount;
		
	}
	
	public Product() {
		
	}
	// attribute / field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {

		_id = id;
		// this._id = id;

		// this.id ifadesindeki this, içinde bulunduğu class'ın id'sini kastediyor.
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String getRenk() {
		return _renk;
	}

	public void setRenk(String renk) {
		this._renk = renk;
	}

	public String getKod() {
		return this._name.substring(0,1) + _id;
	}

}


