

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    private Property property1;
    private Property property2;
    private Company company;
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
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
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        property1 = new Property("T3 Monte Belo", 150000.0);
        property2 = new Property("T1 Lisboa", 999999.0);
        company = new Company();
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
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());

    }
    @Test
    public void testRegisterClient()
    {
        assertEquals(true, company.registerClient(client1));
    }
    @Test
    public void testRegisterClients()
    {
        assertEquals(true, company.registerClient(client1));
        assertEquals(true, company.registerClient(client2));
    }
    @Test
    public void testRegisterClientDuplicate()
    {
        assertEquals(true, company.registerClient(client1));
        assertEquals(false, company.registerClient(client1));
    }
    @Test
    public void testRegisterClientNull()
    {
        assertEquals(false, company.registerClient(null));
    }
}
