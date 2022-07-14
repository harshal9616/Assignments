package com.yash.tddassignment;

import java.time.LocalDate;

public class Que14Item {

	
	int itemId;
    String itemName;
    double costPrice;
    double sellPrice;
    LocalDate dom;
    LocalDate doe;

    public Que14Item(int itemId, String itemName, double costPrice, double sellPrice, LocalDate dom, LocalDate doe) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.dom = dom;
        this.doe = doe;
    }

    Que14Item item=null;

    public boolean createObject(Que14Item i)
    {
        if(countDigit(i.itemId)>=3)
            if(i.itemName.matches("[a-zA-Z]+"))
                if(i.sellPrice>0 && i.costPrice>0)
                    if(i.doe!=LocalDate.now())
                        if(i.sellPrice!=i.costPrice)
                            item=new Que14Item(i.itemId,i.itemName,i.costPrice,i.sellPrice,i.dom,i.doe);

        if(item!=null)
            return true;
        else
        return false;

    }

   public int countDigit(int itemId) {

        int count=0;
        while(itemId>0)
        {
            count++;
            itemId/=10;
        }
        return count;
    }
}
