/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wedjaa.jasper.elasticsearch.adapter;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * @author mrwho
 */
public class ESAdapterImplementationTest extends TestCase {

    private final static String ES_TEST_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static int ES_TEST_STR_LEN = 16;

    public ESAdapterImplementationTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    

    private static String generateRandomString() {

        StringBuilder buffer;
        
        buffer = new StringBuilder();
        
        int charactersLength = ES_TEST_CHARACTERS.length();

        for (int i = 0; i < ES_TEST_STR_LEN; i++) {
            double index = Math.random() * charactersLength;
            buffer.append(ES_TEST_CHARACTERS.charAt((int) index));
        }
        return buffer.toString();
    }

    /**
     * Test of getElasticSearchHost method, of class
     * ESAdapterImplementation.
     */
    public void testGetElasticSearchHost() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchHost(testString);
        Assert.assertEquals(testString, instance.getElasticSearchHost());
    }

    /**
     * Test of getElasticSearchPort method, of class ESAdapterImplementation.
     */
    public void testGetElasticSearchPort() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchPort(testString);
        Assert.assertEquals(testString, instance.getElasticSearchPort());
    }

    /**
     * Test of getElasticSearchUsername method, of class
     * ESAdapterImplementation.
     */
    public void testGetElasticSearchUsername() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchUsername(testString);
        Assert.assertEquals(testString, instance.getElasticSearchUsername());

    }

    /**
     * Test of getElasticSearchPassword method, of class
     * ESAdapterImplementation.
     */
    public void testGetElasticSearchPassword() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchPassword(testString);
        Assert.assertEquals(testString, instance.getElasticSearchPassword());
    }

    /**
     * Test of getElasticSearchIndexes method, of class ESAdapterImplementation.
     */
    public void testGetElasticSearchIndexes() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchIndexes(testString);
        Assert.assertEquals(testString, instance.getElasticSearchIndexes());
    }

    /**
     * Test of getElasticSearchTypes method, of class ESAdapterImplementation.
     */
    public void testGetElasticSearchTypes() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchTypes(testString);
        Assert.assertEquals(testString, instance.getElasticSearchTypes());
    }

    /**
     * Test of getElasticSearchCluster method, of class ESAdapterImplementation.
     */
    public void testGetElasticSearchCluster() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchCluster(testString);
        Assert.assertEquals(testString, instance.getElasticSearchCluster());
    }

    /**
     * Test of getElasticSearchMode method, of class ESAdapterImplementation.
     */
    public void testGetElasticSearchMode() {
        ESAdapterImplementation instance = new ESAdapterImplementation();
        String testString = generateRandomString();
        instance.setElasticSearchMode(testString);
        Assert.assertEquals(testString, instance.getElasticSearchMode());
    }

}
