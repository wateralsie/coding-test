// 옷가게 할인 받기
// Lv.0

public class ClothesDiscount {
    public int mySolution(int price) {
        double discountRate = 0;

        if (price >= 500000) discountRate = 0.2;
        else if (price >= 300000) discountRate = 0.1;
        else if (price >= 100000) discountRate = 0.05;

        return (int)(price * (1 - discountRate));
    }
}
