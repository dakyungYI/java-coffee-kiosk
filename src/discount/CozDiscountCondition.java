package discount;

import java.util.Scanner;

/*
* - 코드스테이츠 수강생이면 500원을 할인을 해줌
    - 이를 위해 필요한 것은?
    - 할인 금액 저장할 필드 -> discountAmount
    - 할인 조건을 확인하는 메서드  -> checkDiscountCondition()
    - 할인을 적용해주는 메서드 -> discount()

    * public 디스카운트를 하면 원가가 얼마고 할인이 얼마? int 타입
    * public int discount(int price) {
    * if(할인조건 판단()) return 할인 금액 적용(price);
    * }
    * else if return price;
 */
public class CozDiscountCondition {
    //할인금액
    private int discountAmount;

    public CozDiscountCondition(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    private boolean checkDiscountCondition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("코드스테이츠 45기 학생인가요? (1) 네, (2) 아니요");
        String input = scanner.nextLine();

        if(input.equals("1")) return true;
        else return false;
    }

    private int calDiscountPrice(int price) {
//        원가에서 할인금액 뺴주기
        return price - discountAmount;
    }

    public int discount(int price) {
        if(checkDiscountCondition()) return calDiscountPrice(price);
        else return price;

        }
    }

