package products;

// 상품의 목록을 가지고 있고, 그 목록과 관련된 역학을 수행하는 객체
public class ProductRepository {
//    음료 목록 배열을 필드로 정의
//    업캐스팅(하위 클래스 타입에서 상위 클래스 타입으로의 타입 변환), 다운캐스팅(상위 클래스에서 하위 클래스 타입으로 변환)
//    Product[]타입 상위타입 배열 참조변수에 하위 타입 인스턴스 요소 할당

    //[1, 아메리카노, 3000, false][2, 카페라떼, 3500, false][3, 페퍼민트, 4000, false][4, 루이보스, 4500, false]
    private Product[] products = new Product[] {
            new Coffee(1, "Americano", 3000,false),
            new Coffee(2, "Caffe latte", 3500, false),
            new Tea(3, "Peppermint tea", 4000, false),
            new Tea(4, "Rooibos tea", 4500, false)
    };
    public Product[] getProducts() {
        return products;
    }

//      아이디를 입력받고, 그 아이디가 있으면 걔를 리턴, 없으면? null 리턴
    public Product findById(int productId) {
        for(Product product : products) {
            if(product.getId() == productId) return product;
        }
        return null;
    }


}
