class RecursionPractice {
    public static void main(String[] args) {
        helloWorld(1000);
    }

    private static void helloWorld(int counter) {
        if(counter == 0) {
            return;
        }
        System.out.println("hello world");
        helloWorld(--counter);
    }
}