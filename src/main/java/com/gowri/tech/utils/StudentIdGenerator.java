package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentIdGenerator implements IdentifierGenerator {

    private static final Logger log = LoggerFactory.getLogger(StudentIdGenerator.class);

    private static final long serialVersionUID = 1L;

    // Atomic counter to ensure uniqueness for IDs generated in the same millisecond
    private static final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        log.info("Generating Student ID with Date, Time and Incremented Counter");

        // Get current date and time in yyyyMMddHHmmssSSS format (up to milliseconds)
        String currentDateTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

        // Get the incremented value for the same millisecond
        int incrementedValue = counter.getAndIncrement();

        // Format the Student ID as: "yyyyMMddHHmmssSSS-COUNTER"
        String studentId = currentDateTime + "-" + String.format("%03d", incrementedValue);

        log.info("Generated Student ID: {}", studentId);

        return studentId;
    }
}
