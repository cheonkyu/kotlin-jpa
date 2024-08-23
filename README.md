# kotlin-JPA

코틀린으로 JPA 예제 코드 실행 해보기

[자바ORM표준프로그래밍](https://github.com/holyeye/jpabook) 챕터2 자바코드 코틀린으로 전환

## 프로젝트 생성

```sh
gradle init         
Starting a Gradle Daemon (subsequent builds will be faster)

Found existing files in the project directory: '/Users/keke/jpa'.
Directory will be modified and existing files may be o                       verwritten.  Continue? (default: no) [yes, no] yes

Select type of build to generate:
  1: Application
  2: Library
  3: Gradle plugin
  4: Basic (build structure only)
Enter selection (default: Application) [1..4] 1

Select implementation language:
  1: Java
  2: Kotlin
  3: Groovy
  4: Scala
  5: C++
  6: Swift
Enter selection (default: Java) [1..6] 2

Enter target Java version (min: 7, default: 21): 21

Project name (default: jpa): 

Select application structure:
  1: Single application project
  2: Application and library project
Enter selection (default: Single application project) [1..2] 1

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 1

Select test framework:
  1: kotlin.test
  2: JUnit Jupiter
Enter selection (default: kotlin.test) [1..2] 1

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no


> Task :init
Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10/samples/sample_building_kotlin_applications.html

BUILD SUCCESSFUL in 49s
1 actionable task: 1 executed

```


## 프로젝트 실행

```sh
% ./gradlew run

> Task :app:run
8월 23, 2024 11:14:08 오전 org.hibernate.ejb.HibernatePersistence logDeprecation
WARN: HHH015016: Encountered a deprecated javax.persistence.spi.PersistenceProvider [org.hibernate.ejb.HibernatePersistence]; use [org.hibernate.jpa.HibernatePersistenceProvider] instead.
8월 23, 2024 11:14:08 오전 org.hibernate.ejb.HibernatePersistence logDeprecation
WARN: HHH015016: Encountered a deprecated javax.persistence.spi.PersistenceProvider [org.hibernate.ejb.HibernatePersistence]; use [org.hibernate.jpa.HibernatePersistenceProvider] instead.
8월 23, 2024 11:14:08 오전 org.hibernate.ejb.HibernatePersistence logDeprecation
WARN: HHH015016: Encountered a deprecated javax.persistence.spi.PersistenceProvider [org.hibernate.ejb.HibernatePersistence]; use [org.hibernate.jpa.HibernatePersistenceProvider] instead.
8월 23, 2024 11:14:08 오전 org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH000204: Processing PersistenceUnitInfo [
        name: jpabook
        ...]
8월 23, 2024 11:14:08 오전 org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {4.3.10.Final}
8월 23, 2024 11:14:08 오전 org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
8월 23, 2024 11:14:08 오전 org.hibernate.cfg.Environment buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : javassist
8월 23, 2024 11:14:08 오전 org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {4.0.5.Final}
8월 23, 2024 11:14:08 오전 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH000402: Using Hibernate built-in connection pool (not for production use!)
8월 23, 2024 11:14:08 오전 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH000401: using driver [org.h2.Driver] at URL [jdbc:h2:tcp://localhost:1521/test]
8월 23, 2024 11:14:08 오전 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH000046: Connection properties: {password=****, user=sa}
8월 23, 2024 11:14:08 오전 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH000006: Autocommit mode: false
8월 23, 2024 11:14:08 오전 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
8월 23, 2024 11:14:08 오전 org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
8월 23, 2024 11:14:08 오전 org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory <init>
INFO: HHH000397: Using ASTQueryTranslatorFactory
8월 23, 2024 11:14:08 오전 org.hibernate.tuple.PojoInstantiator <init>
INFO: HHH000182: No default (no-argument) constructor for class: jpabook.start.Member (class must be instantiated by Interceptor)
findMember=지한, age=20
Hibernate: 
    /* insert jpabook.start.Member
        */ insert 
        into
            MEMBER
            (age, NAME, ID) 
        values
            (?, ?, ?)
Hibernate: 
    /* update
        jpabook.start.Member */ update
            MEMBER 
        set
            age=?,
            NAME=? 
        where
            ID=?
Hibernate: 
    /* select
        m 
    from
        Member m */ select
            member0_.ID as ID1_0_,
            member0_.age as age2_0_,
            member0_.NAME as NAME3_0_ 
        from
            MEMBER member0_
members.size=1
Hibernate: 
    /* delete jpabook.start.Member */ delete 
        from
            MEMBER 
        where
            ID=?
8월 23, 2024 11:14:08 오전 org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl stop
INFO: HHH000030: Cleaning up connection pool [jdbc:h2:tcp://localhost:1521/test]

BUILD SUCCESSFUL in 1s
3 actionable tasks: 1 executed, 2 up-to-date
```

## Reference

https://www.inflearn.com/community/questions/17098/unknown-entity-오류
