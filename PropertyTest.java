

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void testConstructor(){
        String description = "T3 Monte Belo";
        double price = 150000.0;
        
        Property  property1 = new Property(description, price);
        
        assertEquals(description, property1.getDescription());
        assertEquals(price, property1.getPrice());
    }
}
