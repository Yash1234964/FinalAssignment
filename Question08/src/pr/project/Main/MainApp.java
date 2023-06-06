package pr.project.Main;



public class MainApp {
	    public static void main(String[] args) {
	        Thread evenThread = new Thread(new EvenNumbersRunnable());
	        Thread oddThread = new Thread(new OddNumbersRunnable());

	        evenThread.start();
	        oddThread.start();
	    }
	}

	class EvenNumbersRunnable implements Runnable {
	    @Override
	    public void run() {
	        for (int i = 2; i <= 10; i += 2) {
	            System.out.println("Even Thread: " + i);
	        }
	    }
	}

	class OddNumbersRunnable implements Runnable {
	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i += 2) {
	            System.out.println("Odd Thread: " + i);
	        }
	    }
	}


