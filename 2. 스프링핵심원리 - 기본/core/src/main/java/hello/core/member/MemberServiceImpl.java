package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    // 생성자를 통해 memberRepository 에 어떤 구현체가 들어갈 지 선택한다.
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberid) {
        return memberRepository.findById(memberid);
    }
}
