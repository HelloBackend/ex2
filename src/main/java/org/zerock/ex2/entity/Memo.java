package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity // Memo 클래스가 Entity를 위한 클래스이며, Memo 클래스의 인스턴스들이 JPA로 관리되는 엔티티 객체라는것을 의미함.
@Table(name = "tbl_memo") // @Entity 어노테이션과 같이 사용할 수 있는 어노테이션으로 말 그대로 데이터베이스상에서 엔티티 클래스를 어떠한 테이블로 생성할 것인지에 대한 정보를 담기 위한 어노테이션임.
@ToString // toString()메소드 생성.
@Getter // 코드를 컴파일할 때 속성들에 대한 Getter/Setter 메소드 생성
@Builder // 빌더 패턴을 이용한 객체 생성 -> 이를 이용하기 위해서는 @allArgsConstructor, @NoArgsConstructor 를 항상 같이 처리해야 컴파일 에러가 발생하지 않음.
@AllArgsConstructor // 모든 속성에 대한 생성자 생성
@NoArgsConstructor // 파라미터가 없는 기본 생성자 생성
//entity 패키지 추가 후, Memo 클래스를 정의함.
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id가 사용자가 입력하는 값을 사용하는 경우가 아니면 자동으로 생성되는 번호 사용하기 위한 @GeneratedValue라는 어노테이션 활용함.
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
