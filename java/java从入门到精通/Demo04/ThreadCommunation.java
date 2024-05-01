class P{
	String name = "李四";
	String sex = "女";
	boolean bFull = false;

	public synchronized void set(String name, String sex){
		if(bFull){
			try {
				wait();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(10);
		} catch(Exception e){
			e.printStackTrace();
		}
		this.sex = sex;
		bFull = true;
		notify();
	}

	public synchronized void get(){
		if(!bFull){
			try {
				wait();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(this.name + "---->" + this.sex);
		bFull = false;
		notify();
	}
}
class Producer implements Runnable{
	P q = null;
	public Producer(P q){
		this.q = q;
	}
	public void run(){
		int i = 0;
		while (true) {
			if(i == 0){
				q.set("张三", "男");
			}else{
				q.set("李四", "女");
			}
			i= (i+1)%2;
		}
	}
}

class Consumer implements Runnable{
	P q = null;
	public Consumer(P q){
		this.q = q;
	}
	public void run(){
		while (true) {
			q.get();
		}
	}
}
public class ThreadCommunation {
	public static void main(String[] args) {
		P q = new P();
		new Thread(new Producer(q)).start();
		new Thread(new Consumer(q)).start();
	}
	
}
