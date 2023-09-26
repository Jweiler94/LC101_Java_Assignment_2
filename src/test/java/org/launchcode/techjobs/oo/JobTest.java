package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

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

        assertTrue(testJob.getEmployer() != null);
        assertTrue(testJob.getLocation() != null);
        assertTrue(testJob.getPositionType() != null);
        assertTrue(testJob.getCoreCompetency() != null);
        assertTrue(testJob.getName() != null);

        assertEquals(testJob.getEmployer(), "Acme");
        assertEquals(testJob.getLocation(), "Desert");
        assertEquals(testJob.getPositionType(), "Quality control");
        assertEquals(testJobs.getCoreCompetency(), "Persistence");

    }
    //TODO: Create your unit tests here
}
