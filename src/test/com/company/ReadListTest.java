package test.com.company; 

import com.company.ItemList;
import com.company.Pos;
import com.company.ReadList;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ReadList Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 27, 2016</pre> 
* @version 1.0 
*/ 
public class ReadListTest { 

@Before
public void before() throws Exception {
    System.out.println("before");
} 

@After
public void after() throws Exception {
    System.out.println("after");
} 

/** 
* 
* Method: GetTotal() 
* 
*/ 
@Test
public void testGetTotal() throws Exception { 
//TODO: Test goes here...
    String arg1="E:\\1234.txt";
    String arg2="E:\\123.txt";
    ItemList s=new ItemList(arg1);
    Pos p=new Pos(arg2);
    ReadList rd=new ReadList(p,s);
    System.out.println(rd.GetTotal());
} 

/** 
* 
* Method: GetSave() 
* 
*/ 
@Test
public void testGetSave() throws Exception { 
//TODO: Test goes here...
    String arg1="E:\\1234.txt";
    String arg2="E:\\123.txt";
    ItemList s=new ItemList(arg1);
    Pos p=new Pos(arg2);
    ReadList rd=new ReadList(p,s);
    System.out.println(rd.GetSave());
} 

/** 
* 
* Method: Display() 
* 
*/ 
@Test
public void testDisplay() throws Exception { 
//TODO: Test goes here...
    String arg1="E:\\1234.txt";
    String arg2="E:\\123.txt";
    ItemList s=new ItemList(arg1);
    Pos p=new Pos(arg2);
    ReadList rd=new ReadList(p,s);
    rd.Display();
} 


} 
