package com.sample.myBoard.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    // persistence.xml 에서 설정한 영속성 유닛 name
    private static final String PERSISTENCE_UNIT_NAME = "jpaboard";
    private static EntityManagerFactory emf;

    // 엔티티 매니저 팩토리 (싱글톤)
    public static EntityManagerFactory getEmf() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }
}
