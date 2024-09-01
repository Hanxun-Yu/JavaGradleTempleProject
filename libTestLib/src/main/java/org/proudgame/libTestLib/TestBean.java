/**
 * author: Crashxun
 * created on: 2024/9/1 15:51
 * description:
 */

package org.proudgame.libTestLib;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestBean {
    String name;
    String address;
    int age;

    public String getAddress() {
        return "a";
    }
}

class TestBeanMain {
    public static void main(String[] args) {
        TestBean bean = TestBean.builder().age(1).address("a").name("peter").build();
        TestBean bean2 = TestBean.builder().age(1).address("a").build();

        System.out.println(bean.equals(bean2));
        System.out.println(bean);
        System.out.println(bean2);
    }
}