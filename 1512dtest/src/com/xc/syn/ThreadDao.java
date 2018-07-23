package com.xc.syn;
/**
 * <p>Description: </p>
 * @Auther ���ѱ�
 * @date ����ʱ�� 2018��6��17������2:12:38
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
			//���ۻ�Ʊ
			sale();
		}
	}
	public synchronized void sale(){
		
		System.out.println(Thread.currentThread().getName()+"���۵�"+(100-count+1)+"Ʊ");
		count--;
	}
}
public class ThreadDao {
	public static void main(String[] args) {
			ThreadTrain train = new ThreadTrain();
			Thread t1 = new Thread(train,"����1");
			Thread t2 = new Thread(train,"����2");
			t1.start();
			t2.start();
	}
}
