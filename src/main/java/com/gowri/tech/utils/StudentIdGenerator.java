package com.gowri.tech.utils;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

public class StudentIdGenerator implements IdentifierGenerator {
    private static final Logger log = LoggerFactory.getLogger(StudentIdGenerator.class);
    private static final long serialVersionUID = 1L;
    private static final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        log.info("Generating Student ID with Date, Time and Incremented Counter");

        String currentDateTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

        int incrementedValue = counter.getAndIncrement();

        String studentId = currentDateTime + "-" + String.format("%03d", incrementedValue);

        log.info("Generated Student ID: {}", studentId);

        return studentId;
    }
}
