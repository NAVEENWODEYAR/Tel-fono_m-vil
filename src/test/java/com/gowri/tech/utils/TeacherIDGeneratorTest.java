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
import java.time.LocalDateTime;

public class TeacherIDGeneratorTest {

    private TeacherIDGenerator teacherIDGenerator;
    private SharedSessionContractImplementor session;

    @BeforeEach
    public void setUp() {
        teacherIDGenerator = new TeacherIDGenerator();
    }

    @Test
    public void testGeneratedTeacherIDFormat() {
        String generatedID = (String) teacherIDGenerator.generate(session, new Object());

        assertNotNull(generatedID, "Generated ID should not be null");
        assertTrue(generatedID.matches("\\d{17}-\\d{3}"), "Generated ID should match the format yyyyMMddHHmmssSSS-XXX");
    }

    @Test
    public void testCounterIncrement() {
        String id1 = (String) teacherIDGenerator.generate(session, new Object());
        String id2 = (String) teacherIDGenerator.generate(session, new Object());

        String counterPart1 = id1.split("-")[1];
        String counterPart2 = id2.split("-")[1];

        int counter1 = Integer.parseInt(counterPart1);
        int counter2 = Integer.parseInt(counterPart2);

        assertEquals(counter1 + 1, counter2, "Counter should increment by 1");
    }

    @Test
    public void testCounterResetsDaily() throws Exception {
        String currentDate = LocalDateTime.now().toLocalDate().toString();
        String oldGeneratedID = (String) teacherIDGenerator.generate(session, new Object());

        Thread.sleep(1000);  // Wait for 1 second to simulate a new "day" in the test (if possible, could be extended for real-day reset)

        String newGeneratedID = (String) teacherIDGenerator.generate(session, new Object());

        String counterPartOld = oldGeneratedID.split("-")[1];
        String counterPartNew = newGeneratedID.split("-")[1];

        int counterOld = Integer.parseInt(counterPartOld);
        int counterNew = Integer.parseInt(counterPartNew);

        assertEquals(1, counterNew, "Counter should reset to 001 on the new day");
    }

    @Test
    public void testGenerateMethodViaReflection() throws Exception {
        Method method = TeacherIDGenerator.class.getDeclaredMethod("generate", SharedSessionContractImplementor.class, Object.class);
        method.setAccessible(true);

        String result = (String) method.invoke(teacherIDGenerator, session, new Object());

        assertNotNull(result, "Generated ID should not be null");
        assertTrue(result.matches("\\d{17}-\\d{3}"), "Generated ID should match the format yyyyMMddHHmmssSSS-XXX");
    }
}
