public class Main {
    public static void main(String[] args) {
        int [] weekDays = {1, 2, 3, 4, 5, 6, 7};
                for(int i = weekDays.length -1; i>= 0; i-- ){
                    System.out.print(weekDays[i]);
                    if (i != 0) {
                        System.out.print(", ");
                    }
                }

    }
}