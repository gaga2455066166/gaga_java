package com.cjl.Service;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.cjl.Bean.Fruit;
import com.cjl.Dao.Impl.FruitDaoImplement;

public class FruitService {
	FruitDaoImplement fruitDaoImplement = new FruitDaoImplement();

	public Fruit selectFruitByIdService(Fruit fruit) {
		// TODO 自动生成的方法存根
		Fruit selectFruit = fruitDaoImplement.selectFruitById(fruit);
		return selectFruit;
	}

	public Fruit selectFruitByNameService(Fruit fruit) {
		// TODO 自动生成的方法存根
		Fruit selectFruit = fruitDaoImplement.selectFruitByName(fruit);
		return selectFruit;
	}

	public Fruit selectFruitByPriceService(Fruit fruit) {
		// TODO 自动生成的方法存根
		Fruit selectFruit = fruitDaoImplement.selectFruitByPrice(fruit);
		return selectFruit;
	}

	public Fruit selectFruitByTypeService(Fruit fruit) {
		// TODO 自动生成的方法存根
		Fruit selectFruit = fruitDaoImplement.selectFruitByType(fruit);
		return selectFruit;
	}

	public int deleteFruitByIdService(Fruit fruit) {
		// TODO 自动生成的方法存根
		Fruit deleteFruit = selectFruitByIdService(fruit);
		int rows = 0;
		if (deleteFruit == null) {
			rows = -1;
		} else {
			rows = fruitDaoImplement.deleteFruitById(fruit);
		}

		return rows;
	}

	public int insertFruitByFruitService(Fruit fruit) {
		Fruit insertFruit = selectFruitByIdService(fruit);
		int rows = 0;
		if (insertFruit != null) {
			rows = -1;
		} else {
			rows = fruitDaoImplement.insertFruitByFruit(fruit);
		}

		return rows;

	}

	public int updateFruitByFruitService(Fruit oldFruit, Fruit newFruit) {

		int rows = 0;
		rows = fruitDaoImplement.updateFruitByFruit(oldFruit, newFruit);
		return rows;

	}

	public ArrayList<Fruit> selectAllFruitService() {
		// TODO 自动生成的方法存根
		ArrayList<Fruit> fruits = fruitDaoImplement.selectAllFruit();
		return fruits;
	}

	public int updateFruitByTypeService(Fruit oldFruit, Fruit newFruit) {

		int rows = 0;
		rows = fruitDaoImplement.updateFruitByType(oldFruit, newFruit);
		return rows;

	}
	public int deleteFruitByTypeService(Fruit fruit) {
		// TODO 自动生成的方法存根
		int rows = 0;
		rows = fruitDaoImplement.deleteFruitByType(fruit);
		return rows;
	}

}
