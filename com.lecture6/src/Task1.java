public class Task1 {
    public static void main(String[] args) {

        System.out.println(findSmallest(18, 5, 6));

    }

        public static int findSmallest(int a, int b, int c){
            return Math.min(c, Math.min(a, b));

        }

}
