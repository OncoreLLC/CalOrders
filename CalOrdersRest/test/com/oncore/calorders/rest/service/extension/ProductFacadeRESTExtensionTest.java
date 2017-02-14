/*
 * The MIT License
 *
 * Copyright 2017 OnCore Consulting LLC, 2017
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.oncore.calorders.rest.service.extension;

import com.oncore.calorders.rest.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 *
 * @author oncore
 */
public class ProductFacadeRESTExtensionTest {

    public ProductFacadeRESTExtensionTest() {
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testFindActiveProductsByProductType() throws Exception {

        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "11111", "Desktop 1", "DT1", "Desktop PC 1", new BigDecimal(100.00), 1, "1", new Date(), "1", new Date()));
        productsList.add(new Product(2, "22222", "Laptop 1", "LT1", "Laptop PC 1", new BigDecimal(1000.00), 1, "1", new Date(), "1", new Date()));
        productsList.add(new Product(3, "33333", "Desktop 2", "DT2", "Desktop PC 2", new BigDecimal(200.00), 0, "1", new Date(), "1", new Date()));

        EntityManager mockedEm = mock(EntityManager.class);
        TypedQuery mockedTypedQuery = mock(TypedQuery.class);

        given(mockedEm.createQuery("SELECT p FROM Product p "
                + "        JOIN p.prdCategoryCd c"
                + "        WHERE c.code = :categoryCode "
                + "        AND p.prdActiveInd = 1", Product.class)).willReturn(mockedTypedQuery);
        given(mockedTypedQuery.setParameter("categoryCode", "HDW")).willReturn(mockedTypedQuery);
        given(mockedTypedQuery.getResultList()).willReturn(productsList);

        ProductFacadeRESTExtension productFacadeRESTExtension = new ProductFacadeRESTExtension(mockedEm);

        List<Product> expectedProductsList = productFacadeRESTExtension.findActiveProductsByProductType("HDW");

        Assert.assertTrue(expectedProductsList.size() == 3);
        Assert.assertEquals("Desktop 1", expectedProductsList.get(0).getPrdName());
        Assert.assertEquals("Desktop PC 1", expectedProductsList.get(0).getPrdLongDesc());
        Assert.assertEquals("11111", expectedProductsList.get(0).getPrdSku());
        Assert.assertEquals(1, expectedProductsList.get(0).getPrdActiveInd());

        Assert.assertEquals("Laptop 1", expectedProductsList.get(1).getPrdName());
        Assert.assertEquals("Laptop PC 1", expectedProductsList.get(1).getPrdLongDesc());
        Assert.assertEquals("22222", expectedProductsList.get(1).getPrdSku());
        Assert.assertEquals(1, expectedProductsList.get(1).getPrdActiveInd());

        Assert.assertEquals("Desktop 2", expectedProductsList.get(2).getPrdName());
        Assert.assertEquals("Desktop PC 2", expectedProductsList.get(2).getPrdLongDesc());
        Assert.assertEquals("33333", expectedProductsList.get(2).getPrdSku());
        Assert.assertEquals(0, expectedProductsList.get(2).getPrdActiveInd());

        //need more assertions
        verify(mockedEm, times(1)).createQuery("SELECT p FROM Product p "
                + "        JOIN p.prdCategoryCd c"
                + "        WHERE c.code = :categoryCode "
                + "        AND p.prdActiveInd = 1", Product.class);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testDoesProductNameExist() throws Exception {
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "11111", "Desktop 1", "DT1", "Desktop PC 1", new BigDecimal(100.00), 1, "1", new Date(), "1", new Date()));

        EntityManager mockedEm = mock(EntityManager.class);
        TypedQuery mockedTypedQuery = mock(TypedQuery.class);

        given(mockedEm.createNamedQuery("Product.findByPrdName", Product.class)).willReturn(mockedTypedQuery);
        given(mockedTypedQuery.setParameter("prdName", "Desktop 1")).willReturn(mockedTypedQuery);
        given(mockedTypedQuery.getResultList()).willReturn(productsList);

        ProductFacadeRESTExtension productFacadeRESTExtension = new ProductFacadeRESTExtension(mockedEm);

        List<Product> expectedProductsList = productFacadeRESTExtension.doesProductNameExist("Desktop 1");

        Assert.assertTrue(expectedProductsList.size() == 1);
        Assert.assertEquals("Desktop 1", expectedProductsList.get(0).getPrdName());
        Assert.assertEquals("Desktop PC 1", expectedProductsList.get(0).getPrdLongDesc());
        Assert.assertEquals("11111", expectedProductsList.get(0).getPrdSku());
        Assert.assertEquals(1, expectedProductsList.get(0).getPrdActiveInd());

        //need more assertions
        verify(mockedEm, times(1)).createNamedQuery("Product.findByPrdName", Product.class);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}