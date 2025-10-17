package tests;

import ch13.ex1.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class VehicleSpeedMonitorV2Test {
    @Test
    void testCarBelowLimit_ShouldPrintSpeedOK() throws Exception {
        String input = "car\n90\n-1\n"; //input with: car NEW LINE 90 NEW LINE -1
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));

        VehicleSpeedMonitorV2.main(new String[]{});

        String output = outputStream.toString();

        assertFalse(output.contains("Speed OK"));
        assertTrue(output.contains("Exiting system"));


    }

}
