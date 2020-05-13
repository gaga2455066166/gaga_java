package com.cjl.Dao;

import java.util.ArrayList;

import com.cjl.Bean.Fruit;

public interface FruitDao {
	public abstract ArrayList<Fruit> selectAllFruit();
	public abstract Fruit selectFruitById(Fruit fruit);	
	public abstract Fruit selectFruitByName(Fruit fruit);	
	public abstract Fruit selectFruitByPrice(Fruit fruit);
	public abstract Fruit selectFruitByType(Fruit fruit);
	public abstract int deleteFruitById(Fruit fruit);	
	public abstract int insertFruitByFruit(Fruit fruit);
	public abstract int updateFruitByFruit(Fruit oldFruit,Fruit newFruit);
	public abstract int updateFruitByType(Fruit oldFruit,Fruit newFruit);
	public abstract int deleteFruitByType(Fruit fruit);

}
