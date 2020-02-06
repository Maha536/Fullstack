package com.cts.training.threads;
	class Resource{
		private int arr[];
		public void changeArray() {
			
		}
		
		public void manageArray(String name,int size,int initValue) {
			this.arr=new int[size];
			for (int i=0;i<size;i++)
				this.arr[i]=initValue+i;
			for(int i=0;i<this.arr.length;i++)
				System.out.println("name :"+name+" "+this.arr[i]);
			
		}
	}

	class useArrayThread extends Thread{
		Resource resource;
		String name;
		int size;
		int initValue;
		useArrayThread(Resource resource,String name,int size,int initValue){
			this.resource=resource;
			this.name=name;
			this.size=size;
			this.initValue=initValue;
		}
		public void run() {
			//locking resource object
			synchronized(this.resource) {
				
			}
			this.resource.manageArray(this.name, this.size, this.initValue);
	 }
	
	}
public class CommanResourceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new Resource();
		
		useArrayThread t1 = new useArrayThread(r,"Thread-1",50,1);
		useArrayThread t2 = new useArrayThread(r,"Thread-2",50,51);
		t1.start();
		
		/*try {
			t1.sleep(100);
		}
		catch(Exception e) {
			
		}*/
		t2.start();
		
	}

}
