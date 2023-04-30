package products;
/*
* 커피와 차의 공통 정보를 가지고 있어야 한다.
* 이름, 가격 + id (Primary Key)
* Product클래스는 인스턴스할 필요x
* 공통 속성, 기능 상속을 위한 용도
* -> 추상 클래스
*
* 추가 요구사항
* 1. 상품에 따라서 옵션을 물어봐주기
*   a. 커피 -> 샷추가, 티 -> 티백빼주기
* 2. 옵션을 적용해줌
*   a. 사용자가 입력한 값에 따라서 커피, 티의 boolean 필드값을 바꿔주기 //-> false -> true
* 3. 선택한 옵션을 String 문자열로 만들어주기
*   a. (샷추가) 또는 (티백제거)
 */
public abstract class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void applyOption();
    public abstract String getOptionToString();


}
