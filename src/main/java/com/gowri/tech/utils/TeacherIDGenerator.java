package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 16-12-2024
 */

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class TeacherIDGenerator implements IdentifierGenerator {

    private static final Logger log = LoggerFactory.getLogger(TeacherIDGenerator.class);
    private static final AtomicInteger counter = new AtomicInteger(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    @Override
    public Object generate(SharedSessionContractImplementor session, Object entity) {
        String teacherId = LocalDateTime.now().format(formatter) + "-" + String.format("%03d", counter.getAndIncrement());
        log.info("Generated Teacher ID: {}", teacherId);
        return teacherId;
    }
}
