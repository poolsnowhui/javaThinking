package xunhuantianjiangailv;

public class ThreadUnion {

	public static void main(String[] args) {
		Integer finish = 3;
		ThreadLocal<String> thSource = new ThreadLocal<>();
		thSource.set("start");
		Service service = new Service(finish, thSource);
		Thread[] t = new Thread[finish];
		for (int i = 0; i < finish; i++) {
			t[i] = new MyThread(service);
			t[i].start();
		}
		while (true) {
			synchronized (service) {
				if (service.getFinish() == 0)
					break;
				else {
					try {
						service.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		for (int i = 0; i < t.length; i++) {

		}
		System.out.println(service.getThSource().get());
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread extends Thread {
	private Service service;

	public MyThread(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.method();
		System.out.println("当前线程：" + Thread.currentThread().getName() + "");
	}
}

class Service {
	private Integer finish;
	private ThreadLocal<String> thSource;
	private String share = "";

	public Service(Integer finish, ThreadLocal<String> thSource) {
		super();
		this.finish = finish;
		this.thSource = thSource;
	}

	public void method() {
		thSource.set(thSource.get() + Thread.currentThread().getName());// 修改
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// work
		System.out.println(thSource.get());
		synchronized (this) {
			finish--;
			share += getShare() + thSource.get();
			notifyAll();
		}
	}

	public Integer getFinish() {
		return finish;
	}

	public ThreadLocal<String> getThSource() {
		return thSource;
	}

	public String getShare() {
		return share;
	}

}