package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

interface Eatable {
}

public class Ex12_3 {

	public static void main(String[] args) {

		// 클래스의 타입간 다형성을 적용하는 것은 가능
		Box<Fruit> fruitBox = new FruitBox<Fruit>();
		Box<Apple> appleBox = new FruitBox<Apple>();
		Box<Grape> grapeBox = new FruitBox<Grape>();

		/*
		 * FruitBox<Toy> toyBox = new FruitBox<Toy>();
		 * 에러. Fruit Class의 자손이면서 Eatable를 구현해야만 올 수 있음
		 * 주의해야 할 건 Fruit 과 Eatable 한쪽만 구현된 것이 아니라, 모두 구현이 되어 있어야 한다는 것
		 * */

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple());
		// appleBox.add(new Grape());	// 에러

		grapeBox.add(new Grape());

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);

	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {

}

class Box<T> {

	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

}
