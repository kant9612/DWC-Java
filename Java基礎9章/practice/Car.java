package practice;

public class Car {
	// 燃費（Km/L）
	private double fuelCost;
	// 残量
	private double fuelAmount;
	//コンストラクタを作成
	public Car(double fuelCost, double fuelAmount){
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	//moveメソッド
	public void move(int km){
		System.out.println(km + "km走ります。");
		this.fuelAmount -= (km / fuelCost);
	}
	//return
	public double getFuelAmount(){
		return this.fuelAmount;
	}
}