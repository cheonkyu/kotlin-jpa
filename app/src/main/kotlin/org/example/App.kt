package jpabook.start

import javax.persistence.*
import java.lang.Class
import kotlin.reflect.KClass
import jpabook.start.Member

fun main() {
     //엔티티 매니저 팩토리 생성
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook");
    val em: EntityManager = emf.createEntityManager(); //엔티티 매니저 생성

    val tx: EntityTransaction = em.getTransaction(); //트랜잭션 기능 획득

     try {
        tx.begin(); //트랜잭션 시작
        logic(em);  //비즈니스 로직
        tx.commit();//트랜잭션 커밋

     } catch (e: Exception) {
        e.printStackTrace();
        tx.rollback(); //트랜잭션 롤백
     } finally {
        em.close(); //엔티티 매니저 종료
     }

     emf.close(); //엔티티 매니저 팩토리 종료
}

fun logic(em: EntityManager) {
    val id: String = "id1";
    val member: Member = Member(
        id = id,
        username = "지한",
        age = 2
    );

    //등록
    em.persist(member);

    //수정
    member.age = 20;

    //한 건 조회
    val findMember: Member = em.find(Member::class.java, id);
    println("findMember=" + findMember.username + ", age=" + findMember.age);

    //목록 조회
    val members: List<Member> = em.createQuery("select m from Member m", Member::class.java).getResultList();
    println("members.size=" + members.size);

    //삭제
    em.remove(member);
}
