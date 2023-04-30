package products;

import java.util.Scanner;

/*
* Product를 상속
* 티백 제거 여부를 필드로 지정
* 생성자와 setter()
 */
public class Tea extends Product {

    private boolean noTeabag;

    public  Tea(int id, String name, int price, boolean noTeabag) {
        super(id, name, price);
        this.noTeabag = noTeabag;
    }

    public  void setNoTeabag(boolean noTeabag) {
        this.noTeabag = noTeabag;
    }


    @Override
    public void applyOption() {
        System.out.println("티백 빼줘요? (1) 예, (2) 아니요");
        Scanner scanner = new Scanner(System.in);

        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) setNoTeabag(true);
    }

    @Override
    public String getOptionToString() {
        return noTeabag ? "(티백 빼주기)" : "";
    }
}
