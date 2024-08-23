package jpabook.start

import javax.persistence.*

@Entity
@Table(name="MEMBER")
data class Member (
    @Id
    @Column(name = "ID")
    var id: String,
    @Column(name = "NAME")
    var username: String,
    var age: Int,
)
