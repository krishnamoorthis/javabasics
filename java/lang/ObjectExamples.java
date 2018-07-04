package com.java.lang;

public class ObjectExamples {
	private static final ObjectExamples Obj = null;
	int count;
	String desc;
	public ObjectExamples(){
		
	}
	
/*@Override
	public String toString() {
		
		return count+","+desc;
	}*/
	

public ObjectExamples(int count,String desc){
	this.count=count;
	this.desc=desc;
		
	}
	
	@Override
public String toString() {
	return "ObjectExamples [count=" + count + ", desc=" + desc + "]";
}
	@Override
	public boolean equals(Object obj) {
		 
	if(obj != null){
		if(obj instanceof ObjectExamples ){
			ObjectExamples oe = (ObjectExamples)obj;
			if (count == oe.count && desc.equals(oe.desc)) {
				return true;
			}
		}
	}
	return false;
	}
	@Override
	public int hashCode() {
		
		return count + desc.length()*2;
	}

	public static void main(String[] args) {
		ObjectExamples oe = new ObjectExamples(100,"Test");
		System.out.println(oe);
		System.out.println(oe.hashCode());
		oe.getClass();
		Class cls=ObjectExamples.class;
		
		
		ObjectExamples oeone = new ObjectExamples(100,"Test");
	System.out.println(oe.equals(oeone));
	System.out.println(oe.hashCode() +"==="+oeone.hashCode());
	}

}
