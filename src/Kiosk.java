import discount.CozDiscountCondition;
import products.Product;
import products.ProductRepository;

import java.util.Scanner;

public class Kiosk {

    ProductRepository productRepository = new ProductRepository();  //필드로 정의
    CozDiscountCondition cozDiscountCondition = new CozDiscountCondition(500); //500원 할인 객체
    Scanner scanner = new Scanner(System.in);  //필드로 정의

    public void  operate() {
        printMenu();
        Product selectedProduct = chooseMenu();
        selectedProduct.applyOption();
        order(selectedProduct);
    }

    //메뉴 출력
    private void printMenu() {
        System.out.println("# 메뉴");
        System.out.println("-".repeat(50));

        for(Product product : productRepository.getProducts()) {
            System.out.printf("(%d) %-15s %d\n", product.getId(), product.getName(), product.getPrice());
        }

        System.out.println("-".repeat(50));
        System.out.println("메뉴를 골라주세요.");
    }

    //메뉴 선택
    private Product chooseMenu() {
        int selectedId = Integer.parseInt(scanner.nextLine());
//        Product selectedProduct = productRepository.findById(selectedId);
        return productRepository.findById(selectedId);
    }

    //주문, 출력
    private void order(Product product) {
        int price = cozDiscountCondition.discount(product.getPrice());
        System.out.println("주문이 완료되었습니다! 감사합니다!");
        System.out.printf("주문하신 상품은 : %s %s \n", product.getName(), product.getOptionToString());
        System.out.printf("가격 : %d\n", price);
    }









//    public void operate() {

////      메뉴 출력
//        System.out.println("# 메뉴");
//        System.out.println("-".repeat(50));  //=> 문자열 반복해주는 친구
////      상품 목록 출력
//        for(Product product : productRepository.getProducts()) {
//            System.out.printf("(%d) %-15s %d\n", product.getId(), product.getName(), product.getPrice());
//        }
//
////      메뉴 고르게 하기
//        System.out.println("-".repeat(50));
//        System.out.println("메뉴를 골라주세요.");
//        int selectedId = Integer.parseInt(scanner.nextLine());  //id 숫자 하나 입력받기
//        //ProductRepository에 만든 findBy 메소드로 상품을 검색할거임
//        Product selectedProduct = productRepository.findById(selectedId);
//        System.out.println("내가 고른 메뉴" + selectedProduct);
//
////      옵션 적용하기
//        selectedProduct.applyOption();
//
////      할인 적용하기
//
////      주문 내역 출력하기
//        //주문이 완료되었습니다
//        System.out.println("주문이 완료되었습니다! 감사합니다!");
//        //주문한 상품은 : ~~~
//        System.out.printf("주문하신 상품은 : %s %s \n", selectedProduct.getName(), selectedProduct.getOptionToString());
//        //주문한 가격은 : ~~~
//        int price = selectedProduct.getPrice();
//        System.out.printf("가격 : %d\n", price);
//
//    }

}
