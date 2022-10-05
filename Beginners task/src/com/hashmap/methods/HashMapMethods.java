package com.hashmap.methods;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.hashmap.runner.HashMapRunner;

import createdexception.CreatedException;

public class HashMapMethods {
	
	public void nullCheck(Object object) throws CreatedException{
		if(Objects.isNull(object)) {
			throw new CreatedException("The object passed is null");
		}
	}
	
	public void keyValueCheck(int key,int value) throws CreatedException {
		if(key!=value || key<0) {
			throw new CreatedException("The key/value given is inappropriate");
		}
	}
	public <K,V> void mapContainsKey (HashMap<K,V> map,K toFindKey) throws CreatedException{
		nullCheck(map);
		nullCheck(toFindKey);
		if(!map.containsKey(toFindKey)) {
			throw new CreatedException("The key given is not present in the map.");
		}
	}
	
	public <K,V> void mapContainsValue (HashMap<K,V> map,V toFindValue) throws CreatedException{
		nullCheck(map);
		nullCheck(toFindValue);
		if(!map.containsValue(toFindValue)) {
			throw new CreatedException("The value given is not present in the map.");
		}
	}
	
	public int getStringArrayLength(String[] words) throws CreatedException {
		nullCheck(words);
		return words.length;
	}
	
	public int getIntArrayLength(Integer[] numbers) throws CreatedException {
		nullCheck(numbers);
		return numbers.length;
	}
	public <K,V> HashMap<K,V> getHashMap(K key,V value) {
		HashMap<K,V> map=new HashMap<>();
		return map ;
	}
	
	public <K, V> int  getMapSize(HashMap<K ,V > map)throws CreatedException{
		int size=map.size();
		return size;
	}
	
	public HashMap<String,String> getStringMap(HashMap<String ,String > map,String[] keys,String[] values)throws CreatedException{
		int keySize=getStringArrayLength(keys);
		int valueSize=getStringArrayLength(values);
		keyValueCheck(keySize,valueSize);

		for(int i=0;i<keySize;i++) {
			map.put(keys[i], values[i]);
		}
		return map;
	}
	
	public HashMap<Integer,Integer> getIntegerMap(HashMap<Integer ,Integer > map,Integer[] keys,Integer[] values)throws CreatedException{
		int keySize=getIntArrayLength(keys);
		int valueSize=getIntArrayLength(values);
		keyValueCheck(keySize,valueSize);
		for(int i=0;i<keySize;i++) {
			map.put(keys[i], values[i]);
		}
		return map;
	}
	
	public HashMap<String,Integer> getStringIntegerMap(HashMap<String, Integer> map,String[] keys,Integer[] values)throws CreatedException{
		int keySize=getStringArrayLength(keys);
		int valueSize=getIntArrayLength(values);
		keyValueCheck(keySize,valueSize);
		for(int i=0;i<keySize;i++) {
			map.put(keys[i], values[i]);
		}
		return map;
	}
	
	public HashMap<String,HashMapRunner> getStringObjectMap(HashMap<String,HashMapRunner> map,String[] keys,int count)throws CreatedException {
		nullCheck(map);		
		for(int i=0;i<count;i++) {
			HashMapRunner temp=new HashMapRunner();
			map.put(keys[i], temp);		}
		return map;
	}
	public HashMap<String,String> getStringNullPointedMap(HashMap<String ,String > map,String[] keys,String[] values)throws CreatedException{
		int keySize=getStringArrayLength(keys);
		int valueSize=getStringArrayLength(values);
		keyValueCheck(keySize,valueSize);

		for(int i=0;i<valueSize;i++) {
			map.put(keys[i], values[i]);
		}
		return map;
	}
	
	public HashMap<String,String> getStringNullKeyMap(HashMap<String ,String > map,String keys,String values)throws CreatedException{
		nullCheck(values);
		map.put(keys, values);
		return map;
	}
	
	public HashMap<Integer,String> getIntegerStringMap(HashMap<Integer,String> map,Integer[] keys,String[] values)throws CreatedException{
		int valueSize=getStringArrayLength(values);
		int keySize=getIntArrayLength(keys);
		keyValueCheck(keySize,valueSize);
		for(int i=0;i<keySize;i++) {
			map.put(keys[i], values[i]);
		}
		return map;
	}
		
	public HashMap<String,String> getReplacedValues(HashMap<String ,String > map,String[] keys,String[] replaceValues)throws CreatedException{
		int keySize=getStringArrayLength(keys);
		int valueSize=getStringArrayLength(replaceValues);
		keyValueCheck(keySize,valueSize);

		for(int i=0;i<valueSize;i++) {
			map.replace(keys[i], replaceValues[i]);
		}
		return map;
	}
	public String getValue(HashMap<Integer,String> map,Integer toFindValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toFindValue);
		
		return map.get(toFindValue);
	}
	
	public String getNullValueAsString(HashMap<Integer,String> map,Integer toFindValue,String resultSring)throws CreatedException{
		nullCheck(map);
		nullCheck(toFindValue);
		
		String value= map.get(toFindValue);
		if(value==null) {
			map.put(toFindValue, resultSring);
			return resultSring;
		}
		return map.get(toFindValue);
	}
	
	public String getKeyRemoved(HashMap<Integer,String> map,Integer toRemoveKey)throws CreatedException{
		nullCheck(map);
		nullCheck(toRemoveKey);
		
		return map.remove(toRemoveKey);
	}
	
	public HashMap<Integer,String> getKeyRemovedWithValue(HashMap<Integer,String> map,Integer toRemoveKey,String toRemoveValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toRemoveKey);
		nullCheck(toRemoveValue);
		
		map.remove(toRemoveKey,toRemoveValue);
		return map;
	}
	
	public HashMap<Integer,String> getReplacedValue(HashMap<Integer,String> map,Integer toRemoveKey,String toReplaceValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toReplaceValue);
		nullCheck(toRemoveKey);
		
		map.replace(toRemoveKey,toReplaceValue);
		return map;
	}
	
	public HashMap<Integer,String> getReplacedByValue(HashMap<Integer,String> map,Integer toRemoveKey,String toRemoveValue,String toReplaceValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toReplaceValue);////////
		nullCheck(toRemoveValue);
		nullCheck(toRemoveKey);
		
		map.replace(toRemoveKey,toRemoveValue,toReplaceValue);
		return map;
	}
	
	public HashMap<Integer,String> getAddedHashMap(HashMap<Integer,String> map1,HashMap<Integer,String> map2)throws CreatedException{
		nullCheck(map1);
		nullCheck(map2);

		
		map2.putAll(map1);
		return map2;
	}
	public void printKeyValue (HashMap<Integer,String> map) throws CreatedException{
		nullCheck(map);
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("Key= "+entry.getKey()+" Value = "+entry.getValue());
		}
	}	
	public HashMap<Integer,String> getClearedMap(HashMap<Integer,String> map)throws CreatedException{
		nullCheck(map);
		map.clear();
		return map;
	}
	
}

