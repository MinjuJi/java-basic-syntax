package generic;

import java.util.ArrayList;
import java.util.List;

public class NoneGenericApp {
    public static void main(String[] args) {
        // 제네릭 없이 선언하면 컬렉션에 아무 타입이나 저장되고 값을 꺼낼 때 형변환 해야 함
        List noneGeneric = new ArrayList();

        noneGeneric.add("일");
        noneGeneric.add(1);

        String data1 = (String) noneGeneric.get(0);
        int data2 = (int) noneGeneric.get(1);
    }
}