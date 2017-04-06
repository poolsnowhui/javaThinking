package xunhuantianjiangailv;


	interface Car{
		String getName();
		int getPrice();
	}
	class BMW implements Car{
		
		@Override
		public String getName() {
			return "BMW";
		}

		@Override
		public int getPrice() {
			return 200000;
		}
	}
	class QQ implements Car{

		@Override
		public String getName() {
			return "QQ";
		}

		@Override
		public int getPrice() {
			return 20000;
		}
	}
public class Carshop {
	int price = 0;
	public void sellCar(Car car){
		System.out.println("卖出"+car.getName()+"车"+"单价："+car.getPrice()+"元。");
		price += car.getPrice();
	}
	public int getSellPrice(){
		return price;
	}
	public static void main(String[] args) {
		Carshop carShop = new Carshop();
		carShop.sellCar(new QQ());
		carShop.sellCar(new BMW());
		System.out.println(carShop.getSellPrice());
	}
}
