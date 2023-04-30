package products;

import java.util.Scanner;

/*
* Product를 상속
* 커피는 샷추가 여부만 필드로 가짐
* 생성자와 setter()
 */
public class Coffee extends Product {
//    private static int shotAmount = 500;

    private boolean additionalShot;

    public Coffee(int id, String name, int price, boolean additionalShot) {
        super(id, name, price);
        this.additionalShot = additionalShot;
    }

    public void setAdditionalShot(boolean additionalShot) {
        this.additionalShot = additionalShot;
    }


    @Override
    public void applyOption() {
        System.out.println("샷추가 할꺼에요? (1) 예, (2) 아니요");
        Scanner scanner = new Scanner(System.in);

        int option = Integer.parseInt(scanner.nextLine());
        if(option == 1) {
            setAdditionalShot(true);
//            shotAdditionalPrice(getPrice());
        }
    }
//    private void shotAdditionalPrice(int price) {
//        //원가에서 샷추가 값 더하기
//        return price + shotAmount;
//    }

    @Override
    public String getOptionToString() {
        return additionalShot ? "(샷추가)" : "";
    }
}
