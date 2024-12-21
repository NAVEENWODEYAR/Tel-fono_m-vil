package com.gowri.tech.utils;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 21-12-2024
 */
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentIdGeneratorTest {

    private StudentIdGenerator studentIdGenerator;
    private SharedSessionContractImplementor session;

    @BeforeEach
    public void setUp() {
        // Initialize the StudentIdGenerator before each test
        studentIdGenerator = new StudentIdGenerator();
    }

    // Test to validate that the generated Student ID follows the correct format
    @Test
    public void testGeneratedStudentIDFormat() {
        // Generate the Student ID
        String generatedID = (String) studentIdGenerator.generate(session, new Object());

        // The expected format is: yyyyMMddHHmmssSSS-XXX
        assertNotNull(generatedID, "Generated ID should not be null");
        assertTrue(generatedID.matches("\\d{17}-\\d{3}"), "Generated ID should match the format yyyyMMddHHmmssSSS-XXX");
    }

    // Test that the counter increments with each ID generation in the same millisecond
    @Test
    public void testCounterIncrement() {
        String id1 = (String) studentIdGenerator.generate(session, new Object());
        String id2 = (String) studentIdGenerator.generate(session, new Object());

        // Extract the counter part (the part after the dash)
        String counterPart1 = id1.split("-")[1];
        String counterPart2 = id2.split("-")[1];

        // Convert to integers to check if the counter has incremented
        int counter1 = Integer.parseInt(counterPart1);
        int counter2 = Integer.parseInt(counterPart2);

        // The counter should increment by 1
        assertEquals(counter1 + 1, counter2, "Counter should increment by 1");
    }

    // Test that the generated ID is not null
    @Test
    public void testGeneratedIdIsNotNull() {
        String generatedId = (String) studentIdGenerator.generate(session, new Object());
        assertNotNull(generatedId, "Generated Student ID should not be null");
    }

    // Test that the generated ID follows the expected format for a specific date-time
    @Test
    public void testGeneratedIdWithSpecificDateTime() throws Exception {
        // Simulate the current date-time for the test
        String currentDateTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

        String generatedID = (String) studentIdGenerator.generate(session, new Object());

        // Check that the generated ID starts with the correct date-time format
        assertTrue(generatedID.startsWith(currentDateTime), "Generated ID should start with the correct date-time format");
    }

    // Test reflection for invoking the private generate method
    @Test
    public void testGenerateMethodViaReflection() throws Exception {
        // Get the private generate method via reflection
        Method method = StudentIdGenerator.class.getDeclaredMethod("generate", SharedSessionContractImplementor.class, Object.class);
        method.setAccessible(true);

        // Invoke the method using reflection
        String result = (String) method.invoke(studentIdGenerator, session, new Object());

        // Check that the result is not null and follows the correct format
        assertNotNull(result, "Generated ID should not be null");
        assertTrue(result.matches("\\d{17}-\\d{3}"), "Generated ID should match the format yyyyMMddHHmmssSSS-XXX");
    }
}
