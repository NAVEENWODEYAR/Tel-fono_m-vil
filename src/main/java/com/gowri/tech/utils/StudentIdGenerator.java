package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serial;
import java.util.UUID;

public class StudentIdGenerator implements IdentifierGenerator {

    private static final Logger log = LoggerFactory.getLogger(StudentIdGenerator.class);
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        log.info("Generating UUID");
        return "PR_" + UUID.randomUUID().toString();
    }
}
