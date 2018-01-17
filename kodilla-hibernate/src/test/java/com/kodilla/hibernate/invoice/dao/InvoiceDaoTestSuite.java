package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("20180106/22");

        Product scissors = new Product("scissors");
        Product pen = new Product("pen");
        Product paper = new Product("paper");
        Product notebook = new Product("notebook");

        Item itemScissors = new Item(scissors, new BigDecimal(2), 5);
        Item itemPen = new Item(pen, new BigDecimal(8), 10);
        Item itemPaper = new Item(paper, new BigDecimal(50), 1000);
        Item itemNotebook = new Item(notebook, new BigDecimal(60), 40);

        itemScissors.setInvoice(invoice);
        itemPen.setInvoice(invoice);
        itemPaper.setInvoice(invoice);
        itemNotebook.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemScissors);
        items.add(itemPen);
        items.add(itemPaper);
        items.add(itemNotebook);

        invoice.setItems(items);

        //When
        int itemSize = invoice.getItems().size();

        //Then
        Assert.assertEquals(4, itemSize);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}