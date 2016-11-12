package com;
import java.util.HashMap;

public class Xuexi1{
   public static void main(String[] args) {
	   HashMap map1 = new HashMap();
	   RunableWork1 r1 = new RunableWork1(map1);
	   RunableWork3 r3 = new RunableWork3(map1);
	   Thread thread1 = new Thread(r1);
	   Thread thread3 = new Thread(r3);
	   thread1.start();
	   thread3.start();
	   
	   //System.exit(-1);
	
<<<<<<< HEAD
   }
   public static class RunableWork1 implements Runnable{
       public HashMap map=null;
	   public RunableWork1(HashMap map) {
		   this.map = map;
	   }
	@Override
	public void run() {
		xuexi();
	}
	public void xuexi(){
		synchronized (map) {	
			for (int j = 0; j < 50; j++) {
				System.out.println("1:"+String.valueOf(j));
				if(j==30)
					try {
						map.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}
	}
	   
   }
   public static class RunableWork3 implements Runnable{
	   public HashMap map=null;
	   public RunableWork3(HashMap map) {
		   this.map = map;
	   }
		@Override
		public void run() {
			xuexi();////@@@@@@@@@@@@
		}
		public  void xuexi(){
			synchronized (map) {				
				for (int j = 0; j < 50; j++) {
					System.out.println("3:"+String.valueOf(j));
				}
				map.notifyAll();//////////////////////////////////////////weiwiewiweiweiweiwiewei
				//////////////////////////////////////////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@1234566			}	
		}		   
    }
}
=======
   }
   public static class RunableWork1 implements Runnable{
       public HashMap map=null;
	   public RunableWork1(HashMap map) {
		   this.map = map;
	   }
	@Override
	public void run() {
		xuexi();
	}
	public void xuexi(){
		synchronized (map) {	
			for (int j = 0; j < 50; j++) {
				System.out.println("1:"+String.valueOf(j));
				if(j==30)
					try {
						map.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}
	}
	   
   }
   public static class RunableWork3 implements Runnable{
	   public HashMap map=null;
	   public RunableWork3(HashMap map) {
		   this.map = map;
	   }
		@Override
		public void run() {
			xuexi();
		}
		public  void xuexi(){
			synchronized (map) {				
				for (int j = 0; j < 50; j++) {
					System.out.println("3:"+String.valueOf(j));
				}
				map.notifyAll();//////////////////////////////////////////weiwiewiweiweiweiwiewei
				//////////////////////////////////////////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@1234566
				/////////////////////////////////////////////////
				///////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				}	
		}		   
    }
}
>>>>>>> refs/remotes/origin/master
