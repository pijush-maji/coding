package javaPractice.stream;

public class Product {
	
	private Integer id;
	private String name;
	private Float price;
	public Product(Integer id, String name, Float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Id - "+this.getId()
			+" Name - "+this.getName()
			+" Price - "+this.getPrice();
	}
	
	
}
