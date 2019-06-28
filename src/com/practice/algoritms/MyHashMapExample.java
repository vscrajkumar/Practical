package com.practice.algoritms;

class MyHashMap<K,V>{
	
	static class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key,V value,Entry<K,V> next){
			
			this.key=key;
			this.value=value;
			this.next=next;
		}
	}
	
	int Capacity=16;
	int size=0;
	Entry<K,V>[] buckets;
	
	@SuppressWarnings("unchecked")
	MyHashMap(){
		buckets=new Entry[Capacity];
	}
	
	public void put(K key,V value){
	
		int index=this.getHash(key);
		System.out.println("index--"+index);
		Entry<K,V> current=new Entry<K,V>(key,value,null);
		if(buckets[index]==null){
			buckets[index]=current;
			size++;
			System.out.println("First Insert");
			return;
		}
		else{
			Entry<K,V> previous=buckets[index];
			if(key.equals(previous.key)){
				previous.value=value;
				return;
			}
			while(previous.next!=null){	
				previous=previous.next;
				if(previous.key.equals(key)){
					previous.value=value;
					return;
				}
				else{
					previous.next=current;
					size++;
					return;
				}
			}
		}
	}
	public V get(K key){
		int index=this.getHash(key);
		System.out.println("index--"+index);
		if(buckets[index]==null){
			return (V)"Key Not Found";
		}else{
			Entry<K,V> current=buckets[index];
			while(current!=null){
				System.out.println("current.key--"+current.key);
				System.out.println("key--"+key);
				if(current.key.equals(key)){
					System.out.println("Inside if");
					return current.value;
				}
				current=current.next;
			}
			return null;
		}
	}
	
	private int getHash(K key){
		
		return  key.hashCode() % Capacity ;
	}
}
public class MyHashMapExample {

	public static void main(String[] args) {
		
		MyHashMap<String,String> obj=new MyHashMap<String,String>();
		obj.put("R","Raj");
		System.out.println("get---"+obj.get("R"));
		System.out.println("get---"+obj.get("Y"));

	}
}
