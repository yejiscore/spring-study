package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1,000원 고정 할인

    @Override
    public int discount(Member member, int price) {
        // 회원 등급이 VIP 일 경우에만 할인이 적용된다는 조건이 존재
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
