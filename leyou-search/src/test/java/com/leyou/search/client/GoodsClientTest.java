package com.leyou.search.client;

import com.leyou.item.poji.TbSku;
import com.leyou.search.LeyouSearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeyouSearchService.class)
public class GoodsClientTest {
    @Autowired
    private GoodsClient goodsClient;


    @Test
    public void testQueryCategories() {
        List<TbSku> tbSkus = goodsClient.querySkusBySpuId(2l);
        tbSkus.forEach(System.out::println);
    }

}