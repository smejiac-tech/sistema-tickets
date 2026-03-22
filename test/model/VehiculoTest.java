/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ronal
 */
public class VehiculoTest {
    
    public VehiculoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPlaca method, of class Vehiculo.
     */
    @org.junit.jupiter.api.Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Vehiculo instance = new VehiculoImpl();
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hayCupos method, of class Vehiculo.
     */
    @org.junit.jupiter.api.Test
    public void testHayCupos() {
        System.out.println("hayCupos");
        Vehiculo instance = new VehiculoImpl();
        boolean expResult = false;
        boolean result = instance.hayCupos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirPasajero method, of class Vehiculo.
     */
    @org.junit.jupiter.api.Test
    public void testSubirPasajero() {
        System.out.println("subirPasajero");
        Vehiculo instance = new VehiculoImpl();
        instance.subirPasajero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuta method, of class Vehiculo.
     */
    @org.junit.jupiter.api.Test
    public void testGetRuta() {
        System.out.println("getRuta");
        Vehiculo instance = new VehiculoImpl();
        instance.getRuta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacidadDisponible method, of class Vehiculo.
     */
    @org.junit.jupiter.api.Test
    public void testGetCapacidadDisponible() {
        System.out.println("getCapacidadDisponible");
        Vehiculo instance = new VehiculoImpl();
        instance.getCapacidadDisponible();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarifa method, of class Vehiculo.
     */
    @org.junit.jupiter.api.Test
    public void testGetTarifa() {
        System.out.println("getTarifa");
        Vehiculo instance = new VehiculoImpl();
        double expResult = 0.0;
        double result = instance.getTarifa();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VehiculoImpl extends Vehiculo {
    }
    
}
