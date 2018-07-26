package com.zzh.mvc;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MvcApplicationTests
{
    private  List<Integer> integerList= Lists.newArrayList();

    @Before
    public  void init(){
        integerList.add(1);
        integerList.add(4);
        integerList.add(2);
        integerList.add(9);
        integerList.add(100);
        integerList.add(0);
        integerList.add(-1);
    }

    @Test
    public void contextLoads()
    {


    }


    @Test
    public void testStream(){
        List<Integer> sortedList = integerList.stream().sorted((e1,e2)->e1-e2).collect(Collectors.toList());
        sortedList.stream().forEach(e->{
            System.out.println(e);
        });
    }
    
}
