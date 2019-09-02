public class simpleinherit {
    int i, j;

    void showij() {
        System.out.println("value of i and j" + i + " " + j);
    }
}

class b extends simpleinherit {
    int k;

    void showk() {
        System.out.println(k);
    }

    void sum() {
        System.out.println(i + j + k);
    }
}

class c {
    public static void main(String[] args) {
        b obj1 = new b();
        obj1.i = 10;
        obj1.j = 20;
        obj1.k = 2;
        obj1.showij();
        obj1.showk();
        obj1.sum();
    }
}
