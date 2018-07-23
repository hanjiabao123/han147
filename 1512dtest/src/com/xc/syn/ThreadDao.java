package com.xc.syn;
/**
 * <p>Description: </p>
 * @Auther 韩佳宝
 * @date 创建时间 2018年6月17日下午2:12:38
 * @Version 1.0
 */
class ThreadTrain extends Thread{
	private int count =100;
	
	@Override
	public void run(){
		while(count>0){
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//出售火车票
			sale();
		}
	}
	public synchronized void sale(){
		
		System.out.println(Thread.currentThread().getName()+"出售第"+(100-count+1)+"票");
		count--;
	}
}
public class ThreadDao {
	public static void main(String[] args) {
			ThreadTrain train = new ThreadTrain();
			Thread t1 = new Thread(train,"窗口1");
			Thread t2 = new Thread(train,"窗口2");
			t1.start();
			t2.start();
	}
}
