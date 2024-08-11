package chapter_05;

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// 사이즈 260 (재고 있음)
// 사이즈 265 (재고 있음)
// 사이즈 270 (재고 있음)
// 사이즈 275 (재고 있음)
// 사이즈 280 (재고 있음)
// 사이즈 285 (재고 있음)
// 사이즈 290 (재고 있음)
// 사이즈 295 (재고 있음)

public class _Quiz_05 {
    public static void main(String[] args) {
//        int[] size = new int[] {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
//        boolean[] exist = new boolean[10];
//        for (int i = 0; i < size.length; i++) {
//            for (int j = 0; j <= 10; j++) {
//                if (size[i] == 250 + (5 * j)) {
//                    exist[j] = true;
//                    break;
//                }
//                else if (j == size.length) {
//                    exist[j] = false;
//                }
//            }
//        };
//
//        for (int i = 0; i < size.length; i++) {
//            if (exist[i]) {
//                System.out.println("사이즈 " + (250 + (5 * i)) + " (재고 있음)");
//            }
//            else {
//                System.out.println("사이즈 " + (250 + (5 * i)) + " (재고 없음)");
//            }
//        }
        
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
