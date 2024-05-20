package ch12;

import java.util.ArrayList;

class Fruit4 {

	@Override
	public String toString() {
		return "Fruit4";
	}

}

class Apple4 extends Fruit4 {

	@Override
	public String toString() {
		return "Apple4";
	}

}

class Grape4 extends Fruit4 {

	@Override
	public String toString() {
		return "Grape4";
	}

}

class Toy4 {
}

class Juice {
	String name;

	public Juice(String name) {
		this.name = name + "Juice";
	}

	@Override
	public String toString() {
		return name;
	}

}

class Juicer {

	static Juice makeJuice(Box4<? extends Fruit4> box) {
		String tmp = "";

		for (Fruit4 f : box.getList()) {
			tmp += f + " ";
		}

		return new Juice(tmp);
	}
}

public class Ex12_4 {

	public static void main(String[] args) {

		Box4<Fruit4> fruitBox = new FruitBox4<>();
		Box4<Apple4> appleBox = new FruitBox4<>();

		fruitBox.add(new Apple4());
		fruitBox.add(new Grape4());

		System.out.println(Juicer.makeJuice(fruitBox));

		appleBox.add(new Apple4());
		appleBox.add(new Apple4());

		System.out.println(Juicer.makeJuice(appleBox));

	}

}

class FruitBox4<T extends Fruit4> extends Box4<T> {

}

class Box4<E> {
	ArrayList<E> list = new ArrayList<>();

	void add(E item) {
		list.add(item);
	}

	E get(int i) {
		return list.get(i);
	}

	ArrayList<E> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}