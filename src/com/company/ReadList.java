package com.company;

import com.company.Item;
import com.company.ItemList;

import java.util.Vector;

/**
 * Created by Terryblade on 2016/6/26.
 */
public class ReadList {
    Vector<ItemList>vs;
    public ReadList(){
        vs=new Vector<ItemList>();
    }
    public ReadList(Pos p,ItemList i){
        vs=new Vector<ItemList>();
        String str=p.vs.get(0);
        ItemList il=new ItemList();
        for(String str1:p.vs){
            if(!str.equals(str1)){
                vs.add(il);
                il=new ItemList();
            }
            for(Item it:i.vs){
                if(str1.equals(it.getBarcode())){
                    il.vs.add(it);
                }
            }
            str=str1;
        }
        vs.add(il);
    }

    ReadList(Vector<ItemList>vs){this.vs=vs;}

    public double GetTotal(){
        double result=0;
        for(ItemList lte:vs){
            result+=lte.SubTotal();
        }
        return result;
    }
    public double GetSave(){
        double result=0.00;
        for(ItemList lte:vs){
            result +=lte.Save();
        }
        return result;
    }
    public void Display(){
        double result1=0.00;
        double result2=0.00;
        System.out.println("***商店购物清单***");
        for(ItemList itl:vs) {
            System.out.println("名称:" + itl.vs.get(0).getName() + ",数量：" + itl.vs.size() + itl.vs.get(0).getUnit() + ",单价：" + itl.vs.get(0).getPrice()  + "(元),小计:" + itl.SubTotal() + "(元)");
            //     result1+=itl.SubTotal();
            //     result2+=itl.Save();
        }
        System.out.println("----------------------");
        for(ItemList itl:vs){
            if(itl.vs.size()>2){
                System.out.println("挥泪赠送商品：");
                System.out.println("名称:"+itl.vs.get(0).getName()+",数量:1"+itl.vs.get(0).getUnit());
            }
        }
        result1=GetTotal();
        result2=GetSave();
        System.out.println("----------------------");
        System.out.println("总计:"+result1+"(元)");
        System.out.println("节省:"+result2+"(元)");
    }
}
