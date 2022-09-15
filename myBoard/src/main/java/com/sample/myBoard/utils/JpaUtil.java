package com.sample.myBoard.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    // persistence.xml ���� ������ ���Ӽ� ���� name
    private static final String PERSISTENCE_UNIT_NAME = "jpaboard";
    private static EntityManagerFactory emf;

    // ��ƼƼ �Ŵ��� ���丮 (�̱���)
    public static EntityManagerFactory getEmf() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }
}
