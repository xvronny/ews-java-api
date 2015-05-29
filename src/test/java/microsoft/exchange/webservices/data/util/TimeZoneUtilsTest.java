package microsoft.exchange.webservices.data.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class TimeZoneUtilsTest {
  
  @Test
  public void testTimeZoneEmpty() {
    assertNull(TimeZoneUtils.findSystemTimeZoneById(null));
    assertNull(TimeZoneUtils.findSystemTimeZoneById(""));
    assertNull(TimeZoneUtils.findSystemTimeZoneById("Unknown"));
  }
  
  @Test
  public void testStandardTimeZones() {
    
    // from Olson/Java time zone IDs
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("UTC").getId(), "UTC");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("Europe/Amsterdam").getId(), "W. Europe Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("America/New_York").getId(), "Eastern Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("Africa/Johannesburg").getId(), "South Africa Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("Asia/Bangkok").getId(), "SE Asia Standard Time");
  
    // from Microsoft time zone IDs
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("GMT Standard Time").getId(), "GMT Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("Central Europe Standard Time").getId(), "Central Europe Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("Pacific Standard Time").getId(), "Pacific Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("Egypt Standard Time").getId(), "Egypt Standard Time");
    assertEquals(TimeZoneUtils.findSystemTimeZoneById("China Standard Time").getId(), "China Standard Time");
  }

}
