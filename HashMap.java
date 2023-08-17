package com.ty;

public class HashMap {
	int[] hashMap= {-1,-1,-1,-1,-1};
	int size=hashMap.length;
	void insert(int ele) {
		int index=ele%size;
		if(hashMap[index]!=-1) {
			System.out.println("key is already occupide!!");
		}
		else {
			hashMap[index]=ele;
			System.out.println(ele+"has been stored");
		}
	
			
	}
	void reset() {
		for(int i=0;i<size;i++) {
			hashMap[i]=-1;
		}
		System.out.println("HashMap has been reset!!");
	}
	void delete(int ele) {
		int index=ele%size;
		if(hashMap[index]==-1||hashMap[index]!=ele) {
			System.out.println("value not found!!!");
		}
		else {
			System.out.println(ele+":got dleted!!");
			hashMap[index]=-1;
		}
	}
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.insert(6);
		h1.insert(54);
		h1.insert(67);
		h1.insert(79);
		h1.insert(100);
		h1.reset();
		h1.insert(79);
	}
			

}
