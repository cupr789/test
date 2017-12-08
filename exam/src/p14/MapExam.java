package p14;

import java.util.ArrayList;

public class MapExam {
	private ArrayList<String> alKey;
	private ArrayList<String> alValue;
	
	public MapExam() {
		alKey = new ArrayList<String>();
		alValue = new ArrayList<String>();
	}
	
	public void put(String key,String value) {
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			alKey.add(key);
			alValue.add(value);
		}
		
		else {
			alValue.set(idx, value);
		}
	}
	
	public String toString() {
		String str= "[";
		for(int i=0; i<alKey.size();i++) {
			str += alKey.get(i)+" = "+alValue.get(i)+" , ";
		}
		return str+"]";
	}
	
	
	public boolean remove(String key) {
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			return false;
		}
		else {
			alKey.remove(idx);
			alValue.remove(idx);
		}
		return true;
	}
	
	
	public int size() {
		
		return alKey.size();
	}
	
	public String get(String key) {
		int idx=alKey.indexOf(key);
		if(idx==-1) {
			return null;
		}
		return alValue.get(idx);
	}
	
	
	public String sortIng() {
		ArrayList<String> tempValue = new ArrayList<String>();
		ArrayList<String> tempKey = new ArrayList<String>();
		String outStr = new String();
		int max=0;
		String idx="";
		// 20,11,50
		//
		//alKey :0
		//alValue :50 
		
		for(int i=0;i<alKey.size();i++) {
			System.out.println("alKey 사이즈 : "+alKey.size());
			if(max<Integer.parseInt(alValue.get(i))) {
				max = Integer.parseInt(alValue.get(i));
				idx = alKey.get(i);
			}
			if(i==alKey.size()-1) {
				
				tempKey.add(tempKey.size()+"");
				tempValue.add(max+"");
				alKey.remove(idx);
				alValue.remove(idx);
				//outStr+="["+tempKey.get(cnt)+", "+tempValue.get(cnt)+"] ";
				max =0;
				idx ="";
				i=-1;
				
			}
			
			
		}
		
		return tempKey.get(0)+", "+tempValue.get(0) +" // "+ tempKey.get(1)+", "+tempValue.get(1) +" // "+ tempKey.get(2)+", "+tempValue.get(2);
		
		
		
		
		
		
	/*	for(int i=0; i<alKey.size();i++) {
			for(int x=i+1; x<alKey.size();x++) {
				if(Integer.parseInt(alValue.get(i))<Integer.parseInt(alValue.get(x))) {
					tempValue = alValue.get(x);
					alValue.set(i,alValue.get(x));
					
				}
			}
		}
		*/
	}
	
}
