import java.util.Comparator;

class myComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer integer, Integer t1) {
        return Integer.compare(integer, t1);
    }
}

class Multithreading {
    public static  void main(String args[]) {
        Runnable r = () -> {
                for(int j = 0; j< 10; j++) {
                    System.out.println("child thread");
                }
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}
