public class garbage {
    
    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();

        System.out.println("Before nullifying references:");
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);

        obj1 = null;
        obj2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After nullifying references and suggesting GC.");
    }

    static class MyObject {
    }
}

