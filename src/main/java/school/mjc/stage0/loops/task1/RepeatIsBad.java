package school.mjc.stage0.loops.task1;

public class RepeatIsBad {
    static class Recursion {
        private int i;
        public Recursion(int i) {
            this.i = i;
        }
        public void repeatNow() {
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
            if (--i > 0) repeatNow();
        }
    }
    @SuppressWarnings("java:S106")
    public void repeatIsBad() {
        new Recursion(20).repeatNow();
        /*
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
*/
    }
}
