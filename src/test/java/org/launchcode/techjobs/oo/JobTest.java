package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.*;

public class JobTest {

    /*@BeforeEach
        public void createJob() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }*/

    @Test
        public void testSettingJobId() {
            Job testCase1 = new Job();
            Job testCase2 = new Job();
            assertNotEquals(testCase1.getId(), testCase2.getId());
    }

    @Test
        public void testJobConstructorSetsAllFields () {

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getName() instanceof String);

        assertEquals(testJob.getEmployer().toString(), "ACME");
        assertEquals(testJob.getLocation().toString(), "Desert");
        assertEquals(testJob.getPositionType().toString(), "Quality control");
        assertEquals(testJob.getCoreCompetency().toString(), "Persistence");
        assertEquals(testJob.getName(), "Product tester");
    }

    @Test
        public void testJobsForEquality () {
            Job testCase3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            Job testCase4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertNotEquals(testCase4, testCase3);
    }

    @Test
        public void testToStringStartsAndEndsWithNewLine () {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.toString().startsWith(System.lineSeparator()), true);
        assertEquals(testJob.toString().endsWith(System.lineSeparator()), true);
    }

    @Test
        public void testToStringContainsCorrectLabelsAndData () {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testCase =
                System.lineSeparator() +
                "ID:  " + testJob.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(testJob.toString(), testCase);
    }

    @Test
        public void testToStringHandlesEmptyField () {
        Job testJob = new Job("Product tester", new Employer(null), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testCase =
                System.lineSeparator() +
                        "ID:  " + testJob.getId() + System.lineSeparator() +
                        "Name: Product tester" + System.lineSeparator() +
                        "Employer: Data not available" + System.lineSeparator() +
                        "Location: Desert" + System.lineSeparator() +
                        "Position Type: Quality control" + System.lineSeparator() +
                        "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(testJob.toString(), testCase);
    }
    //TODO: Create your unit tests here
}
